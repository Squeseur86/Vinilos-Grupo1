package co.edu.uptc.model;

public class Performer {
	String nameArtist[];
	String imageArtist[];
	String descriptionArtist[];
	public String getNameArtist(int n) {
		return nameArtist[n];
	}
	public void setNameArtist(String nameArtist, int n) {
		this.nameArtist[n] = nameArtist;
	}
	public String getImageArtist(int n) {
		return imageArtist[n];
	}
	public void setImageArtist(String imageArtist, int n) {
		this.imageArtist[n] = imageArtist;
	}
	public String getDescriptionArtist(int n) {
		return descriptionArtist[n];
	}
	public void setDescriptionArtist(String descriptionArtist, int n) {
		this.descriptionArtist[n] = descriptionArtist;
	}
	public void setArrays(int nAl) {
		nameArtist = new String[nAl];
		imageArtist = new String[nAl];
		descriptionArtist = new String[nAl];
		
	}
	
	
}
