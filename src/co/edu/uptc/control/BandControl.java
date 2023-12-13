package co.edu.uptc.control;

import java.util.Scanner;

import co.edu.uptc.model.Band;

public class BandControl extends PerformerControl {
	Band bd = new Band();
	public void createBand(String nameArtist, String imageArtist, String descriptionArtist, int year, int month, int day, int n) {
		super.createPerformer(nameArtist, imageArtist, descriptionArtist, n);
		bd.setCreationDate(year, month, day, n);
	}
	public void detailBand(Scanner sc, int n) {
		System.out.println("put the name of the principal artist");
		String nameArt = sc.next();
		System.out.println("put the number of the member of the band");
		int opc = sc.nextInt();
		for(int i =0; i<opc; i++ ) {
			System.out.println("put the name of the Artists");
			nameArt = sc.next();
		}
		System.out.println("put the url of the image of the artist");
		String imageArt = sc.next();
		System.out.println("Put the description of the artist");
		String descrArt = sc.next();
		System.out.println("put the year that was released the album");
		int year=sc.nextInt();
		System.out.println("put the month(1-12) that was released the album");
		int month=sc.nextInt()-1;
		System.out.println("put the day that was released the album");
		int date=sc.nextInt();
		createBand(nameArt, imageArt, descrArt, year, month, date, n);
	}
	public void setArrayBand(int n){
		bd.setArrays(n);
	}
	public void deleteBand(int n) {
		super.deletePerformer(n);
		bd.setCreationDate(0, 0, 0, n);
	}
	public void listBand(int n) {
		super.listPerformer(n, n);
		System.out.println(bd.getCreationDate(n));
	}
	


}
