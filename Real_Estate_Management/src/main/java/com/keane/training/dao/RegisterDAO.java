package com.keane.training.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.keane.dbcon.ConnectionHolder;
import com.keane.dbcon.DBConnectionException;
import com.keane.dbfw.DBFWException;
import com.keane.dbfw.DBHelper;
import com.keane.dbfw.ParamMapper;
import com.keane.training.domain.Admin;
import com.keane.training.domain.Booking;
import com.keane.training.domain.Buyer;
import com.keane.training.domain.Deal;
import com.keane.training.domain.Property;
import com.keane.training.domain.Seller;

// EmployeeDao
// employee login
// register,
// deletion
// updation .. 

public class RegisterDAO {
	
	
	public int registerSeller(final Seller user) throws DAOAppException {
		ConnectionHolder ch = null;
		Connection con = null;
		int res = -1;
		
		ParamMapper mapper = new ParamMapper() 
		{
			@Override
			public void mapParams(PreparedStatement pStmt) throws SQLException
			{
				pStmt.setInt(1, user.getSid());
				pStmt.setString(2, user.getName());
				pStmt.setString(3, user.getEmail());
				pStmt.setString(4, user.getContactnumber());
				pStmt.setString(5, user.getPassword());
			}
		};
		  		try {
			ch = ConnectionHolder.getInstance();
			con = ch.getConnection();
			res = DBHelper.executeUpdate(con, SqlMapper.ADD_SELLER, mapper);

		} catch (DBConnectionException e) {
			throw new DAOAppException(e);
		} catch (DBFWException e) {
			throw new DAOAppException(e);
		}
		return res;
	}

	public boolean validateSeller(final String Email) throws DAOAppException {
		ConnectionHolder ch = null;
		Connection con = null;
		List users = null;

		ParamMapper paramMapper = new ParamMapper() {

			@Override
			public void mapParams(PreparedStatement pStmt) throws SQLException {
				pStmt.setString(1, Email);
			}
		};
		try {
			ch = ConnectionHolder.getInstance();
			con = ch.getConnection();
			users = DBHelper.executeSelect(con, SqlMapper.FETCH_SELLER,
					paramMapper, SqlMapper.MAP_SELLER);

		} catch (DBConnectionException e) {
			throw new DAOAppException(e);
		} catch (DBFWException e) {
			throw new DAOAppException(e);
		}

		return (users != null && users.size() > 0);

	}

	public int registerBuyer(final Buyer user) throws DAOAppException {
		ConnectionHolder ch = null;
		Connection con = null;
		int res = -1;
		
		ParamMapper mapper = new ParamMapper() 
		{
			@Override
			public void mapParams(PreparedStatement pStmt) throws SQLException
			{
				pStmt.setInt(1, user.getBuyid());
				pStmt.setString(2, user.getName());
				pStmt.setString(3, user.getEmail());
				pStmt.setString(4, user.getContactnumber());
				pStmt.setString(5, user.getPassword());
			}
		};
		  		try {
			ch = ConnectionHolder.getInstance();
			con = ch.getConnection();
			res = DBHelper.executeUpdate(con, SqlMapper.ADD_BUYER, mapper);

		} catch (DBConnectionException e) {
			throw new DAOAppException(e);
		} catch (DBFWException e) {
			throw new DAOAppException(e);
		}
		return res;
	}

	public boolean validateBuyer(final String Email) throws DAOAppException {
		ConnectionHolder ch = null;
		Connection con = null;
		List users = null;

		ParamMapper paramMapper = new ParamMapper() {

			@Override
			public void mapParams(PreparedStatement pStmt) throws SQLException {
				pStmt.setString(1, Email);
			}
		};
		try {
			ch = ConnectionHolder.getInstance();
			con = ch.getConnection();
			users = DBHelper.executeSelect(con, SqlMapper.FETCH_BUYER,
					paramMapper, SqlMapper.MAP_BUYER);

		} catch (DBConnectionException e) {
			throw new DAOAppException(e);
		} catch (DBFWException e) {
			throw new DAOAppException(e);
		}

		return (users != null && users.size() > 0);

	}

	public int registerAdmin(final Admin user) throws DAOAppException {
		ConnectionHolder ch = null;
		Connection con = null;
		int res = -1;
		
		ParamMapper mapper = new ParamMapper() 
		{
			@Override
			public void mapParams(PreparedStatement pStmt) throws SQLException
			{
				pStmt.setInt(1, user.getAid());
				pStmt.setString(2, user.getName());
				pStmt.setString(3, user.getEmail());
				pStmt.setString(4, user.getContactnumber());
				pStmt.setString(5, user.getPassword());
			}
		};
		  		try {
			ch = ConnectionHolder.getInstance();
			con = ch.getConnection();
			res = DBHelper.executeUpdate(con, SqlMapper.ADD_ADMIN, mapper);

		} catch (DBConnectionException e) {
			throw new DAOAppException(e);
		} catch (DBFWException e) {
			throw new DAOAppException(e);
		}
		return res;
	}

	public boolean validateAdmin(final String Email) throws DAOAppException {
		ConnectionHolder ch = null;
		Connection con = null;
		List users = null;

		ParamMapper paramMapper = new ParamMapper() {

			@Override
			public void mapParams(PreparedStatement pStmt) throws SQLException {
				pStmt.setString(1, Email);
			}
		};
		try {
			ch = ConnectionHolder.getInstance();
			con = ch.getConnection();
			users = DBHelper.executeSelect(con, SqlMapper.FETCH_ADMIN,
					paramMapper, SqlMapper.MAP_ADMIN);

		} catch (DBConnectionException e) {
			throw new DAOAppException(e);
		} catch (DBFWException e) {
			throw new DAOAppException(e);
		}

		return (users != null && users.size() > 0);

	}

	public int registerProperty(final Property user) throws DAOAppException {
		ConnectionHolder ch = null;
		Connection con = null;
		int res = -1;
		
		ParamMapper mapper = new ParamMapper() 
		{
			@Override
			public void mapParams(PreparedStatement pStmt) throws SQLException
			{
				pStmt.setInt(1, user.getPid());
				pStmt.setInt(2, user.getSid());
				pStmt.setString(3, user.getLocation());
				pStmt.setString(4, user.getProperty_type());
				pStmt.setString(5, user.getBudget());
				pStmt.setString(6, user.getAvailability());
			}
		};
		  		try {
			ch = ConnectionHolder.getInstance();
			con = ch.getConnection();
			res = DBHelper.executeUpdate(con, SqlMapper.ADD_PROPERTY, mapper);

		} catch (DBConnectionException e) {
			throw new DAOAppException(e);
		} catch (DBFWException e) {
			throw new DAOAppException(e);
		}
		return res;
	}
public List ListProperty() throws DAOAppException {
	   
		
		ConnectionHolder ch = null;
	    Connection con = null;
	    List products = null;

	    try {
	        ch = ConnectionHolder.getInstance();
	        con = ch.getConnection();
	        products = DBHelper.executeSelect(con, SqlMapper.FETCH_PROPERTY,SqlMapper.MAP_PROPERTY);
	                
	    } catch (DBConnectionException e) {
	        throw new DAOAppException(e);
	    } catch (DBFWException e) {
	        throw new DAOAppException(e);
	    }

	    return products;
	   
	}


public int BookingInsert(final Booking user) throws DAOAppException {
	ConnectionHolder ch = null;
	Connection con = null;
	int res = -1;
	
	ParamMapper mapper = new ParamMapper() 
	{
		@Override
		public void mapParams(PreparedStatement pStmt) throws SQLException
		{
			pStmt.setInt(1, user.getBid());
			pStmt.setInt(2, user.getPrid());
			pStmt.setDate(3, user.getBooking_date());
			pStmt.setString(4, user.getPay_mode());
			pStmt.setInt(5, user.getBuyid());
		
		}
	};
	  		try {
		ch = ConnectionHolder.getInstance();
		con = ch.getConnection();
		res = DBHelper.executeUpdate(con, SqlMapper.ADD_BOOKING, mapper);

	} catch (DBConnectionException e) {
		throw new DAOAppException(e);
	} catch (DBFWException e) {
		throw new DAOAppException(e);
	}
	return res;
}

public List ListBooking() throws DAOAppException {
   
	
	ConnectionHolder ch = null;
    Connection con = null;
    List booking = null;

    try {
        ch = ConnectionHolder.getInstance();
        con = ch.getConnection();
        booking = DBHelper.executeSelect(con, SqlMapper.FETCH_BOOKING,SqlMapper.MAP_BOOKING);
                
    } catch (DBConnectionException e) {
        throw new DAOAppException(e);
    } catch (DBFWException e) {
        throw new DAOAppException(e);
    }

    return booking;
   
}


public int GetDeal(final Deal user) throws DAOAppException {
	ConnectionHolder ch = null;
	Connection con = null;
	int res = -1;
	
	ParamMapper mapper = new ParamMapper() 
	{
		@Override
		public void mapParams(PreparedStatement pStmt) throws SQLException
		{
			pStmt.setInt(1, user.getDealid());
			pStmt.setInt(2, user.getPid());
			pStmt.setInt(3, user.getSid());
			pStmt.setInt(4, user.getBuyid());
			pStmt.setString(5, user.getDeal_Status());
			
		}
	};
	  		try {
		ch = ConnectionHolder.getInstance();
		con = ch.getConnection();
		res = DBHelper.executeUpdate(con, SqlMapper.ADD_DEAL, mapper);

	} catch (DBConnectionException e) {
		throw new DAOAppException(e);
	} catch (DBFWException e) {
		throw new DAOAppException(e);
	}
	return res;
}

public boolean validateDeal(final int dealid) throws DAOAppException {
	ConnectionHolder ch = null;
	Connection con = null;
	List users = null;

	ParamMapper paramMapper = new ParamMapper() {

		@Override
		public void mapParams(PreparedStatement pStmt) throws SQLException {
			pStmt.setInt(1, dealid);
		}
	};
	try {
		ch = ConnectionHolder.getInstance();
		con = ch.getConnection();
		users = DBHelper.executeSelect(con, SqlMapper.FETCH_DEAL,
				paramMapper, SqlMapper.MAP_DEAL);

	} catch (DBConnectionException e) {
		throw new DAOAppException(e);
	} catch (DBFWException e) {
		throw new DAOAppException(e);
	}

	return (users != null && users.size() > 0);

}



	}


