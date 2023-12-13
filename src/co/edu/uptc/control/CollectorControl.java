package co.edu.uptc.control;

import java.util.Scanner;

import co.edu.uptc.model.Collector;


public class CollectorControl {
	private int comments = 0;
	static Collector cl = new Collector();
	
	public void registCollector(String userName, String numTellphone, String email, String password) {
		cl.setUserName(userName);
		cl.setNumTellphone(numTellphone);
		cl.setEmail(email);
		cl.setPassword(password);
	}
	public void createMessage(String message, String raiting, int m) {
		cl.setMessage(message, m);
		cl.setRaiting(raiting,m);
	}
<<<<<<< HEAD
	public void setArrayMessage(int m) {
		cl.setArrays(m);
	}
	public void detailmesage(Scanner sc, int n){
		
		System.out.println("Do you want create a new message, 1 yes, 2 no");
		int opcC = sc.nextInt();
		if(opcC ==1 ) {

			System.out.println("let your raiting of 1-5");
			String raitcad ;
			raitcad= sc.next();
			int raiting = Integer.parseInt(raitcad);
			while(raiting<0 || raiting > 5) {
				System.out.println("This raiting is invalid");
				raiting = sc.nextInt();
			}
			System.out.println("let your message");
			String message;
			message= sc.next();
			System.out.println(comments);
			createMessage(message, raitcad, comments);
			comments = comments +1;
		}else {
			System.out.println("Return to the album menu");
		}

	}
	public void listMessage(int n) {
		
			System.out.println(cl.getMessage(n));
			System.out.println("raiting:"+ cl.getRaiting(n));
		
	}
=======
>>>>>>> 1f1637cb774a81133069be5eae541f09c0e62463
	public void collectorMenuShop() {
		System.out.println("1.show albums");
		System.out.println("2.buy a album");
		System.out.println("3.show cart");
		System.out.println("4.exit shop");
	}
	public boolean verifyCollector(String userName,String password) {
		if(userName.equals(cl.getUserName())&&password.equals(cl.getPassword())) {
			System.out.println("Hi there "+userName);
<<<<<<< HEAD
			return false;
		}else {
			System.out.println("fail try again");
			return true;
		}
	}
=======
			return true;
		}else {
			System.out.println("fail try again");
			return false;
		}
	}
	
>>>>>>> 1f1637cb774a81133069be5eae541f09c0e62463
}
