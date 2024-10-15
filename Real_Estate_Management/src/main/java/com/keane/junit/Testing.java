package com.keane.junit;


import static org.junit.Assert.*;

import java.sql.Date;
import java.util.List;

import org.junit.Test;

import com.keane.training.dao.DAOAppException;
import com.keane.training.dao.*;

import com.keane.training.domain.*;

public class Testing {

	
	@Test
    public void testregisterSeller() throws DAOAppException {
        // Create a sample product
        Seller seller = new Seller();
        seller.setSid(11);
        seller.setName("tej");
        seller.setEmail("tej@gmail.com");
        seller.setContactnumber("9845575464");
        seller.setPassword("NttData@11");

        // Create an instance of the RegisterDao
        RegisterDAO registerDao = new RegisterDAO();

        // Call the registerSeller method
        int result = registerDao.registerSeller(seller);

        // Assert that the result is successful (greater than 0)
        assertTrue(result > 0);
    }
}