package co.edu.uptc.control;

import java.util.Scanner;
import co.edu.uptc.model.Musician;

public class MusicianControl extends PerformerControl{
	
	Musician musc= new Musician();
	
	public MusicianControl() {
		super();
		musc=new Musician();
	}
	public void createMusican(int year,int month,int day,int n) {
		musc.setBirthDate(year, month, day, n);
	}
	public void detailBand(Scanner sc,int artistLength, int n,int id) {
		for(int i =0; i<artistLength; i++ ) {
			super.listPerformer(i, id);
		}
		System.out.println("which artist do you want to add like a musician");
		int performer =sc.nextInt();
		System.out.println("put the year that he/she was born");
		int year=sc.nextInt();
		System.out.println("put the monrh that he/she was born");
		int month=sc.nextInt();
		System.out.println("put the day that he/she was bonr");
		int day=sc.nextInt();
	}
	public void deleteMusican(int n) {
		super.deletePerformer(n);
		musc.setBirthDate(0, 0, 0, n);
	}
	

}
