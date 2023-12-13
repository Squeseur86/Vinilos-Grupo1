package co.edu.uptc.control;

import java.util.Scanner;
import co.edu.uptc.model.Prize;

public class PrizeControl {
	static Prize prz = new Prize();
	public PrizeControl()
	{
		prz=new Prize();
	}
	public static void createPrize(String organization,String name,String description,int year,int month,int day,int n) {
		prz.setOrganization(organization, n);
		prz.setName(name, n);
		prz.setDescription(description, n);
		prz.setPremiationDate(year, month, day, n);
	}
	
	public static void detailPrize(Scanner sc,int n) {
		System.out.println("put the name of the album");
		String name =sc.next();
		System.out.println("put the name of the organization");
		String organization=sc.next();
		System.out.println("write the album description");
		String description=sc.next();
		System.out.println("put the hours of the album");
		System.out.println("put the year that was recive the prize");
		int year=sc.nextInt();
		System.out.println("put the month(1-12) that was recive the price");
		int month=sc.nextInt()-1;
		System.out.println("put the day that was recive the prize");
		int date=sc.nextInt();
		createPrize(organization,name,description,year,month,date,n);
	}
	public void setArrayAlbum(int n) {
		prz.setArrays(n);
	}
	public void setPricedate(Scanner sc,int n) {
		int year=sc.nextInt();
		System.out.println("put the month(1-12) that was recive the price");
		int month=sc.nextInt()-1;
		System.out.println("put the day that was recive the prize");
		int date=sc.nextInt();
		prz.setPremiationDate(year, month, date, n);
	}
}
