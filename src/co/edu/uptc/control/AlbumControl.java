package co.edu.uptc.control;

import co.edu.uptc.model.Album;

public class AlbumControl {
	Album a1 = new Album();
	
	public AlbumControl(){
		a1=new Album();
		
	}
	 
	public void createAlbum(String name,String cover,String description,int year,int month,int date,String genre,int hours,int minutes,int seconds) {
		a1.setName(name);
		a1.setCover(cover);
		a1.setDescription(description);
		a1.setReleaseDate(year, month, date);
		a1.setGenre(genre);
		a1.setRecordLabel(hours, minutes, seconds);	
	}
	public void showAlbum() {
		System.out.println("name: "+a1.getName() );
		System.out.println("cover: "+a1.getCover() );
		System.out.println("description: "+a1.getDescription() );
		System.out.println("realse date: "+a1.getReleaseDate() );
		System.out.println("genre: "+a1.getGenre() );
		System.out.println("Record Label: "+a1.getRecordLabel() );

	}
}
