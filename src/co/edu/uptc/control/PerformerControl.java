package co.edu.uptc.control;

import java.util.Scanner;

import co.edu.uptc.model.Performer;

public class PerformerControl {

	static Performer pr = new Performer();
	
	public static void createPerformer(String nameArtist, String imageArtist, String descriptionArtist, int n) {
		pr.setNameArtist(nameArtist, n);
		pr.setImageArtist(imageArtist, n);
		pr.setDescriptionArtist(descriptionArtist, n);
		
	}
	public static void detailPerformer(Scanner sc, int n) {
		System.out.println("put the name of the Artist");
		String nameArt = sc.next();
		System.out.println("put the url of the image of the artist");
		String imageArt = sc.next();
		System.out.println("Put the description of the artist");
		String descrArt = sc.next();
		createPerformer(nameArt, imageArt, descrArt, n);
	}
}
