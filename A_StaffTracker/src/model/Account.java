package model;

public class Account {
	int id;
	String email;
	String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Account(int id, String email, String password) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
	}
	
}
