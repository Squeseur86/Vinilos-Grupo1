package co.edu.uptc.control;

import java.util.Scanner;

import co.edu.uptc.model.Band;

public class BandControl extends PerformerControl {
	Band bd = new Band();
	public void createBand(String nameArtist, String imageArtist, String descriptionArtist, int year, int month, int day, int n) {
		super.createPerformer(nameArtist, imageArtist, descriptionArtist, n);
		bd.setCreationDate(year, month, day, n);
	}
	public void setId(int id,int n)
	{
		bd.setId(id, n);
	}
	public void detailBand(Scanner sc, int n) {
		boolean numberVerif=true;
		System.out.println("put the name of the principal artist");
		String nameArt = sc.nextLine();
		numberVerif=true;
		int opc=0;
		while(numberVerif)
		{
			System.out.println("put the number of the member of the band");
			String opcString=sc.nextLine();
			try {
				opc=Integer.parseInt(opcString);
				
				numberVerif=false;
			}catch(NumberFormatException e){
				System.out.println("the month needs to be a number");
			}
		}
		for(int i =0; i<opc; i++ ) {
			System.out.println("put the name of the Artists");
			nameArt = sc.nextLine();
		}
		System.out.println("put the url of the image of the artist");
		String imageArt = sc.nextLine();
		System.out.println("Put the description of the artist");
		String descrArt = sc.nextLine();
		numberVerif=true;
		int year=0;
		while(numberVerif)
		{
			System.out.println("put the year of the album");
			String yearString=sc.nextLine();
			try {
				year=Integer.parseInt(yearString);
				if(year<1860 || year> 2024) {
					System.out.println("This year is invalid, can not be less than 1860 and greater than 2024");
				}else {
				numberVerif=false;
				}
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
				if(month<1 || month>12) {
					System.out.println("This month is invalid, can not be less than 1 and greater than 12");
				}else {
				numberVerif=false;
				}
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
				if(date<0 || date>31) {
					System.out.println("This year is invalid, can not be less than 1 and greater than 31");
				}else {
				numberVerif=false;
				}
			}catch(NumberFormatException e){
				System.out.println("the day needs to be a number");
			}
		}
		createBand(nameArt, imageArt, descrArt, year, month, date, n);
	}
	public void setArrayBand(int n){
		bd.setArrays(n);
	}
	public void deleteBand(int n) {
		super.deletePerformer(n);
		bd.setCreationDate(0, 0, 0, n);
	}
	public void listBand(int n,int id) {
		if(bd.getNameArtist(n)!=null)
		{
			if(id==bd.getId(n))
			{
			super.listPerformer(n, id);
			System.out.println(bd.getCreationDate(n));
			}
		}else {
			System.out.println("there is no band create one with the number in console");
		}
		
	}
	


}
