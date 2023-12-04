 package co.edu.uptc.run;

import co.edu.uptc.control.*;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AlbumControl a1 = new AlbumControl();
		SongControl Sco = new SongControl();
		CollectorControl cc = new CollectorControl();
		String response, option;
		boolean responseBool, x;
		String name, nameSong, yearRelease;
		String username, tellphone, email, password, message;
		String cover;
		String description;
		int hours,minutes,seconds,year,month,date,n=0,response1;
		String genre, genreSong;
		System.out.println("Welcome to the vinyl store, regsister");
		System.out.println("enter your username");
		username = sc.next();
		System.out.println("enter your number tellphone ten digits");
		tellphone = sc.next();
		while(tellphone.length()!=10) {
			System.out.println("this number tellphone is invalid");
			tellphone = sc.next();
		}
		System.out.println("enter your email ....@gmail.com");
		email = sc.next() + "@gmail.com ";
		System.out.println("enter your password 8 charts");
		password = sc.next();
		while(password.length()<8) {
			System.out.println("this password is invalid");
			password = sc.next();
		}
		cc.registCollector(username, tellphone, email, password);
		System.out.println("do you want to create a new album?");
		do{
		System.out.println("write y or n");
		
		response = sc.next();
		
		if(response.equals("y") || response.equals("n")) {
			responseBool=true;
		}else {
			responseBool=false;
		}
		
		}while(responseBool != true);

		if(responseBool = true) 
		{
			System.out.println("how many albums do you want to create");
			n = sc.nextInt();
			a1.setArrayAlbum(n);
			for(int i=0;i<n;i++)
			{
				a1.detailAlbum(sc,i);
			}
		}
		System.out.println("Chosse the option");
		System.out.println("1 edit album");
		System.out.println("2 delete album");
		System.out.println("3 continue album");
		for(int i=0;i<n;i++) {
			System.out.println(" ");
			a1.listAlbum(i);
		}
		response1=sc.nextInt();
		if(response1==1) {
			System.out.println("which album do yo want to edit");
			for(int i=0;i<n;i++) {
				System.out.println(" ");
				a1.listAlbum(i);
			}
			n=sc.nextInt();
			a1.detailAlbum(sc,n-1);
		}else if(response1==2) {
			System.out.println("which album do yo want to delete");
			for(int i=0;i<n;i++) {
				System.out.println(" ");
				a1.listAlbum(i);
			}
			n=sc.nextInt();
			a1.deleteAlbum(n-1);
			a1.listAlbum(n-1);
		}else if(response1==3){
			System.out.println("1.Do you want to show the songs of the albm ");
			System.out.println("2.Do you want to show the message of the album");


		}else if( response1 ==4){
			System.out.println("which album do yo want to let a message");
			for(int i=0;i<n;i++) {
				System.out.println(" ");
				a1.listAlbum(i);
			}
		n = sc.nextInt();
		a1.listAlbum(n-1);
		int raiting = sc.nextInt();
		while(raiting<=0 && raiting > 5) {
			System.out.println("This raiting is invalid");
			raiting = sc.nextInt();
		}
		message = sc.next();
		cc.createMessage(message, raiting);	
		}else {
			
			do {
			System.out.println("write y or n");
			option = sc.next();
			if(option.equals("y")){
				x= true;
			}else {
				x= false;
			}
			}while(x == false);
			System.out.println("put the name of the song");
			nameSong = sc.next();
			System.out.println("put the year relase of the song");
			yearRelease = sc.next();
			System.out.println("put the genre of the song");
			genreSong = sc.next();
			System.out.println("put the minutes of the song");
			minutes=sc.nextInt();
			System.out.println("put the seconds of the song");
			seconds=sc.nextInt();
			Sco.createSong(nameSong, yearRelease, genreSong, minutes, seconds);
			Sco.showSong();
			System.out.println("Chosse the option");
			System.out.println("1 Show the list song");
			System.out.println("2 edit song");
			System.out.println("3 delete song");
			response1=sc.nextInt();
			if(response1 == 1) {
				
			}else if(response1 == 2){				
				//TODO:logica de mostrar listado y elegir cancion
				System.out.println("put the name of the song");
				nameSong = sc.next();
				System.out.println("put the year relase of the song");
				yearRelease = sc.next();
				System.out.println("put the genre of the song");
				genreSong = sc.next();
				System.out.println("put the minutes of the song");
				minutes=sc.nextInt();
				System.out.println("put the seconds of the song");
				seconds=sc.nextInt();
				
				Sco.EditSong(nameSong, yearRelease, genreSong, minutes, seconds);
				Sco.showSong();		
			}else if(response1 == 3) {
				Sco.delateSong();
				Sco.showSong();
			}
			}
	
	}
}
