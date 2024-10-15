package com.keane.training.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.keane.dbfw.ResultMapper;
import com.keane.training.domain.Admin;
import com.keane.training.domain.Booking;
import com.keane.training.domain.Buyer;
import com.keane.training.domain.Deal;
import com.keane.training.domain.Property;
import com.keane.training.domain.Seller;


public class SqlMapper {

	// database : mydb
	// table Name : user_info 
	// fields :  portalid(int (6)), name (varchar), employeeid(int 6), technology (varchar), password (varchar)
	
	
	public static final String FETCH_SELLER = "select sid,Name,Email,contactnumber,Password from tbl_seller where Email=?";
	public static final String ADD_SELLER = "insert into tbl_seller values(?,?,?,?,?)";           
	public static final String FETCH_BUYER = "select buyid,Name,Email,contactnumber,Password from tbl_buyer where Email=?";
	public static final String ADD_BUYER = "insert into tbl_buyer values(?,?,?,?,?)";           
	public static final String FETCH_ADMIN = "select aid,Name,Email,contactnumber,Password from tbl_admin where Email=?";
	public static final String ADD_ADMIN = "insert into tbl_admin values(?,?,?,?,?)";           
	public static final String FETCH_PROPERTY= "select * from tbl_property";
	public static final String ADD_PROPERTY = "insert into tbl_property values(?,?,?,?,?,?)";           
	public static final String ADD_BOOKING = "insert into tbl_booking values(?,?,?,?,?)";    
	public static final String FETCH_BOOKING= "select * from tbl_booking";
	public static final String ADD_DEAL= "insert into tbl_deal values(?,?,?,?,?)";
	public static final String FETCH_DEAL = "select dealid,pid,sid,buyid,deal_Status from tbl_deal where dealid=?";
	
	
	public static final ResultMapper MAP_SELLER = new ResultMapper() {

		@Override
		public Object mapRows(ResultSet rs) throws SQLException {
			Seller user = new Seller();
			user.setEmail(rs.getString("Email"));
			user.setPassword(rs.getString("Password"));
			
			return user;
			
		}		
	
};


public static final ResultMapper MAP_BUYER = new ResultMapper() {

	@Override
	public Object mapRows(ResultSet rs) throws SQLException {
		Buyer user = new Buyer();
		user.setEmail(rs.getString("Email"));
		user.setPassword(rs.getString("Password"));
		
		return user;
		
	}		

};

public static final ResultMapper MAP_ADMIN = new ResultMapper() {

	@Override
	public Object mapRows(ResultSet rs) throws SQLException {
		Admin user = new Admin();
		user.setEmail(rs.getString("Email"));
		user.setPassword(rs.getString("Password"));
		
		return user;
		
	}		

};

public static final ResultMapper MAP_PROPERTY = new ResultMapper()
{
	
	@Override
	public Object mapRows(ResultSet rs) throws SQLException {
		Property property = new Property();
		property.setPid(rs.getInt("pid"));
		property.setSid(rs.getInt("sid"));
		property.setLocation(rs.getString("location"));
		property.setProperty_type(rs.getString("property_type"));
		property.setBudget(rs.getString("budget"));
		property.setAvailability(rs.getString("Availability"));

		
		return property;
		
			
	}
};

public static final ResultMapper MAP_BOOKING = new ResultMapper()
{
	
	@Override
	public Object mapRows(ResultSet rs) throws SQLException {
		Booking property = new Booking();
		property.setBid(rs.getInt("bid"));
		property.setPrid(rs.getInt("prid"));
		property.setBooking_date(rs.getDate("booking_date"));
		property.setPay_mode(rs.getString("pay_mode"));
		property.setBuyid(rs.getInt("buyid"));
		
		
		return property;
		
			
	}
};


public static final ResultMapper MAP_DEAL = new ResultMapper() {

	@Override
	public Object mapRows(ResultSet rs) throws SQLException {
		Deal user = new Deal();
		user.setDealid(rs.getInt("dealid"));
	
		return user;
		
	}		

};


}
	
	
	
	
	
	
	