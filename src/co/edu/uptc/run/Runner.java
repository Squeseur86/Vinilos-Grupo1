 package co.edu.uptc.run;

import co.edu.uptc.control.*;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AlbumControl a1 = new AlbumControl();
		SongControl Sco = new SongControl();
		PerformerControl perfC=new PerformerControl();
		BandControl bdC = new BandControl();
		MusicianControl msC= new MusicianControl();
		PrizeControl przC = new PrizeControl();
		
		CollectorControl cc = new CollectorControl();
		String response;
		String option;
		boolean responseBool,exit=true, x = false;
		String name, nameSong, yearRelease;
		String username, tellphone, email, password;
		String cover;
		int purcharse=0,lengthAlbum=0,contSong=0,contPerf=0;
		String description;
		int hours,minutes,seconds,year,month,date,n=0,response1, opcC, comments = 0, opc = 0, id, raiting, opcedit=1;
		String genre, genreSong;
		String raitcad, message, favArtist;
		int opcArtit=1;
		while(opcedit ==1 ) {
		System.out.println("Welcome to the vinyl store, regsister");
		System.out.println("enter your username");
		username = sc.next();
		System.out.println("enter your number tellphone ten digits");
		tellphone = sc.next();
		while(tellphone.length()!=10) {
			System.out.println("this number tellphone is invalid- tellphone needs 10 charts");
			tellphone = sc.next();
		}
		System.out.println("enter your email ....@gmail.com");
		email = sc.next() + "@gmail.com ";
		System.out.println("enter your password 8 charts");
		password = sc.next();
		while(password.length()<8) {
			System.out.println("this password is invalid- this password needs 8 charts");
			password = sc.next();
		}
		System.out.println("Do you want edit your information 1 yes,2.no");
		opcedit = sc.nextInt();
		cc.registCollector(username, tellphone, email, password);
		}
		cc.setArrayMessage(100);
		a1.setArrayAlbum(100);
		Sco.setArrayAlbum(100);
		perfC.setArraysPerfor(100);
		bdC.setArrayBand(100);
		msC.setArrayMusican(100);
		przC.setArrayAlbum(100);
		
		while(opcArtit==1) {
		System.out.println("Who is yout favorite artist");
		favArtist = sc.next();
		System.out.println("you are sure? 1.no, other number for not");
		opcArtit =sc.nextInt();		
		}
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
					System.out.println("6 edit performe");
			
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
							System.out.println("Which album do you want to delete performer");
							for(int i=0;i<lengthAlbum;i++)
							{
								a1.listAlbNames(i);
							}
							id=sc.nextInt();
							for(int i=0;i<contPerf;i++)
							{
								perfC.listPerformer(i, id);
							}
							System.out.println("Which perfotmer do you want to delete ");
							response1=sc.nextInt();
							perfC.deletePerformer(response1);
							perfC.listPerformer(response1, id);
							break;
						case "6":
							System.out.println("Which album do you want to edit performer");
							for(int i=0;i<lengthAlbum;i++)
							{
								a1.listAlbNames(i);
							}
							id=sc.nextInt();
							for(int i=0;i<contPerf;i++)
							{
								perfC.listPerformer(i, id);
							}
							System.out.println("Which perfotmr do you want to edit ");
							response1=sc.nextInt();
							perfC.detailPerformer(sc, response1);
							perfC.listPerformer(response1, id);
							System.out.println("The perform is a band or musician , 1. yes");
							int opc01 = sc.nextInt();
							while(opc01 == 1) {
								System.out.println("1.band");
								System.out.println("2. musician");
								System.out.println("3. prize");
								option = sc.next();
								switch(option) {
								case "1" :
									System.out.println("Choose the option");
									System.out.println("1 edit band");
									System.out.println("2 delete band");
									System.out.println("3 add band to album");
									option = sc.next();
									switch(option) {
									
									case "1" :
										System.out.println("Which album do you want to edit band");
										for(int i=0;i<lengthAlbum;i++)
										{
											a1.listAlbNames(i);
										}
										id=sc.nextInt();
										for(int i=0;i<contPerf;i++)
										{
											perfC.listPerformer(i, (id-1));
										}
										System.out.println("Which performer do you want to choose");
										response1=sc.nextInt();
										System.out.println("Which band do you want to edit ");
										response1=sc.nextInt();
										bdC.detailBand(sc, response1);
										bdC.listBand((response1-1),(id-1));
										break;
									case "2" :
										System.out.println("Which album do you want to add band");
										for(int i=0;i<lengthAlbum;i++)
										{
											a1.listAlbNames(i);
										}
										id=sc.nextInt();
										for(int i=0;i<contPerf;i++)
										{
											perfC.listPerformer(i, (id-1));
										}
										System.out.println("Which performer do you want to delete ");
										response1=sc.nextInt();
										bdC.deleteBand(response1);
										bdC.listBand((response1-1),(id-1));
										break;
									case "3":
										System.out.println("Which album do you want to add band");
										for(int i=0;i<lengthAlbum;i++)
										{
											a1.listAlbNames(i);
										}
										id=sc.nextInt();
										for(int i=0;i<contPerf;i++)
										{
											perfC.listPerformer(i, (id-1));
										}
										System.out.println("Which performer do you want to choose");
										response1=sc.nextInt();
										bdC.setId((id-1), (response1-1));
										bdC.listBand(response1, (id-1));
										msC.detailMusician(sc,contPerf,(response1-1) , (id-1));
										break;
									}
									
								case "2" :
									System.out.println("Choose the option");
									System.out.println("1 edit musician");
									System.out.println("2 delete musician");
									System.out.println("3 add musician to album");
									option = sc.next();
									switch(option) {
									
									case "1" :
										System.out.println("Which album do you want to edit musician");
										for(int i=0;i<lengthAlbum;i++)
										{
											a1.listAlbNames(i);
										}
										id=sc.nextInt();
										for(int i=0;i<contPerf;i++)
										{
											perfC.listPerformer(i, (id-1));
										}
										System.out.println("Which musician do you want to edit ");
										response1=sc.nextInt();
										msC.detailMusician(sc, contPerf, (response1-1), (id-1));
										msC.listMusician((response1-1), (id-1));
										break;
									case "2" :
										System.out.println("Which album do you want to delete musician");
										for(int i=0;i<lengthAlbum;i++)
										{
											a1.listAlbNames(i);
										}
										id=sc.nextInt();
										for(int i=0;i<contPerf;i++)
										{
											perfC.listPerformer(i, (id-1));
										}
										System.out.println("Which musician do you want to delete ");
										response1=sc.nextInt();
										msC.deleteMusican((response1-1));
										msC.listMusician((response1-1),(id-1));
										break;
									case "3":
										System.out.println("Which album do you want to add musician");
										for(int i=0;i<lengthAlbum;i++)
										{
											a1.listAlbNames(i);
										}
										id=sc.nextInt();
										for(int i=0;i<contPerf;i++)
										{
											perfC.listPerformer(i, (id-1));
										}
										System.out.println("Which perfotmr do you want to choose");
										response1=sc.nextInt();
										msC.listMusician((response1-1), (id-1));
										msC.detailMusician(sc,contPerf,(response1-1) , (id-1));
										break;
									}
									break;
								case "3":
									System.out.println("Choose the option");
									System.out.println("1 edit prize");
									System.out.println("2 update prize date");
									System.out.println("3. detail artist");
									option=sc.next();
									switch(option) {
										case "1" :
											System.out.println("Which album do you want to choose");
											for(int i=0;i<lengthAlbum;i++)
											{
												a1.listAlbNames(i);
											}
											id=sc.nextInt();
											for(int i=0;i<contPerf;i++)
											{
												perfC.listPerformer(i, (id-1));
											}
											System.out.println("Which perfomre do you want to edit prize ");
											response1=sc.nextInt();
											przC.detailPrize(sc, (response1-1));
											break;
										case "2" :
											System.out.println("Which album do you want to choose");
											for(int i=0;i<lengthAlbum;i++)
											{
												a1.listAlbNames(i);
											}
											id=sc.nextInt();
											for(int i=0;i<contPerf;i++)
											{
												perfC.listPerformer(i, (id-1));
											}
											System.out.println("Which perfomre do you want to edit prize ");
											response1=sc.nextInt();
											przC.setPricedate(sc, (response1-1));
										
											break;
										case "3" :
											for(int i=0;i<contPerf;i++)	{
												perfC.listPerformer(i, (id-1));
											}
											System.out.println("Which perfomre do you want to win prize ");
											response1 = sc.nextInt();
											przC.detailPrize(sc, (response1-1));
											
											break;
									}
									break;
								}
							}
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
					System.out.println("which performer do you want to see");
					for(int i=0;i<contPerf;i++)
					{
						perfC.listPerformer(i, id);
					}
					response1=sc.nextInt();
					bdC.listBand(response1, id);
					msC.listMusician(response1, id);
					przC.listPrizes(response1, id);
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
