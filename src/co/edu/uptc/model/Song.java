package co.edu.uptc.model;


import java.time.Duration;
import java.util.Calendar;

public class Song {
	private String nameSong;
	private String yearRelease;
	private String genreSong;
	private Duration recordSong;
	public String getNameSong() {
		return nameSong;
	}
	public void setNameSong(String nameSong) {
		this.nameSong = nameSong;
	}
	public String getYearRelease() {
		return yearRelease;
	}
	public void setYearRelease(String yearRelease) {
		this.yearRelease = yearRelease;
	}
	public String getGenreSong() {
		return genreSong;
	}
	public void setGenreSong(String genreSong) {
		this.genreSong = genreSong;
	}
	public Duration getRecordSong() {
		return recordSong;
	}
	public void setRecordSong(int minutes, int seconds) {
		this.recordSong = Duration.ofMinutes(minutes).plusSeconds(seconds);
}
}
