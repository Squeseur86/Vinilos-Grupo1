package co.edu.uptc.control;

import java.util.Scanner;
import co.edu.uptc.model.Musician;

public class MusicianControl extends PerformerControl{
	
	static Musician musc= new Musician();
	
	public MusicianControl() {
		super();
		musc=new Musician();
	}
	public static void createMusican(int year,int month,int day,int n) {
		musc.setBirthDate(year, month, day, n);
	}
	public void setArrayMusican(int n) {
		musc.setArray(n);
	}
	public void detailMusician(Scanner sc,int artistLength, int n,int id) {
		for(int i =0; i<artistLength; i++ ) {
			super.listPerformer(i, id);
		}
		int year=0;
		boolean numberVerif=true;
		int performer=0;
		int month=0;
		int day=0;
		while(numberVerif)
		{
			System.out.println("which artist do you want to add like a musician");
			String performerString=sc.nextLine();
			try {
				performer=Integer.parseInt(performerString);
				numberVerif=false;
			}catch(NumberFormatException e){
				System.out.println("put a valid perfomer number");
			}
		}
		if(super.nullPerforme(n)!=null)
		{
			numberVerif=true;
			
			while(numberVerif)
			{
				System.out.println("put the year that he/she was born");
				String yearString=sc.nextLine();
				try {
					int performr=Integer.parseInt(yearString);
					if(performr<1860 || performr> 2024) {
						System.out.println("This year is invalid, can not be less than 1860 and greater than 2024");
					}else {
					numberVerif=false;
					}
				}catch(NumberFormatException e){
					System.out.println("put year needs to be a number");
				}
			}
			numberVerif=true;
			
			while(numberVerif)
			{
				System.out.println("put the monrh that he/she was born");
				String monthString=sc.nextLine();
				try {
					performer=Integer.parseInt(monthString);
					if(performer<1 || performer>12) {
						System.out.println("This month is invalid, can not be less than 1 and greater than 12");
					}else {
					numberVerif=false;
					}
				}catch(NumberFormatException e){
					System.out.println("put month needs to be a number");
				}
			}
			numberVerif=true;
			
			while(numberVerif)
			{
				System.out.println("put the day that he/she was born");
				String dayString=sc.nextLine();
				try {
					performer=Integer.parseInt(dayString);
					if(performer<1 || performer>31) {
						System.out.println("This date is invalid, can not be less than 1 and greater than 31");
					}else {
					numberVerif=false;
					}
				}catch(NumberFormatException e){
					System.out.println("put month needs to be a number");
				}
			}
		}
		setId(n,id);
		createMusican(year, month, day, n);
	}
	public void deleteMusican(int n) {
		super.deletePerformer(n);
		musc.setBirthDate(0, 0, 0, n);
	}
	public void setId(int n,int id)
	{
		musc.setId(n, id);
	}
	public void listMusician(int n,int id)
	{	
		if(musc.getNameArtist(n)!=null)
		{
			if(id==pr.getId(n))
			{
				super.listPerformer(n, id);
				System.out.println(musc.getBirthDate(n));
			}else {
				System.out.println("there is no musician");
			}
		}
	}

}
