package co.edu.uptc.model;

import java.util.Calendar;
import java.util.Date;

import co.edu.uptc.model.Performer;

public class Musician extends Performer{
	Calendar birthDate[];
	int id[];
	public  Musician() {
		
	}
	public Date getBirthDate(int n) {
		
		return birthDate[n].getTime();
	}
	public void setBirthDate(int year,int month,int date ,int n) {
		this.birthDate[n]=Calendar.getInstance();
		this.birthDate[n].set(year, month, date,0,0,0);
		this.birthDate[n].set(Calendar.MILLISECOND, 0);
	}
	
	public int getId(int n) {
		return id[n];
	}
	public void setId(int id,int n) {
		this.id[n] = id;
	}
	public void setArray(int n)
	{
		birthDate =new Calendar[n];
		id = new int[n];
	}
	public Musician(String[] nameArtist, String[] imageArtist, String[] descriptionArtist, int[] id, Calendar[] birthDate) {
		super(nameArtist, imageArtist, descriptionArtist, id);
		this.birthDate = birthDate;
	}

}
