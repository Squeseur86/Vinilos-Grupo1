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
	public void createMessage(String message, int raiting) {
		cl.setMessage(message);
		cl.setRaiting(raiting);
	}

}
