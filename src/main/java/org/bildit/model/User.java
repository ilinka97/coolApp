package org.bildit.model;

public class User {

	private int userId;
    private String email;
    private String password;
    private String lName;
    private String fName;
    private String streetAdress;
    private String city;
    
    
	public User() {
		
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getStreetAdress() {
		return streetAdress;
	}
	public void setStreetAdress(String streetAdress) {
		this.streetAdress = streetAdress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
    
    
    
    
}
