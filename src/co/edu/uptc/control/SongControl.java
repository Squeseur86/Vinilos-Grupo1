package co.edu.uptc.control;

import java.time.Duration;
import java.util.Scanner;

import co.edu.uptc.model.Song;

public class SongControl {
	
	AlbumControl a1=new AlbumControl();
	static Song sg = new Song();
	
	public void createSong(String nameSong, String yearRelease, String genreSong,int minutes, int seconds,int n) {;
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
	public void listSongs(int n, int id) {
		if(id==sg.getId(n)) {
			System.out.println("song number "+(n+1));
			System.out.println("song: "+ sg.getNameSong(n));
			System.out.println("Year release: "+ sg.getYearRelease(n));
			System.out.println("Genre song: "+ sg.getGenreSong(n));
			System.out.println("Record Label: "+ sg.getRecordSong(n));	
		}
	}
	public void EditSong(String nameSong,String yearRelease,String genreSong,int minutes,int seconds,int n){
		sg.setNameSong(nameSong,n);
		sg.setYearRelease(yearRelease,n);
		sg.setGenreSong(genreSong,n);
		sg.setRecordSong(minutes, seconds,n);
		
	}
	public void detailSong(Scanner sc, int n) {
		System.out.println("put the name of the song");
		String nameSong = sc.next();
		System.out.println("put the year relase of the song");
		String yearRelease = sc.next();
		System.out.println("put the genre of the song");
		String genreSong = sc.next();
		System.out.println("put the minutes of the song");
		int minutes=sc.nextInt();
		System.out.println("put the seconds of the song");
		int seconds=sc.nextInt();
		createSong(nameSong, yearRelease, genreSong, minutes, seconds,n);
	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
	public void setId(int n,int id)
	{
		sg.setId(n, id);
	}
}
