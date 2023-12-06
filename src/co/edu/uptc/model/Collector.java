package co.edu.uptc.model;

import java.time.Duration;

public class Collector {
	private String userName;
	private String numTellphone;
	private String email;
	private String password;
	private String message[];
	private String raiting[];
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getNumTellphone() {
		return numTellphone;
	}
	public void setNumTellphone(String numTellphone) {
		this.numTellphone = numTellphone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMessage(int m) {
		return message[m];
	}
	public void setMessage(String message, int m) {
		this.message[m] = message;
	}

	public String getRaiting(int m) {
		return raiting[m];
	}
	public void setRaiting(String raiting, int m) {
		this.raiting[m] = raiting;
	}
	public void setArrays(int nAl) {
		message = new String[nAl];
		raiting = new String[nAl];
	}
	

}
