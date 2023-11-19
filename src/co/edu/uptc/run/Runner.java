package co.edu.uptc.run;

import co.edu.uptc.control.*;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AlbumControl a1 = new AlbumControl();
		String response;
		boolean responseBool;
		String name;
		String cover;
		String description;
		int hours,minutes,seconds,year,month,date,n=0,response1;
		String genre;
		
		System.out.println("do you want to create a new album?");
		do	
		{
		System.out.println("write y or n");
		
		response = sc.next();
		
		if(response.equals("y") || response.equals("n")) {
			responseBool=true;
		}else {
			responseBool=false;
		}
		
		}while(responseBool != true);
<<<<<<< HEAD
		if(responseBool = true) 
		{
			System.out.println("how many albums do you want to create");
			n = sc.nextInt();
			a1.setArrayAlbum(n);
			for(int i=0;i<n;i++)
			{
				System.out.println("put the name of the album");
				name =sc.next();
				System.out.println("put the image url ");
				cover=sc.next();
				System.out.println("write the album description");
				description=sc.next();
				System.out.println("put the hours of the album");
				hours = sc.nextInt();
				System.out.println("put the minutes of the album");
				minutes=sc.nextInt();
				System.out.println("put the seconds of the album");
				seconds=sc.nextInt();
				System.out.println("put the year that was released the album");
				year=sc.nextInt();
				System.out.println("put the month(1-12) that was released the album");
				month=sc.nextInt()-1;
				System.out.println("put the day that was released the album");
				date=sc.nextInt();
				System.out.println("write the genre of the album");
				genre=sc.next();
				a1.createAlbum(name, cover, description, year, month, date, genre, hours,minutes, seconds,i);
			}
		}
		System.out.println("Chosse the option");
		System.out.println("1 Show the list album");
		response1=sc.nextInt();
		if(response1==1) {
			for(int i=0;i<n;i++) {
				System.out.println(" ");
				a1.listAlbum(i);
			}
		}

=======
		detailAlbum(sc);
		
		
		System.out.println("Do you want edit the album");
		System.out.println("write y or n");
		
		response = sc.next();
		if(response.equals("y")) {
			detailAlbum(sc);
		}else {
			System.out.println("bye");
		}
		
	}
	public static void detailAlbum(Scanner sc) {
		AlbumControl a1 = new AlbumControl();
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
		a1.createAlbum(name, cover, description, year, month, date, genre, hours, minutes, seconds);
		a1.showAlbum();
>>>>>>> 1f52e49cad85d6c432b995f7eae431b97e78f04e
	}
}
