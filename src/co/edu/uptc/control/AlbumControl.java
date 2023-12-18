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
		System.out.println((n+1)+" Album name: "+a1.getName(n) );
		System.out.println("cover: "+a1.getCover(n) );
		System.out.println("description: "+a1.getDescription(n) );
		System.out.println("realse date: "+a1.getReleaseDate(n) );
		System.out.println("genre: "+a1.getGenre(n) );
		System.out.println("Record Label: "+a1.getRecordLabel(n) );	
	}
	public static void detailAlbum(Scanner sc,int n) {
		boolean numberVerif=true;
		System.out.println("put the name of the album");
		String name =sc.nextLine();
		System.out.println("put the image url ");
		String cover=sc.nextLine();
		System.out.println("write the album description");
		String description=sc.nextLine();
		int hours=0;
		while(numberVerif)
		{
			System.out.println("put the hours of the album");
			String hoursString=sc.nextLine();
			try {
				hours=Integer.parseInt(hoursString);
				numberVerif=false;
			}catch(NumberFormatException e){
				System.out.println("the hours needs to be a number");
			}
		}
		numberVerif=true;
		int minutes=0;
		while(numberVerif)
		{
			System.out.println("put the minutes of the album");
			String minutesString=sc.nextLine();
			try {
				minutes=Integer.parseInt(minutesString);
				numberVerif=false;
			}catch(NumberFormatException e){
				System.out.println("the minutes needs to be a number");
			}
		}
		numberVerif=true;
		int seconds=0;
		while(numberVerif)
		{
			System.out.println("put the seconds of the album");
			String secondsString=sc.nextLine();
			try {
				seconds=Integer.parseInt(secondsString);
				numberVerif=false;
			}catch(NumberFormatException e){
				System.out.println("the seconds needs to be a number");
			}
		}
		numberVerif=true;
		int year=0;
		while(numberVerif)
		{
			System.out.println("put the year of the album");
			String yearString=sc.nextLine();
			try {
				year=Integer.parseInt(yearString);
				numberVerif=false;
			}catch(NumberFormatException e){
				System.out.println("the year needs to be a number");
			}
		}
		
		numberVerif=true;
		int month=0;
		while(numberVerif)
		{
			System.out.println("put the month of the album");
			String monthString=sc.nextLine();
			try {
				month=Integer.parseInt(monthString);
				numberVerif=false;
			}catch(NumberFormatException e){
				System.out.println("the month needs to be a number");
			}
		}
		numberVerif=true;
		int date=0;
		while(numberVerif)
		{
			System.out.println("put the day of the album");
			String dateString=sc.nextLine();
			try {
				date=Integer.parseInt(dateString);
				numberVerif=false;
			}catch(NumberFormatException e){
				System.out.println("the day needs to be a number");
			}
		}
		System.out.println("write the genre of the album");
		String genre=sc.nextLine();
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
		if(a1.getPrice(response)==0)
		{
			return null;
		}else {
			System.out.println("Album purchased");
			return a1.getName(response-1);
		}
	}
	public String nullAlbum (int n) {
		String albumNull=a1.getName(n);
		return albumNull;
	}
	public void listAlbNames(int n)
	{
		System.out.println((n+1)+" "+a1.getName(n));
		
	}
}
