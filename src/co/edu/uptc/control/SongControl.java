package co.edu.uptc.control;

import java.time.Duration;

import co.edu.uptc.model.Song;

public class SongControl {
	static Song sg = new Song();
	
	public void createSong(String nameSong, String yearRelease, String genreSong,int minutes, int seconds) {
		sg.setNameSong(nameSong);
		sg.setYearRelease(yearRelease);
		sg.setGenreSong(genreSong);
		sg.setRecordSong(minutes, seconds);
	}
	public void delateSong() {
		sg.setNameSong("");
		sg.setYearRelease("");
		sg.setGenreSong("");
		sg.setRecordSong(0, 0);
	}
	public void showSong() {
		System.out.println("song: "+ sg.getNameSong());
		System.out.println("Year release: "+ sg.getYearRelease());
		System.out.println("Genre song: "+ sg.getGenreSong());
		System.out.println("Record Label: "+ sg.getRecordSong());	
	}
	public void EditSong(String nameSong,String yearRelease,String genreSong,int minutes,int seconds)
	{
		sg.setNameSong(nameSong);
		sg.setYearRelease(yearRelease);
		sg.setGenreSong(genreSong);
		sg.setRecordSong(minutes, seconds);
		
	}
}
