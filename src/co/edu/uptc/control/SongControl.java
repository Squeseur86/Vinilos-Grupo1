package co.edu.uptc.control;

import java.time.Duration;
import java.util.Scanner;

import org.junit.jupiter.api.IndicativeSentencesGeneration;

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
	public String nullSong(int n) {
		return sg.getNameSong(n);
	}
	public void detailSong(Scanner sc, int n) {
		boolean numberVerif=true;
		System.out.println("put the name of the song");
		String nameSong = sc.nextLine();
		System.out.println("put the year relase of the song");
		String yearRelease = sc.nextLine();
		System.out.println("put the genre of the song");
		String genreSong = sc.nextLine();
		
		int minutes=0;
		while(numberVerif)
		{
			System.out.println("put the minutes of the album");
			String minutesString=sc.nextLine();
			try {
				minutes=Integer.parseInt(minutesString);
				if(minutes<0 || minutes>60) {
					System.out.println("This year is invalid, can not be less than 0 and greater than 60");
				}else {
				numberVerif=false;
				}
			}catch(NumberFormatException e){
				System.out.println("the minutes needs to be a number");
			}
		}
		numberVerif=true;
		int seconds=0;
		while(numberVerif) {
			System.out.println("put the seconds of the album");
			String secondsString=sc.nextLine();
			try {
				seconds=Integer.parseInt(secondsString);
				if(seconds<0 || seconds>60) {
					System.out.println("This seconds is invalid, can not be less than 0 and greater than 60\"");
				}else{
				numberVerif=false;
				}
			}catch(NumberFormatException e){
				System.out.println("the seconds needs to be a number");
			}
		}
		 createSong(nameSong,yearRelease, genreSong, minutes, seconds,n);
	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
	public void setId(int n,int id)
	{
		sg.setId(n, id);
	}
}
