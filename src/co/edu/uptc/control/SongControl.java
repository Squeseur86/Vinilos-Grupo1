package co.edu.uptc.control;

import java.time.Duration;

import co.edu.uptc.model.Song;

public class SongControl {
	static Song sg = new Song();
	
	public void createSong(String nameSong, String yearRelease, String genreSong,int minutes, int seconds,int n) {
		sg.setNameSong(nameSong,n);
		sg.setYearRelease(yearRelease,n);
		sg.setGenreSong(genreSong,n);
		sg.setRecordSong(minutes, seconds,n);
	}
	public void delateSong(int n) {
		sg.setNameSong("",n);
		sg.setYearRelease("",n);
		sg.setGenreSong("",n);
		sg.setRecordSong(0, 0,n);
	}
	public void setArrayAlbum(int n) {
		sg.setArrays(n);
	}
	public void listSongs(int n) {
		System.out.println("song: "+ sg.getNameSong(n));
		System.out.println("Year release: "+ sg.getYearRelease(n));
		System.out.println("Genre song: "+ sg.getGenreSong(n));
		System.out.println("Record Label: "+ sg.getRecordSong(n));	
	}
	public void EditSong(String nameSong,String yearRelease,String genreSong,int minutes,int seconds,int n)
	{
		sg.setNameSong(nameSong,n);
		sg.setYearRelease(yearRelease,n);
		sg.setGenreSong(genreSong,n);
		sg.setRecordSong(minutes, seconds,n);
		
	}
	
}
