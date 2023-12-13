package co.edu.uptc.model;

import java.util.Calendar;
import java.util.Date;

public class Band extends Performer{
	private Calendar[] creationDate;
	private int[] id;

	public Date getCreationDate(int n) {
		return creationDate[n].getTime();
	}

	public void setCreationDate(int year, int month, int day, int n) {
		creationDate[n] = Calendar.getInstance();
		this.creationDate[n].set(year, month, day);
	}
	
	
	public int getId(int n) {
		return id[n];
	}

	public void setId(int id,int n) {
		this.id[n] = id;
	}

	public Band(String[] nameArtist, String[] imageArtist, String[] descriptionArtist, int[] id, Calendar[] creationDate) {
		super(nameArtist, imageArtist, descriptionArtist, id);
		this.creationDate = creationDate;
	}

	public Band() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setArrays(int nAl) {
		// TODO Auto-generated method stub
		super.setArrays(nAl);
		creationDate = new Calendar[nAl];
		id= new int[nAl];
	}
	


	
}
