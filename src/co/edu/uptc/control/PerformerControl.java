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
	public void setArraysPerfor(int n)
	{
		pr.setArraysPerf(n);
	}
	public void setIdPerformer(int id,int n)
	{
		pr.setId(id, n);
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
<<<<<<< HEAD
	public void listArtist(int n) {
		System.out.println("namArtist : "+ pr.getImageArtist(n));
		System.out.println("image : " + pr.getImageArtist(n));
		System.out.println("description artist : "+ pr.getDescriptionArtist(n));
	}
	public void setArrayArtist(int n) {
		pr.setArrays(n);
=======
	public void deletePerformer(int n)
	{
	 pr.setNameArtist(null, n);
	 pr.setImageArtist(null, n);
	 pr.setDescriptionArtist(null, n);
	}
	public void listPerformer(int n,int id)
	{
		if(id==pr.getId(n))
		{
			System.out.println(pr.getNameArtist(n));
			System.out.println(pr.getImageArtist(n));
			System.out.println(pr.getDescriptionArtist(n));
		}
>>>>>>> d4966395e3dff2deead45b80c0e3488dfa577d3a
	}
}
