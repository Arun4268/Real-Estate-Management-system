package com.keane.training.domain;

import java.sql.Date;

public class Booking {
	
	
private int bid;
private int prid;
private Date booking_date;
private String pay_mode;
private int buyid;
/**
 * @return the bid
 */
public int getBid() {
	return bid;
}
/**
 * @param bid the bid to set
 */
public void setBid(int bid) {
	this.bid = bid;
}
/**
 * @return the prid
 */
public int getPrid() {
	return prid;
}
/**
 * @param prid the prid to set
 */
public void setPrid(int prid) {
	this.prid = prid;
}
/**
 * @return the booking_date
 */
public Date getBooking_date() {
	return booking_date;
}
/**
 * @param booking_date the booking_date to set
 */
public void setBooking_date(Date booking_date) {
	this.booking_date = booking_date;
}
/**
 * @return the pay_mode
 */
public String getPay_mode() {
	return pay_mode;
}
/**
 * @param pay_mode the pay_mode to set
 */
public void setPay_mode(String pay_mode) {
	this.pay_mode = pay_mode;
}
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
public Booking(int bid, int prid, String booking_date, String pay_mode, int buyid) {
	super();
	this.bid = bid;
	this.prid = prid;
	java.sql.Date date = java.sql.Date.valueOf(booking_date);
	this.booking_date = date;
	this.pay_mode = pay_mode;
	this.buyid = buyid;
}
public Booking() {
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Booking [bid=" + bid + ", prid=" + prid + ", booking_date=" + booking_date + ", pay_mode=" + pay_mode
			+ ", buyid=" + buyid + "]";
}


}
