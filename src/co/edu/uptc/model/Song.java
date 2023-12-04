package co.edu.uptc.model;


import java.time.Duration;
import java.util.Calendar;

public class Song {
	private String nameSong[];
	private String yearRelease[];
	private String genreSong[];
	private Duration recordSong[];
	public String getNameSong(int n) {
		return nameSong[n];
	}
	public void setNameSong(String nameSong,int n ) {
		this.nameSong[n] = nameSong;
	}
	public String getYearRelease(int n) {
		return yearRelease[n];
	}
	public void setYearRelease(String yearRelease,int n) {
		this.yearRelease[n] = yearRelease;
	}
	public String getGenreSong(int n) {
		return genreSong[n];
	}
	public void setGenreSong(String genreSong,int n) {
		this.genreSong[n] = genreSong;
	}
	public Duration getRecordSong(int n) {
		return recordSong[n];
	}
	public void setRecordSong(int minutes, int seconds,int n) {
		recordSong[n] = Duration.ofMinutes(minutes).plusSeconds(seconds);
	}
	public void setArrays(int nAl) {
		nameSong= new String[nAl];
		genreSong= new String[nAl];
		yearRelease = new String[nAl];
		recordSong=new Duration[nAl];
	}
}
