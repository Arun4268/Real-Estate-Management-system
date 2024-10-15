package com.keane.training.domain;

public class Admin {
private int aid;
private String Name;
private String Email;
private String contactnumber;
private String Password;
/**
 * @return the aid
 */
public int getAid() {
	return aid;
}
/**
 * @param aid the aid to set
 */
public void setAid(int aid) {
	this.aid = aid;
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
	builder.append("Admin [aid=");
	builder.append(aid);
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
