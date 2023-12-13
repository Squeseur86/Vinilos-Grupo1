package co.edu.uptc.control;

import java.util.Scanner;


import co.edu.uptc.model.Album;

public class AlbumControl {
	
	static Album a1 = new Album();
	static CollectorControl cc = new CollectorControl();
	
	public AlbumControl(){
		a1=new Album();
	}
	 
	public static void createAlbum(String name,String cover,String description,int year,int month,int date,String genre,int hours,int minutes,int seconds,int n) {
		
		a1.setName(name,n);
		a1.setCover(cover,n);
		a1.setDescription(description,n);
		a1.setReleaseDate(year, month, date,n);
		a1.setGenre(genre,n);
		a1.setRecordLabel(hours, minutes, seconds,n);	
	}
	public void listAlbum(int n) {
		System.out.println(n+1+" Album name: "+a1.getName(n) );
		System.out.println("cover: "+a1.getCover(n) );
		System.out.println("description: "+a1.getDescription(n) );
		System.out.println("realse date: "+a1.getReleaseDate(n) );
		System.out.println("genre: "+a1.getGenre(n) );
		System.out.println("Record Label: "+a1.getRecordLabel(n) );	
	}
	public static void detailAlbum(Scanner sc,int n) {
		System.out.println("put the name of the album");
		String name =sc.next();
		System.out.println("put the image url ");
		String cover=sc.next();
		System.out.println("write the album description");
		String description=sc.next();
		System.out.println("put the hours of the album");
		int hours = sc.nextInt();
		System.out.println("put the minutes of the album");
		int minutes=sc.nextInt();
		System.out.println("put the seconds of the album");
		int seconds=sc.nextInt();
		System.out.println("put the year that was released the album");
		int year=sc.nextInt();
		System.out.println("put the month(1-12) that was released the album");
		int month=sc.nextInt()-1;
		System.out.println("put the day that was released the album");
		int date=sc.nextInt();
		System.out.println("write the genre of the album");
		String genre=sc.next();
		createAlbum(name, cover, description, year, month, date, genre, hours, minutes, seconds,n);
	}
	public void setArrayAlbum(int n) {
		a1.setArrays(n);
	}
	public void deleteAlbum(int n) {
		a1.setName("",n);
		a1.setCover("",n);
		a1.setDescription("",n);
		a1.restartDate(n);
		a1.setGenre("",n);
		a1.setRecordLabel(0,0,0,n);	
	}
	public void setPrices(int price,int n) {
		a1.setPrice(price, n);
	}
	public void getPrice(int n) {
		a1.getPrice(n);
	}
	public String purchasingAlbum(int response)
	{
		if(a1.getPrice(response-1)==0)
		{
			return null;
		}else {
			System.out.println("Album purchased");
			return a1.getName(response-1);
		}
	}
	public void listAlbNames(int n)
	{
		System.out.println((n+1)+" "+a1.getName(n));
	}
}
