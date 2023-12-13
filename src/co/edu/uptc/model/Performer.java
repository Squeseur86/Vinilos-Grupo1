package co.edu.uptc.model;

public class Performer {
	String nameArtist[];
	String imageArtist[];
	String descriptionArtist[];

	int id[];
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
	
	
	public Performer(String[] nameArtist, String[] imageArtist, String[] descriptionArtist, int[] id) {
		super();
		this.nameArtist = nameArtist;
		this.imageArtist = imageArtist;
		this.descriptionArtist = descriptionArtist;
		this.id = id;
	}
	public Performer() {
		// TODO Auto-generated constructor stub
	}
	public int getId(int n) {
		return id[n];
	}
	public void setId(int id,int n) {
		this.id[n] = id;
	}
	public void setArraysPerf(int n)
	{
		nameArtist=new String[n];
		imageArtist= new String[n];
		descriptionArtist= new String[n];
		id=new int[n];
	}
	
}
