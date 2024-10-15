package com.keane.training.domain;

public class Seller {
	private int sid;
	private String Name;
	private String Email;
	private String contactnumber;
	private String Password;

	
	
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}

    public String getName() {
		return Name;
	}
    public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	public Seller() {
		super();
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Seller [sid");
		builder.append(sid);
		builder.append(", Name=");
		builder.append(Name);
		builder.append(", Email=");
		builder.append(Email);
		builder.append(", contactnumber=");
		builder.append(contactnumber);
		builder.append(", Password=");
		builder.append(Password);
		builder.append("]");
		return builder.toString();
	}





}
