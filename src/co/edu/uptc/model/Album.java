package co.edu.uptc.model;

import java.util.Calendar;
import java.util.Date;
import java.time.Duration;

public class Album {
	private String name[];
	private String cover[];
	private String description[];
	private Calendar[] releaseDate;
	private String genre[];
	private int price[];
	private Duration recordLabel[];
	public String getName(int n) {
		return name[n];
	}
	public void setName(String name,int n) {
		this.name[n] = name;
	}
	public String getCover(int n) {
		return cover[n];
	}
	public void setCover(String cover,int n) {
		this.cover[n] = cover;
	}
	public String getDescription(int n) {
		return description[n];
	}
	public void setDescription(String description,int n) {
		this.description[n] = description;
	}
	public Date getReleaseDate(int n) {
		return releaseDate[n].getTime();
	}
	public void setReleaseDate(int year,int month,int date,int n) {
		releaseDate[n]=Calendar.getInstance();
		this.releaseDate[n].set(year, month, date,0,0,0);
		this.releaseDate[n].set(Calendar.MILLISECOND, 0);
	}
	public String getGenre(int n) {
		return genre[n];
	}
	public void setGenre(String genre,int n) {
		this.genre[n] = genre;
	}
	public Duration getRecordLabel(int n) {
		return recordLabel[n];
	}
	public void setRecordLabel(int hours,int minutes,int seconds,int n) {
		recordLabel[n] = Duration.ofHours(hours).plusMinutes(minutes).plusSeconds(seconds);
	}
	public void setArrays(int nAl) {
		name= new String[nAl] ;
		cover= new String[nAl];
		description= new String[nAl];
		releaseDate= new Calendar[nAl];
		genre = new String[nAl];
		recordLabel=new Duration[nAl];
		price = new int[nAl];
	}
	public void restartDate(int n) {
		releaseDate[n].clear();;
	}
	public int getPrice(int n) {
		return price[n];
	}
	public void setPrice( int price,int n) {
		this.price[n] = price;
	}

}
