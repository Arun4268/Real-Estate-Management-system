package com.keane.training.domain;

public class Buyer {
private int buyid;
private String Name;
private String Email;
private String contactnumber;
private String Password;
/**
 * @return the buyid
 */
public int getBuyid() {
	return buyid;
}
/**
 * @param buyid the buyid to set
 */
public void setBuyid(int buyid) {
	this.buyid = buyid;
}
/**
 * @return the name
 */
public String getName() {
	return Name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	Name = name;
}
/**
 * @return the email
 */
public String getEmail() {
	return Email;
}
/**
 * @param email the email to set
 */
public void setEmail(String email) {
	Email = email;
}
/**
 * @return the contactnumber
 */
public String getContactnumber() {
	return contactnumber;
}
/**
 * @param contactnumber the contactnumber to set
 */
public void setContactnumber(String contactnumber) {
	this.contactnumber = contactnumber;
}
/**
 * @return the password
 */
public String getPassword() {
	return Password;
}
/**
 * @param password the password to set
 */
public void setPassword(String password) {
	Password = password;
}

@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Buyer [buyid=");
	builder.append(buyid);
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
