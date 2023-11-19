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
		System.out.println("1 Show the list album");
		System.out.println("2 edit album");
		System.out.println("3 delete album");
		response1=sc.nextInt();
		if(response1==1) {
			for(int i=0;i<n;i++) {
				System.out.println(" ");
				a1.listAlbum(i);
			}
		}else if(response1==2) {
			System.out.println("which album do yo want to edit");
			for(int i=0;i<n;i++) {
				System.out.println(" ");
				a1.listAlbum(i);
			}
			n=sc.nextInt();
			a1.detailAlbum(sc,n-1);
		}else if(response1==3)
		{
			System.out.println("which album do yo want to delete");
			for(int i=0;i<n;i++) {
				System.out.println(" ");
				a1.listAlbum(i);
			}
			n=sc.nextInt();
			a1.deleteAlbum(n-1);
			a1.listAlbum(n-1);
		}
	
	}
}
