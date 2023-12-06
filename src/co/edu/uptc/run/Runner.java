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
		boolean responseBool, x = false;
		String name, nameSong, yearRelease;
		String username, tellphone, email, password;
		String cover;
		String description;
		int hours,minutes,seconds,year,month,date,n=0,response1,lengthSongs=0 , opcC, comments = 0, opc = 0, m, raiting;
		String genre, genreSong;
		String raitcad, message;
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
			while(x == false) {
			System.out.println("1.Do you want to show the songs of the albm ");
			System.out.println("2.Do you want to show the message of the album");
			System.out.println("3. reutrn albums");
			opc = sc.nextInt();
			if(opc == 1) {
				for(int i=0;i<lengthSongs;i++){
					System.out.println("song "+(i+1));
					Sco.listSongs(i);
				}
				System.out.println("How many songs do you want to create");
				lengthSongs=sc.nextInt();
				Sco.setArrayAlbum(lengthSongs);
				for(int i=0;i<lengthSongs;i++) {
					Sco.detailSong(sc, i);
				}
				System.out.println("Chosse the option");
				System.out.println("1 edit song");
				System.out.println("2 delete song");
				response1=sc.nextInt();
				if(response1 == 1) {		
					for(int i=0;i<lengthSongs;i++){
					System.out.println("song "+(i+1));
					Sco.listSongs(i);
				}
					Sco.detailSong(sc, response1);
					Sco.listSongs(response1);	
					
				}else if(response1 == 2){
					for(int i=0;i<lengthSongs;i++)
					{
						System.out.println("song "+(i+1));
						Sco.listSongs(i);
					}
					System.out.println("Which song do you wanto to edit?");
					response1=sc.nextInt();
					
					Sco.delateSong(response1);
					Sco.listSongs(response1);
				}
				
			}else if(opc ==2 ) {
				n = n +1;
				cc.detailmesage(sc, n);
				for(int i=0;i<comments;i++){
					System.out.println("message "+(i+1));
					cc.setArrayMessage(i);
					cc.listMessgae(i);
				}
				cc.detailmesage(sc, n);
								
			}else {
				x = true;
			}
			}
		}else {
		}
			
			
			
			
	
	

				
	

			
			}
	
	}

