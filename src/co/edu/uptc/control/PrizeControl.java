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
		String name =sc.nextLine();
		System.out.println("put the name of the organization");
		String organization=sc.nextLine();
		System.out.println("write the album description");
		String description=sc.nextLine();
		System.out.println("put the hours of the album");
		boolean numberVerif=true;
		int year=0;
		while(numberVerif)
		{
			System.out.println("put the year of the album");
			String yearString=sc.nextLine();
			try {
				year=Integer.parseInt(yearString);
				if(year<1860 || year> 2024) {
					System.out.println("This year is invalid, can not be less than 1860 and greater than 2024");
				}else {
				numberVerif=false;
				}
			}catch(NumberFormatException e){
				System.out.println("the year needs to be a number");
			}
		}
		numberVerif=true;
		int month=0;
		while(numberVerif)
		{
			System.out.println("put the month of the album");
			String monthString=sc.nextLine();
			try {
				month=Integer.parseInt(monthString);
				if(month<1 || month>12) {
					System.out.println("This month is invalid, can not be less than 1 and greater than 12");
				}else {
				numberVerif=false;
				}
			}catch(NumberFormatException e){
				System.out.println("the month needs to be a number");
			}
		}
		numberVerif=true;
		int date=0;
		while(numberVerif)
		{
			System.out.println("put the day of the album");
			String dateString=sc.nextLine();
			try {
				date=Integer.parseInt(dateString);
				if(date<0 || date>31) {
					System.out.println("This year is invalid, can not be less than 1 and greater than 31");
				}else {
				numberVerif=false;
				}
			}catch(NumberFormatException e){
				System.out.println("the day needs to be a number");
			}
		}
		createPrize(organization,name,description,year,month,date,n);
	}
	public void setArrayAlbum(int n) {
		prz.setArrays(n);
	}
	public void setId(int id,int n) {
		prz.setId(id, n);
		
	}
	public void listPrizes(int n,int id)
	{
		if(prz.getName(n)!=null)
		{
			if(id==prz.getId(n))
			{
				System.out.println(prz.getOrganization(n));
				System.out.println(prz.getName(n));
				System.out.println(prz.getDescription(n));
				System.out.println(prz.getPremiationDate(n));
				
			}
		}else {
			System.out.println("there is no prize");
		}
		
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
