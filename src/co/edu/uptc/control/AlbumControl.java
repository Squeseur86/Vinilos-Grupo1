package co.edu.uptc.control;

import co.edu.uptc.model.Album;

public class AlbumControl {
	Album a1 = new Album();
	
	public AlbumControl(){
		a1=new Album();
		
	}
	 
	public void createAlbum(String name,String cover,String description,int year,int month,int date,String genre,int hours,int minutes,int seconds,int n) {
		a1.setName(name,n);
		a1.setCover(cover,n);
		a1.setDescription(description,n);
		a1.setReleaseDate(year, month, date,n);
		a1.setGenre(genre,n);
		a1.setRecordLabel(hours, minutes, seconds,n);	
	}
	public void listAlbum(int n) {
		System.out.println(n+1+" Album name: "+a1.getName(n) );
		System.out.println("cover: "+a1.getCover(n) );
		System.out.println("description: "+a1.getDescription(n) );
		System.out.println("realse date: "+a1.getReleaseDate(n) );
		System.out.println("genre: "+a1.getGenre(n) );
		System.out.println("Record Label: "+a1.getRecordLabel(n) );	
	}
	public void setArrayAlbum(int n) {
		a1.setArrays(n);
	}
}
