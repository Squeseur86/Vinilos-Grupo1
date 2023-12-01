package co.edu.uptc.control;

import co.edu.uptc.model.Collector;


public class CollectorControl {
	static Collector cl = new Collector();
	
	public void registCollector(String userName, String numTellphone, String email, String password) {
		cl.setUserName(userName);
		cl.setNumTellphone(numTellphone);
		cl.setEmail(email);
		cl.setPassword(password);
	}
	public void createMessage(String message) {
		cl.setMessage(message);
	}
	public void collectorMenuShop() {
		System.out.println("1.show albums");
		System.out.println("2.buy a album");
		System.out.println("3.show cart");
		System.out.println("4.exit shop");
	}
	public boolean verifyCollector(String userName,String password) {
		if(userName.equals(cl.getUserName())&&password.equals(cl.getPassword())) {
			System.out.println("Hi there "+userName);
			return true;
		}else {
			System.out.println("fail try again");
			return false;
		}
	}
	
}
