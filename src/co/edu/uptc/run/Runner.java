 package co.edu.uptc.run;

import co.edu.uptc.control.*;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AlbumControl a1 = new AlbumControl();
		SongControl Sco = new SongControl();
		CollectorControl cc = new CollectorControl();
		String response;
		String option;
		boolean responseBool,exit=true, x = false;
		String name, nameSong, yearRelease;
		String username, tellphone, email, password;
		String cover;
		int purcharse=0;
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
		cc.setArrayMessage(100);
		
		while(exit)
		{
			showMenu();
			System.out.println("Choose the option");
			option=sc.next();
			
			switch(option)
			{
				case "1":
					System.out.println("how many albums do you want to create");
					n = sc.nextInt();
					a1.setArrayAlbum(n);
					for(int i=0;i<n;i++)
					{
						a1.detailAlbum(sc,i);
					}
					break;
				case "2":
					System.out.println("Choose the option");
					System.out.println("1 edit album");
					System.out.println("2 delete album");
					System.out.println("3 set price for an album");
					option=sc.next();
					switch(option)
					{
						case "1":
							System.out.println("which album do yo want to edit");
							for(int i=0;i<n;i++) {
								System.out.println(" ");
								a1.listAlbum(i);
							}
							n=sc.nextInt();
							a1.detailAlbum(sc,n-1);
							break;
						case "2":
							System.out.println("which album do yo want to delete");
							for(int i=0;i<n;i++) {
								System.out.println(" ");
								a1.listAlbum(i);
							}
							n=sc.nextInt();
							a1.deleteAlbum(n-1);
							a1.listAlbum(n-1);
							break;
						case "3":
							for(int i=0;i<n;i++)
							{
								int price;
								a1.listAlbum(i);
								System.out.println("Set price");
								price=sc.nextInt();
								a1.setPrices(price, i);
							}
							break;
					}
					break;
				case "3":
					System.out.println("How many songs do you want to create");
					lengthSongs=sc.nextInt();
					Sco.setArrayAlbum(lengthSongs);
					for(int i=0;i<lengthSongs;i++) {
						Sco.detailSong(sc, i);
					}
					break;
				case "4":
					System.out.println("Choose the option");
					System.out.println("1 edit song");
					System.out.println("2 delete song");
					option=sc.next();
					
					switch(option)
					{
						case "1":
							for(int i=0;i<lengthSongs;i++){
								System.out.println("song "+(i+1));
								Sco.listSongs(i);
							}
							System.out.println("Choose the song");
							response1=sc.nextInt();
								Sco.detailSong(sc, response1);
								Sco.listSongs(response1);	
							break;
						case "2":
							for(int i=0;i<lengthSongs;i++)
							{
								System.out.println("song "+(i+1));
								Sco.listSongs(i);
							}
							System.out.println("Which song do you wanto to edit?");
							response1=sc.nextInt();
							
							Sco.delateSong(response1);
							Sco.listSongs(response1);
							break;
						
					}
					break;
				case "5":
					System.out.println("verify your identity");
					System.out.println("Insert your username");
					username=sc.next();
					System.out.println("Insert your password");
					password=sc.next();
					while(cc.verifyCollector(username, password))
					{
						System.out.println("verify your identity");
						System.out.println("Insert your username");
						username=sc.next();
						System.out.println("Insert your password");
						password=sc.next();
					}
					while(exit)
					{
					cc.collectorMenuShop();
					option=sc.next();
					switch(option)
					{
						case "1":
							for(int i=0;i<n;i++) {
								a1.listAlbum(i);
								Sco.listSongs(i);
							}
							for(int i=0;i<n;i++) {
								System.out.println("Album price"+i+1);
								a1.getPrice(i);
							}
							break;
						case "2":
							for(int i=0;i<n;i++) {
								a1.listAlbum(i);
							}
							for(int i=0;i<n;i++) {
								System.out.println("Album price "+(i+1));
								a1.getPrice(i);
							}
							System.out.println("Which album fo you want to buy");
							response1=sc.nextInt();
							purcharse=response1;
							a1.purchasingAlbum(response1);
							break;
						case "3":
							System.out.println(a1.purchasingAlbum(purcharse));
							break;
						case"4":
							exit=false;
							break;
					}
					}
					exit=true;
					break;
				case "6":
					
					if(n==0)
					{
						System.out.println("there is no message");
					}
					for(int i=0;i<n;i++){
						System.out.println("message "+(i+1));
						System.out.println(i);
						cc.listMessage(i);
					}
					cc.detailmesage(sc, n);
					n = n +1;
					break;
				case "7":
					for(int i=0;i<n;i++)
					{
						a1.listAlbum(i);
					}
					break;
			}
			
		}
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
					
				}
				cc.detailmesage(sc, n);
								
			}else {
				x = true;
			}
			}
		}else {
		}
			}
	public static void showMenu()
	{
		System.out.println("1 create album");
		System.out.println("2 options album");
		System.out.println("3 create song");
		System.out.println("4 options songs");
		System.out.println("5 Shop");
		System.out.println("6 comment album");
		System.out.println("7 list album");
		System.out.println("8 exit");
	}
}

