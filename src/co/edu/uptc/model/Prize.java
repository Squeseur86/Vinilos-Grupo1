package co.edu.uptc.model;

import java.util.Calendar;
import java.util.Date;

public class Prize {
	private String organization[];
	private String name[];
	private String description[];
	private Calendar premiationDate[];
	private int id[];
	
	public String getOrganization(int n) {
		return organization[n];
	}
	public void setOrganization(String organization,int n) {
		this.organization[n] = organization;
	}
	public String getName(int n) {
		return name[n];
	}
	public void setName(String name,int n ) {
		this.name[n] = name;
	}
	public String getDescription(int n) {
		return description[n];
	}
	public void setDescription(String description,int n) {
		this.description[n] = description;
	}
	
	public Date getPremiationDate(int n) {
		return premiationDate[n].getTime();
	}
	public void setPremiationDate(int year,int month,int day,int n) {
		this.premiationDate[n]= Calendar.getInstance();
		this.premiationDate[n].set(year, month, day);
		this.premiationDate[n].set(Calendar.MILLISECOND, 0);
	}
	
	public int getId(int n) {
		return id[n];
	}
	public void setId(int id,int n) {
		this.id[n] = id;
	}
	public void setArrays(int n)
	{
		organization=new String[n];
		name=new String[n];
		description=new String[n];
		premiationDate=new Calendar[n];
		id= new int[n];
	}
	
}
