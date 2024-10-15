package com.keane.training.web.handlers;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.keane.mvc.HttpRequestHandler;
import com.keane.training.dao.DAOAppException;
import com.keane.training.dao.RegisterDAO;
import com.keane.training.domain.Booking;

public class InsertBooking implements HttpRequestHandler 
{

	static Logger log = Logger.getLogger(InsertBooking.class);

	
	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter(); 
		
		
		RegisterDAO dao = new RegisterDAO();
		Booking user= new Booking();
		


		user.setBid(Integer.parseInt(request.getParameter("bid")));
		user.setPrid(Integer.parseInt(request.getParameter("prid")));
	     user.setBooking_date(java.sql.Date.valueOf(request.getParameter("booking_date")));
		user.setPay_mode(request.getParameter("pay_mode"));
		user.setBuyid(Integer.parseInt(request.getParameter("buyid")));

		

	
		int finalResult;
		try {
			finalResult = dao.BookingInsert(user);
			if(finalResult>0) {
				out.println("<html><body><b>Property Booked Successfully"
                        + "</b></body></html>");
				
			}
		} catch (DAOAppException e) {
		
			e.printStackTrace();
		}
		
		
	}
}
