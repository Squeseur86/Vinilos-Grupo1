package co.edu.uptc.model;

import java.util.Calendar;
import java.util.Date;
import java.time.Duration;

public class Album {
	private String name;
	private String cover;
	private String description;
	private Calendar releaseDate = Calendar.getInstance();
	private String genre;
	private Duration recordLabel;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCover() {
		return cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getReleaseDate() {
		return releaseDate.getTime();
	}
	public void setReleaseDate(int year,int month,int date) {
		this.releaseDate.clear();
		this.releaseDate.set(year, month, date);
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Duration getRecordLabel() {
		return recordLabel;
	}
	public void setRecordLabel(int hours,int minutes,int seconds) {
		recordLabel = Duration.ofHours(hours).plusMinutes(minutes).plusSeconds(seconds);
	}
	
	
}
