package co.edu.uptc.control;

import java.util.Scanner;

import co.edu.uptc.model.Collector;

public class CollectorControl {
	static Collector cl = new Collector();
	
	public void registCollector(String userName, String numTellphone, String email, String password) {
		cl.setUserName(userName);
		cl.setNumTellphone(numTellphone);
		cl.setEmail(email);
		cl.setPassword(password);
	}
	public void createMessage(String message, String raiting, int m) {
		cl.setMessage(message,m);
		cl.setRaiting(raiting,m);
	}
	public void setArrayMessage(int m) {
		cl.setArrays(m);
	}
	public void listMessgae(int m) {
		System.out.println("raiting:"+ cl.getRaiting(m));
		System.out.println("message:" + cl.getMessage(m));
	}
	public void detailmesage(Scanner sc, int n){
		int comments = 0;
		System.out.println("Do you want create a new message, 1 yes, 2 no");
		int opcC = sc.nextInt();
		if(opcC ==1 ) {

			comments = comments +1;
			System.out.println("let your raiting of 1-5");
			String raitcad = sc.next();
			int raiting = Integer.parseInt(raitcad);
			while(raiting<0 || raiting > 5) {
				System.out.println("This raiting is invalid");
				raiting = sc.nextInt();
			}
			System.out.println("let your message");
			String message = sc.next();
			createMessage(message, raitcad, comments);
		}else {
			System.out.println("Return to the album menu");
		}

	}

}
