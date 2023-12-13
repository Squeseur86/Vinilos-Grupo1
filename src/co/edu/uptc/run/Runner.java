 package co.edu.uptc.run;

import co.edu.uptc.control.*;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AlbumControl a1 = new AlbumControl();
		SongControl Sco = new SongControl();
		PerformerControl perfC=new PerformerControl();
		
		CollectorControl cc = new CollectorControl();
		String response;
		String option;
		boolean responseBool,exit=true, x = false;
		String name, nameSong, yearRelease;
		String username, tellphone, email, password;
		String cover;
		int purcharse=0,lengthAlbum=0,contSong=0,contPerf=0;
		String description;
		int hours,minutes,seconds,year,month,date,n=0,response1, opcC, comments = 0, opc = 0, id, raiting;
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
		a1.setArrayAlbum(100);
		Sco.setArrayAlbum(100);
		perfC.setArraysPerfor(100);
		
		while(exit)
		{
			showMenu();
			System.out.println("Choose the option");
			option=sc.next();
			
			switch(option)
			{
				case "1":
					
					a1.detailAlbum(sc,lengthAlbum);
					
					lengthAlbum++;
					break;
				case "2":
					System.out.println("Choose the option");
					System.out.println("1 edit album");
					System.out.println("2 delete album");
					System.out.println("3 set price for an album");
					System.out.println("4 set performes to album");
					System.out.println("5 delete performe");
					option=sc.next();
					switch(option)
					{
						case "1":
							System.out.println("which album do yo want to edit");
							for(int i=0;i<lengthAlbum;i++) {
								System.out.println(" ");
								a1.listAlbum(i);
							}
							n=sc.nextInt();
							a1.detailAlbum(sc,n-1);
							break;
						case "2":
							System.out.println("which album do yo want to delete");
							for(int i=0;i<lengthAlbum;i++) {
								System.out.println(" ");
								a1.listAlbum(i);
							}
							n=sc.nextInt();
							a1.deleteAlbum(n-1);
							a1.listAlbum(n-1);
							break;
						case "3":
							for(int i=0;i<lengthAlbum;i++)
							{
								int price;
								a1.listAlbum(i);
								System.out.println("Set price");
								price=sc.nextInt();
								a1.setPrices(price, i);
							}
							break;
						case "4":
							System.out.println("Which album do you want to add performer");
							for(int i=0;i<lengthAlbum;i++)
							{
								a1.listAlbNames(i);
							}
							id=sc.nextInt();
							perfC.setIdPerformer((id-1), contPerf);
							perfC.detailPerformer(sc, contPerf);
							contPerf++;
							break;
						case "5":
							System.out.println("Which album do you want to add performer");
							for(int i=0;i<lengthAlbum;i++)
							{
								a1.listAlbNames(i);
							}
							id=sc.nextInt();
							for(int i=0;i<contPerf;i++)
							{
								perfC.listPerformer(i, id);
							}
							System.out.println("Which perfotmr do you want to delete ");
							response1=sc.nextInt();
							perfC.deletePerformer(response1);
							perfC.listPerformer(response1, id);
							break;
					}
					break;
				case "3":
					System.out.println("Which album do you want to add song");
					for(int i=0;i<lengthAlbum;i++)
					{
						a1.listAlbNames(i);
					}
					id=sc.nextInt();
					Sco.detailSong(sc, contSong);
					Sco.setId(contSong, (id-1));
					contSong++;
					break;
				case "4":
					System.out.println("Choose the option");
					System.out.println("1 edit song");
					System.out.println("2 delete song");
					System.out.println("3 take out song");
					option=sc.next();
					
					switch(option)
					{
						case "1":
							System.out.println("Which album do you want to edit song");
							for(int i=0;i<lengthAlbum;i++)
							{
								a1.listAlbNames(i);
							}
							id=sc.nextInt();
							for(int i=0;i<contSong;i++){
								
								Sco.listSongs(i,(id-1));
							}
							System.out.println("Choose the song");
							response1=sc.nextInt();
								Sco.detailSong(sc, response1);
								Sco.listSongs(response1,(id-1));	
							break;
						case "2":
							System.out.println("Which album do you want to delete song");
							for(int i=0;i<lengthAlbum;i++)
							{
								a1.listAlbNames(i);
							}
							id=sc.nextInt();
							for(int i=0;i<contSong;i++)
							{
								Sco.listSongs(i,(id-1));
							}
							System.out.println("Which song do you want to delete?");
							response1=sc.nextInt();
							
							Sco.delateSong(response1);
							Sco.listSongs(response1,id);
							break;
						case "3":
							System.out.println("Which album do you want to take out song");
							for(int i=0;i<lengthAlbum;i++)
							{
								a1.listAlbNames(i);
							}
							id=sc.nextInt();
							for(int i=0;i<contSong;i++)
							{
								Sco.listSongs(i,(id-1));
							}
							System.out.println("Which song do you want to take out?");
							response1=sc.nextInt();
							System.out.println("Which album do you want to put the song");
							for(int i=0;i<lengthAlbum;i++)
							{
								a1.listAlbNames(i);
							}
							id=sc.nextInt();
							Sco.setId((response1-1), id);
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
							System.out.println("which album do you want to see");
							for(int i=0;i<lengthAlbum;i++) {
								a1.listAlbNames(i);
							}
							id=sc.nextInt();
							a1.listAlbum((id-1));
							for(int i=0;i<contSong;i++)
							{
								Sco.listSongs(i, (id-1));
							}
								a1.getPrice((id-1));
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
					System.out.println("which album do you want to see");
					for(int i=0;i<lengthAlbum;i++) {
						a1.listAlbNames(i);
					}
					id=sc.nextInt();
					a1.listAlbum((id-1));
					for(int i=0;i<contSong;i++)
					{
						Sco.listSongs(i, (id-1));
					}
					break;
				case "8":
					exit=false;
					break;
				default:
					System.out.println("opcion invalida");
					break;
			}
			
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

