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
		boolean responseBool,exit=true,x=true;
		String name, nameSong, yearRelease;
		String username, tellphone, email, password;
		String cover;
		int purcharse=0,lengthAlbum=0,contSong=0,contPerf=0,contMessage=0;
		String description;
		int hours,minutes,seconds,year,month,date,n=0,response1 = 0, opcC, comments = 0, opc = 0, id = 0, raiting, opcedit=1;
		String genre, genreSong;
		String raitcad, message, favArtist;
		int opcArtit=1;
		System.out.println("Welcome to the vinyl store, regsister");
		System.out.println("enter your username");
		username = sc.nextLine();
		System.out.println("enter your number tellphone ten digits");
<<<<<<< HEAD
		tellphone = sc.nextLine();
		while(tellphone.length()!=10||tellphone.contains(" ")) {
			if(tellphone.contains(" "))
			{
				System.out.println("this number tellphone is invalid-do not use space");
				tellphone = sc.nextLine();
			}
			System.out.println("this number tellphone is invalid -it needs at least 10 char");
			tellphone = sc.nextLine();
=======
		tellphone = sc.next();
		while(tellphone.length()!=10) {
			System.out.println("this number tellphone is invalid- tellphone needs 10 charts");
			tellphone = sc.next();
>>>>>>> f5156cd8d8a8217d7c4ae2306c72c7650b6c3573
		}
		System.out.println("enter your email ....@gmail.com");
		email = sc.nextLine() + "@gmail.com";
		while(email.contains(" "))
		{
			System.out.println("this email is invalid-do not use space");
			email = sc.nextLine() + "@gmail.com";
		}
		System.out.println("enter your password 8 charts");
<<<<<<< HEAD
		password = sc.nextLine();
		while(password.length()<8||password.contains(" ")) {
			if(password.contains(" "))
			{
				System.out.println("this passoword is invalid-do not use space");
				password = sc.nextLine();
			}
			System.out.println("this password is invalid-needs at lest 8 char");
			password = sc.nextLine();
=======
		password = sc.next();
		while(password.length()<8) {
			System.out.println("this password is invalid- this password needs 8 charts");
			password = sc.next();
>>>>>>> f5156cd8d8a8217d7c4ae2306c72c7650b6c3573
		}
		
		cc.registCollector(username, tellphone, email, password);
		cc.setArrayMessage(100);
		a1.setArrayAlbum(100);
		Sco.setArrayAlbum(100);
		perfC.setArraysPerfor(100);
		bdC.setArrayBand(100);
		msC.setArrayMusican(100);
		przC.setArrayAlbum(100);
		
		while(opcArtit==1) {
		System.out.println("Who is yout favorite artist");
<<<<<<< HEAD
		favArtist = sc.nextLine();
		opcArtit=3;
		while(opcArtit==3) {
			System.out.println("you are sure? 1.no 2.yes");
			option=sc.nextLine();
		try {
			opcArtit=Integer.parseInt(option);
			if(opcArtit==1)
			{
			}else if(opcArtit!=2)
			{
				System.out.println("the number for exit is 2");
				opcArtit=3;
			}
		}catch(NumberFormatException e){
			System.out.println("the option needs to be a number");
			opcArtit=3;
=======
		favArtist = sc.next();
		System.out.println("you are sure? 1.no, other number for not");
		opcArtit =sc.nextInt();		
>>>>>>> f5156cd8d8a8217d7c4ae2306c72c7650b6c3573
		}
		}
		}
		
		while(exit)
		{
			showMenu();
			System.out.println("Choose the option");
			option=sc.nextLine();
			
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
			
					option=sc.nextLine();
					switch(option)
					{
						case "1":
							
							for(int i=0;i<lengthAlbum;i++) {
								System.out.println(" ");
								a1.listAlbum(i);
							}
							x=true;
							while(x)
							{
								System.out.println("which album do yo want to edit");
								option=sc.nextLine();
								try {
										n=Integer.parseInt(option);
										if(n>100)
										{
											System.out.println("the number need to be minor than 100");
										}else {
											x=false;
										}
									
								}catch(NumberFormatException e){
									System.out.println("put the album number");
								}
							}
							if(a1.nullAlbum(n-1)!=null)
							{
								a1.detailAlbum(sc,n-1);

							}else {
								System.out.println("there is no album with this number");
							}
							break;
						case "2":
							System.out.println("which album do yo want to delete");
							for(int i=0;i<lengthAlbum;i++) {
								System.out.println(" ");
								a1.listAlbum(i);
							}
							x=true;
							while(x)
							{
								System.out.println("which album do yo want to edit");
								option=sc.nextLine();
								try {
										n=Integer.parseInt(option);
										if(n>100)
										{
											System.out.println("the number need to be minor than 100");
										}else {
											x=false;
										}
									
								}catch(NumberFormatException e){
									System.out.println("put the album number");
								}
							}
							if(a1.nullAlbum(n-1)!=null)
							{
								a1.deleteAlbum(n-1);
								a1.listAlbum(n-1);

							}else {
								System.out.println("there is no album with this number");
							}
							break;
						case "3":
							for(int i=0;i<lengthAlbum;i++)
							{
								int price=0;
								a1.listAlbum(i);
								
								x=true;
								while(x)
								{
									System.out.println("Set price");
									option=sc.nextLine();
									try {
											price=Integer.parseInt(option);
											x=false;
									}catch(NumberFormatException e){
										System.out.println("put the album number");
									}
								}
								a1.setPrices(price, i);
							}
							break;
						case "4":
							
							for(int i=0;i<lengthAlbum;i++)
							{
								a1.listAlbNames(i);
							}
							while(x)
							{
								System.out.println("Which album do you want to add performer");
								option=sc.nextLine();
								try {
										id=Integer.parseInt(option);
										x=false;
										
									
								}catch(NumberFormatException e){
									System.out.println("put the album number");
								}
							}
							if(a1.nullAlbum((id-1))!=null)
							{
								perfC.setIdPerformer((id-1), contPerf);
								perfC.detailPerformer(sc, contPerf);
								contPerf++;
							}else {
								System.out.println("there is no album with this number");
							}
							
							break;
						case "5":
							
							for(int i=0;i<lengthAlbum;i++)
							{
								a1.listAlbNames(i);
							}
							x=true;
							while(x)
							{
								System.out.println("Which album do you want to delete performer");
								option=sc.nextLine();
								try {
										id=Integer.parseInt(option);
										x=false;
										
									
								}catch(NumberFormatException e){
									System.out.println("put the album number");
								}
							}
							if(a1.nullAlbum(id-1)!=null)
							{
								for(int i=0;i<contPerf;i++)
								{
									perfC.listPerformer(i, id);
								}
								x=true;
								while(x)
								{
									System.out.println("Which performer do you want to delete ");
									for(int i=0;i<contPerf;i++)
									{
										perfC.listPerformer(i, (id-1));
									}
									option=sc.nextLine();
									try {
											response1=Integer.parseInt(option);
											x=false;
											
										
									}catch(NumberFormatException e){
										System.out.println("put the performer number");
									}
								}
								if(perfC.nullPerforme(id-1)!=null)
								{
									response1=sc.nextInt();
									perfC.deletePerformer(response1);
									perfC.listPerformer(response1, id);
								}else {
									System.out.println("there is no performer with this number");
								}
							}else {
								System.out.println("there is no album with this number");
							}
							
							break;
						case "6":
							
							for(int i=0;i<lengthAlbum;i++)
							{
								a1.listAlbNames(i);
							}
							x=true;
							while(x)
							{
								System.out.println("Which album do you want to edit performer");
								option=sc.nextLine();
								try {
										id=Integer.parseInt(option);
										x=false;
										
									
								}catch(NumberFormatException e){
									System.out.println("put the album number");
								}
							}
							if(a1.nullAlbum(id-1)!=null)
							{
								for(int i=0;i<contPerf;i++)
								{
									perfC.listPerformer(i, id);
								}
								x=true;
								while(x)
								{
									System.out.println("Which performer do you want to edit ");
									option=sc.nextLine();
									try {
											response1=Integer.parseInt(option);
											x=false;
											
										
									}catch(NumberFormatException e){
										System.out.println("put the performer number");
									}
								}
								if(perfC.nullPerforme(id-1)!=null)
								{
									perfC.detailPerformer(sc,response1);
									perfC.listPerformer(response1,id-1);
								}else {
									System.out.println("there is no performer with this number");
								}
							}else {
								System.out.println("there is no album with this number");
							}
							
							int opc01 = 0;
							x=true;
							while(x)
							{
								System.out.println("The perform is a band or musician , 1. yes");
								option=sc.nextLine();
								try {
										opc01=Integer.parseInt(option);
										x=false;
										
									
								}catch(NumberFormatException e){
									System.out.println("put only a number");
								}
							}
							if(opc01 == 1) {
								System.out.println("1.band");
								System.out.println("2. musician");
<<<<<<< HEAD
								System.out.print("3. prize");
=======
								System.out.println("3. prize");
>>>>>>> f5156cd8d8a8217d7c4ae2306c72c7650b6c3573
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
										
										for(int i=0;i<lengthAlbum;i++)
										{
											a1.listAlbNames(i);
										}
										x=true;
										while(x)
										{
											System.out.println("Which album do you want to edit band");
											option=sc.nextLine();
											try {
													id=Integer.parseInt(option);
													x=false;
													
												
											}catch(NumberFormatException e){
												System.out.println("put the album number");
											}
										}
										if(a1.nullAlbum(id-1)!=null)
										{
											for(int i=0;i<contPerf;i++)
											{
												perfC.listPerformer(i, id);
											}
											x=true;
											while(x)
											{
												System.out.println("Which performer do you want to choose ");
												option=sc.nextLine();
												try {
														response1=Integer.parseInt(option);
														x=false;
														
													
												}catch(NumberFormatException e){
													System.out.println("put the performer number");
												}
											}
											if(perfC.nullPerforme(id-1)!=null)
											{
												x=true;
												while(x=true) {
													System.out.println("Which band do you want to edit ");
													option=sc.nextLine();
													try {
														response1=Integer.parseInt(option);
														x=false;
													}catch(NumberFormatException e){
														System.out.println("put the band number");
													}
												}
												bdC.detailBand(sc, response1);
												bdC.listBand((response1-1),(id-1));
											}else {
												System.out.println("there is no performer with this number");
											}
										}else {
											System.out.println("there is no album with this number");
										}
										
										
										break;
									case "2" :
										
										for(int i=0;i<lengthAlbum;i++)
										{
											a1.listAlbNames(i);
										}
										x=true;
										while(x)
										{
											System.out.println("Which album do you want to delete band");
											option=sc.nextLine();
											try {
													id=Integer.parseInt(option);
													x=false;
													
												
											}catch(NumberFormatException e){
												System.out.println("put the album number");
											}
										}
										if(a1.nullAlbum(id-1)!=null)
										{
											for(int i=0;i<contPerf;i++)
											{
												perfC.listPerformer(i, id);
											}
											x=true;
											while(x)
											{
												System.out.println("Which performer do you want to choose ");
												option=sc.nextLine();
												try {
														response1=Integer.parseInt(option);
														x=false;
														
													
												}catch(NumberFormatException e){
													System.out.println("put the performer number");
												}
											}
											if(perfC.nullPerforme(id-1)!=null)
											{
												x=true;
												while(x=true) {
													System.out.println("Which band do you want to edit ");
													option=sc.nextLine();
													try {
														response1=Integer.parseInt(option);
														x=false;
													}catch(NumberFormatException e){
														System.out.println("put the band number");
													}
												}
												bdC.deleteBand(response1);
												bdC.listBand((response1-1),(id-1));
											}else {
												System.out.println("there is no performer with this number");
											}
										}else {
											System.out.println("there is no album with this number");
										}
										
										break;
									case "3":
										
										for(int i=0;i<lengthAlbum;i++)
										{
											a1.listAlbNames(i);
										}
										x=true;
										while(x)
										{
											System.out.println("Which album do you want to add band");
											option=sc.nextLine();
											try {
													id=Integer.parseInt(option);
													x=false;
													
												
											}catch(NumberFormatException e){
												System.out.println("put the album number");
											}
										}
										if(a1.nullAlbum(id-1)!=null)
										{
											for(int i=0;i<contPerf;i++)
											{
												perfC.listPerformer(i, id);
											}
											x=true;
											while(x)
											{
												System.out.println("Which performer do you want to choose ");
												option=sc.nextLine();
												try {
														response1=Integer.parseInt(option);
														x=false;
														
													
												}catch(NumberFormatException e){
													System.out.println("put the performer number");
												}
											}
											if(perfC.nullPerforme(id-1)!=null)
											{
												x=true;
												while(x=true) {
													System.out.println("Which band do you want to edit ");
													option=sc.nextLine();
													try {
														response1=Integer.parseInt(option);
														x=false;
													}catch(NumberFormatException e){
														System.out.println("put the band number");
													}
												}
												bdC.deleteBand(response1);
												bdC.listBand((response1-1),(id-1));
												bdC.setId((id-1), (response1-1));
												bdC.listBand(response1, (id-1));
												msC.detailMusician(sc,contPerf,(response1-1) , (id-1));
											}else {
												System.out.println("there is no performer with this number");
											}
										}else {
											System.out.println("there is no album with this number");
										}
										
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
										
										for(int i=0;i<lengthAlbum;i++)
										{
											a1.listAlbNames(i);
										}
										x=true;
										while(x)
										{
											System.out.println("Which album do you want to edit musician");
											option=sc.nextLine();
											try {
													id=Integer.parseInt(option);
													x=false;
													
												
											}catch(NumberFormatException e){
												System.out.println("put the album number");
											}
										}
										if(a1.nullAlbum(id-1)!=null)
										{
											for(int i=0;i<contPerf;i++)
											{
												perfC.listPerformer(i, id);
											}
											x=true;
											while(x)
											{
												System.out.println("Which performer do you want to choose ");
												option=sc.nextLine();
												try {
														response1=Integer.parseInt(option);
														x=false;
														
													
												}catch(NumberFormatException e){
													System.out.println("put the performer number");
												}
											}
											if(perfC.nullPerforme(id-1)!=null)
											{
												x=true;
												while(x=true) {
													System.out.println("Which musician do you want to edit ");
													option=sc.nextLine();
													try {
														response1=Integer.parseInt(option);
														x=false;
													}catch(NumberFormatException e){
														System.out.println("put the musician number");
													}
												}
												msC.detailMusician(sc, contPerf, (response1-1), (id-1));
												msC.listMusician((response1-1), (id-1));
											}else {
												System.out.println("there is no performer with this number");
											}
										}else {
											System.out.println("there is no album with this number");
										}
										break;
									case "2" :
										
										for(int i=0;i<lengthAlbum;i++)
										{
											a1.listAlbNames(i);
										}
										x=true;
										while(x)
										{
											System.out.println("Which album do you want to delete musician");
											option=sc.nextLine();
											try {
													id=Integer.parseInt(option);
													x=false;
													
												
											}catch(NumberFormatException e){
												System.out.println("put the album number");
											}
										}
										if(a1.nullAlbum(id-1)!=null)
										{
											for(int i=0;i<contPerf;i++)
											{
												perfC.listPerformer(i, id);
											}
											x=true;
											while(x)
											{
												System.out.println("Which performer do you want to choose ");
												option=sc.nextLine();
												try {
														response1=Integer.parseInt(option);
														x=false;
														
													
												}catch(NumberFormatException e){
													System.out.println("put the performer number");
												}
											}
											if(perfC.nullPerforme(id-1)!=null)
											{
												x=true;
												while(x=true) {
													System.out.println("Which musician do you want to delete ");
													option=sc.nextLine();
													try {
														response1=Integer.parseInt(option);
														x=false;
													}catch(NumberFormatException e){
														System.out.println("put the musician number");
													}
												}
												msC.deleteMusican((response1-1));
												msC.listMusician((response1-1),(id-1));
											}else {
												System.out.println("there is no performer with this number");
											}
										}else {
											System.out.println("there is no album with this number");
										}
										break;
									case "3":
										for(int i=0;i<lengthAlbum;i++)
										{
											a1.listAlbNames(i);
										}
										x=true;
										while(x)
										{
											System.out.println("Which album do you want to add musician");
											option=sc.nextLine();
											try {
													id=Integer.parseInt(option);
													x=false;
													
												
											}catch(NumberFormatException e){
												System.out.println("put the album number");
											}
										}
										if(a1.nullAlbum(id-1)!=null)
										{
											for(int i=0;i<contPerf;i++)
											{
												perfC.listPerformer(i, id);
											}
											x=true;
											while(x)
											{
												System.out.println("Which performer do you want to chosse ");
												option=sc.nextLine();
												try {
														response1=Integer.parseInt(option);
														x=false;
														
													
												}catch(NumberFormatException e){
													System.out.println("put the performer number");
												}
											}
											if(perfC.nullPerforme(id-1)!=null)
											{
												x=true;
												while(x=true) {
													System.out.println("Which musician do you want to add to an album ");
													option=sc.nextLine();
													try {
														response1=Integer.parseInt(option);
														x=false;
													}catch(NumberFormatException e){
														System.out.println("put the musician number");
													}
												}
												msC.listMusician((response1-1), (id-1));
												msC.detailMusician(sc,contPerf,(response1-1) , (id-1));
											}else {
												System.out.println("there is no performer with this number");
											}
										}else {
											System.out.println("there is no album with this number");
										}
		
										
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
											
											for(int i=0;i<lengthAlbum;i++)
											{
												a1.listAlbNames(i);
											}
											x=true;
											while(x)
											{
												System.out.println("Which album do you want to choose");
												option=sc.nextLine();
												try {
														id=Integer.parseInt(option);
														x=false;
														
													
												}catch(NumberFormatException e){
													System.out.println("put the album number");
												}
											}
											if(a1.nullAlbum(id-1)!=null)
											{
												for(int i=0;i<contPerf;i++)
												{
													perfC.listPerformer(i, id);
												}
												x=true;
												while(x)
												{
													System.out.println("Which perfomer do you want to edit prize ");
													option=sc.nextLine();
													try {
															response1=Integer.parseInt(option);
															x=false;
															
														
													}catch(NumberFormatException e){
														System.out.println("put the performer number");
													}
												}
												if(perfC.nullPerforme(id-1)!=null)
												{
													przC.detailPrize(sc, (response1-1));
												}else {
													System.out.println("there is no performer with this number");
												}
											}else {
												System.out.println("there is no album with this number");
											}
										case "2" :
											System.out.println("Which album do you want to choose");
											for(int i=0;i<lengthAlbum;i++)
											{
												a1.listAlbNames(i);
											}
											x=true;
											while(x)
											{
												System.out.println("Which album do you want to choose");
												option=sc.nextLine();
												try {
														id=Integer.parseInt(option);
														x=false;
														
													
												}catch(NumberFormatException e){
													System.out.println("put the album number");
												}
											}
											if(a1.nullAlbum(id-1)!=null)
											{
												for(int i=0;i<contPerf;i++)
												{
													perfC.listPerformer(i, id);
												}
												x=true;
												while(x)
												{
													System.out.println("Which perfomre do you want to set date prize ");
													option=sc.nextLine();
													try {
															response1=Integer.parseInt(option);
															x=false;
															
														
													}catch(NumberFormatException e){
														System.out.println("put the performer number");
													}
												}
												if(perfC.nullPerforme(id-1)!=null)
												{
													przC.setPricedate(sc, (response1-1));
												}else {
													System.out.println("there is no performer with this number");
												}
											}else {
												System.out.println("there is no album with this number");
											}
											break;
										case "3" :
											for(int i=0;i<contPerf;i++)
											{
												perfC.listPerformer(i, id);
											}
											x=true;
											while(x)
											{
												System.out.println("Which perfomer do you want to win prize ");
												option=sc.nextLine();
												try {
														response1=Integer.parseInt(option);
														x=false;
														
													
												}catch(NumberFormatException e){
													System.out.println("put the performer number");
												}
											}
											if(perfC.nullPerforme(id-1)!=null)
											{
												przC.detailPrize(sc, (response1-1));
											}else {
												System.out.println("there is no performer with this number");
											}
											
											break;
									}
									break;
								}
							}
					}
					break;
				case "3":
					
					for(int i=0;i<lengthAlbum;i++)
					{
						a1.listAlbNames(i);
					}
					x=true;
					while(x)
					{
						System.out.println("Which album do you want to add song");
						option=sc.nextLine();
						try {
								id=Integer.parseInt(option);
								x=false;
								
							
						}catch(NumberFormatException e){
							System.out.println("put the album number");
						}
					}
					if(a1.nullAlbum(id-1)!=null)
					{
						Sco.detailSong(sc, contSong);
						Sco.setId(contSong, (id-1));
						contSong++;
					}else {
						System.out.println("there is no album with this number");
					}
					
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
							x=true;
							while(x)
							{
								System.out.println("Which album do you want to add song");
								option=sc.nextLine();
								try {
										id=Integer.parseInt(option);
										x=false;
										
									
								}catch(NumberFormatException e){
									System.out.println("put the album number");
								}
							}
							if(a1.nullAlbum(id-1)!=null)
							{
								for(int i=0;i<contSong;i++){
									
									Sco.listSongs(i,(id-1));
								}
								x=true;
								while(x)
								{
									System.out.println("Choose the song");
									option=sc.nextLine();
									try {
											response1=Integer.parseInt(option);
											x=false;
											
										
									}catch(NumberFormatException e){
										System.out.println("put the song number");
									}
								}
								if(Sco.nullSong(response1-1)!=null)
								{
									Sco.detailSong(sc, response1);
									Sco.listSongs(response1,(id-1));	
								}else {
									System.out.println("there is no song with this number");
								}
							}else {
								System.out.println("there is no album with this number");
							}
							break;
						case "2":
							
							for(int i=0;i<lengthAlbum;i++)
							{
								a1.listAlbNames(i);
							}
							x=true;
							while(x)
							{
								System.out.println("Which album do you want to delete song");
								option=sc.nextLine();
								try {
										id=Integer.parseInt(option);
										x=false;
										
									
								}catch(NumberFormatException e){
									System.out.println("put the album number");
								}
							}
							if(a1.nullAlbum(id-1)!=null)
							{
								for(int i=0;i<contSong;i++){
									
									Sco.listSongs(i,(id-1));
								}
								x=true;
								while(x)
								{
									System.out.println("Which song do you want to delete?");
									option=sc.nextLine();
									try {
											response1=Integer.parseInt(option);
											x=false;
											
										
									}catch(NumberFormatException e){
										System.out.println("put the song number");
									}
								}
								if(Sco.nullSong(response1-1)!=null)
								{
									Sco.delateSong(response1);
									Sco.listSongs(response1,id);
								}else {
									System.out.println("there is no song with this number");
								}
							}else {
								System.out.println("there is no album with this number");
							}
							break;
						case "3":
							
							for(int i=0;i<lengthAlbum;i++)
							{
								a1.listAlbNames(i);
							}
							x=true;
							while(x)
							{
								System.out.println("Which album do you want to take out song");
								option=sc.nextLine();
								try {
										id=Integer.parseInt(option);
										x=false;
										
									
								}catch(NumberFormatException e){
									System.out.println("put the album number");
								}
							}
							if(a1.nullAlbum(id-1)!=null)
							{
								for(int i=0;i<contSong;i++){
									
									Sco.listSongs(i,(id-1));
								}
								x=true;
								while(x)
								{
									System.out.println("Which song do you want to take out?");
									option=sc.nextLine();
									try {
											response1=Integer.parseInt(option);
											x=false;
											
										
									}catch(NumberFormatException e){
										System.out.println("put the song number");
									}
								}
								if(Sco.nullSong(response1-1)!=null)
								{
									for(int i=0;i<lengthAlbum;i++)
									{
										a1.listAlbNames(i);
									}
									x=true;
									while(x)
									{
										System.out.println("Which album do you want to put the song");
										option=sc.nextLine();
										try {
												id=Integer.parseInt(option);
												x=false;
												
											
										}catch(NumberFormatException e){
											System.out.println("put the album number");
										}
									}
									if(a1.nullAlbum(id-1)!=null)
									{
										Sco.setId((response1-1), id);
									}else {
										System.out.println("there is no album with this number");
									}
								}else {
									System.out.println("there is no song with this number");
								}
							}else {
								System.out.println("there is no album with this number");
							}
							break;
					}
					break;
				case "5":
					System.out.println("verify your identity");
					System.out.println("Insert your username");
					username=sc.nextLine();
					System.out.println("Insert your password");
					password=sc.nextLine();
					while(cc.verifyCollector(username, password))
					{
						System.out.println("verify your identity");
						System.out.println("Insert your username");
						username=sc.nextLine();
						System.out.println("Insert your password");
						password=sc.nextLine();
					}
					while(exit)
					{
					cc.collectorMenuShop();
					option=sc.nextLine();
					switch(option)
					{
						case "1":
							
							for(int i=0;i<lengthAlbum;i++) {
								a1.listAlbNames(i);
							}
							x=true;
							while(x)
							{
								System.out.println("which album do you want to see");
								option=sc.nextLine();
								try {
										id=Integer.parseInt(option);
										x=false;
										
									
								}catch(NumberFormatException e){
									System.out.println("put the album number");
								}
							}
							if(a1.nullAlbum(id-1)!=null)
							{
								a1.listAlbum((id-1));
								for(int i=0;i<contSong;i++)
								{
									Sco.listSongs(i, (id-1));
								}
									a1.getPrice((id-1));
							}else {
								System.out.println("there is no album with this number");
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
							
							while(x)
							{
								System.out.println("Which album fo you want to buy");
								option=sc.nextLine();
								try {
										response1=Integer.parseInt(option);
										x=false;
										
									
								}catch(NumberFormatException e){
									System.out.println("put the album number");
								}
							}
							if(a1.nullAlbum(response1-1)!=null)
							{
								purcharse=response1-1;
								a1.purchasingAlbum(response1);
							}else {
								System.out.println("there is no album with this number");
							}
							
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
					
					if(contMessage==0)
					{
						System.out.println("there is no message");
					}
					for(int i=0;i<contMessage;i++){
						System.out.println("message "+(i+1));
						System.out.println(i);
						cc.listMessage(i);
					}
					cc.detailmesage(sc, contMessage);
					contMessage++;
					break;
				case "7":
					System.out.println("enter your username");
					username = sc.nextLine();
					System.out.println("enter your number tellphone ten digits");
					tellphone = sc.nextLine();
					while(tellphone.length()!=10&& tellphone.contains(" ")) {
						if(tellphone.contains(" "))
						{
							System.out.println("this number tellphone is invalid-do not use space");
							tellphone = sc.nextLine();
						}
						System.out.println("this number tellphone is invalid -it needs at least 10 char");
						tellphone = sc.nextLine();
					}
					System.out.println("enter your email ....@gmail.com");
					email = sc.nextLine() + "@gmail.com ";
					while(email.contains(" "))
					{
						System.out.println("this email is invalid-do not use space");
						email=sc.nextLine();
					}
					System.out.println("enter your password 8 charts");
					password = sc.nextLine();
					while(password.length()<8&&password.contains(" ")) {
						if(password.contains(" "))
						{
							System.out.println("this passoword is invalid-do not use space");
							password = sc.nextLine();
						}
						System.out.println("this password is invalid");
						password = sc.nextLine();
					}
					cc.registCollector(username, tellphone, email, password);
					break;
				case "8":
					
					for(int i=0;i<lengthAlbum;i++) {
						a1.listAlbNames(i);
					}
					x=true;
					while(x)
					{
						System.out.println("which album do you want to see");
						option=sc.nextLine();
						try {
								id=Integer.parseInt(option);
								x=false;
								
							
						}catch(NumberFormatException e){
							System.out.println("put the album number");
						}
					}
					if(a1.nullAlbum(id-1)!=null)
					{
						a1.listAlbum((id-1));
						for(int i=0;i<contSong;i++)
						{
							Sco.listSongs(i, (id-1));
						}
						System.out.println("performers");
						for(int i=0;i<contPerf;i++)
						{
							perfC.listPerformer(i, id-1);
						}
						x=true;
						while(x)
						{
							System.out.println("which performer do you want to see");
							option=sc.nextLine();
							try {
									response1=Integer.parseInt(option);
									x=false;
									
								
							}catch(NumberFormatException e){
								System.out.println("put the song number");
							}
						}
						if(perfC.nullPerforme(response1-1)!=null)
						{
							bdC.listBand(response1-1, id-1);
							msC.listMusician(response1-1, id-1);
							przC.listPrizes(response1-1, id-1);
						}else {
							System.out.println("there is no song with this number");
						}
					}else {
						System.out.println("there is no album with this number");
					}
					
					break;
				case "9":
					exit=false;
					break;
				default:
					System.out.println("invalid option");
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
		System.out.println("7 edit profile information");
		System.out.println("8 list album");
		System.out.println("9 exit");
	}
}
