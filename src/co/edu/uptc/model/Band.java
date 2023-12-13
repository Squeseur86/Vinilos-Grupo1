package co.edu.uptc.model;

import java.util.Calendar;
import java.util.Date;

public class Band extends Performer{
	private Calendar creationDate;

	public Date getCreationDate() {
		return creationDate.getTime();
	}

	public void setCreationDate(int year, int month, int day) {
		creationDate = Calendar.getInstance();
		this.creationDate.set(year, month, day);
	}
	

	public Band(String[] nameArtist, String[] imageArtist, String[] descriptionArtist, int[] id, Calendar creationDate) {
		super(nameArtist, imageArtist, descriptionArtist, id);
		this.creationDate = creationDate;
	}

	public Band() {
		// TODO Auto-generated constructor stub
	}


	
}
