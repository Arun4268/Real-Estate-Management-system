package com.keane.training.web.handlers;

import com.keane.training.dao.DAOAppException;

import com.keane.training.dao.RegisterDAO;

import com.keane.training.domain.Booking;
import com.keane.mvc.HttpRequestHandler;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProList
 */
@WebServlet("/BookingDetails")
public class BookingDetails extends HttpServlet implements HttpRequestHandler {
	
    public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/html");
    	RegisterDAO dao = new RegisterDAO();
       

        try {
        	
           List<Booking> booking = dao.ListBooking();
            
            RequestDispatcher dispatcher = request.getRequestDispatcher("BookingDetails.jsp");
            request.setAttribute("booking", booking);
            dispatcher.forward(request, response);
        } catch (DAOAppException e) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp");
            request.setAttribute("Err", e.getMessage());
            dispatcher.forward(request, response);
        }
    }

}