package com.keane.training.domain;

public class Deal {
private int dealid;
private int pid;
private int sid;
private int buyid;
private String deal_Status;
/**
 * @return the dealid
 */
public int getDealid() {
	return dealid;
}
/**
 * @param dealid the dealid to set
 */
public void setDealid(int dealid) {
	this.dealid = dealid;
}
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
 * @return the deal_Status
 */
public String getDeal_Status() {
	return deal_Status;
}
/**
 * @param deal_Status the deal_Status to set
 */
public void setDeal_Status(String deal_Status) {
	this.deal_Status = deal_Status;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Deal [dealid=");
	builder.append(dealid);
	builder.append(", pid=");
	builder.append(pid);
	builder.append(", sid=");
	builder.append(sid);
	builder.append(", buyid=");
	builder.append(buyid);
	builder.append(", deal_Status=");
	builder.append(deal_Status);
	builder.append("]");
	return builder.toString();
}


}