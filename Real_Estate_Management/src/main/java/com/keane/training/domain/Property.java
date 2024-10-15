package com.keane.training.domain;

public class Property {
private int pid;
private int sid;
private String location;
private String property_type;
private String budget;
private String Availability;
/**
 * @return the pid
 */
public int getPid() {
	return pid;
}
/**
 * @param pid the pid to set
 */
public void setPid(int pid) {
	this.pid = pid;
}
/**
 * @return the sid
 */
public int getSid() {
	return sid;
}
/**
 * @param sid the sid to set
 */
public void setSid(int sid) {
	this.sid = sid;
}
/**
 * @return the location
 */
public String getLocation() {
	return location;
}
/**
 * @param location the location to set
 */
public void setLocation(String location) {
	this.location = location;
}
/**
 * @return the property_type
 */
public String getProperty_type() {
	return property_type;
}
/**
 * @param property_type the property_type to set
 */
public void setProperty_type(String property_type) {
	this.property_type = property_type;
}
/**
 * @return the budget
 */
public String getBudget() {
	return budget;
}
/**
 * @param budget the budget to set
 */
public void setBudget(String budget) {
	this.budget = budget;
}
/**
 * @return the availability
 */
public String getAvailability() {
	return Availability;
}
/**
 * @param availability the availability to set
 */
public void setAvailability(String availability) {
	Availability = availability;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Property [pid=");
	builder.append(pid);
	builder.append(", sid=");
	builder.append(sid);
	builder.append(", location=");
	builder.append(location);
	builder.append(", property_type=");
	builder.append(property_type);
	builder.append(", budget=");
	builder.append(budget);
	builder.append(", Availability=");
	builder.append(Availability);
	builder.append("]");
	return builder.toString();
}


}
