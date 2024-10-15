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
import com.keane.training.domain.Property;

public class RegisterProperty implements HttpRequestHandler 
{

	static Logger log = Logger.getLogger(RegisterProperty.class);

	
	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter(); 
		
		
		RegisterDAO dao = new RegisterDAO();
		Property user= new Property();
		
		
		

		user.setPid(Integer.parseInt(request.getParameter("pid")));
		user.setSid(Integer.parseInt(request.getParameter("sid")));
		user.setLocation(request.getParameter("location"));
		user.setProperty_type(request.getParameter("property_type"));
		user.setBudget(request.getParameter("budget"));
		user.setAvailability(request.getParameter("Availability"));
		

		

	
		int finalResult;
		try {
			finalResult = dao.registerProperty(user);
			if(finalResult>0) {
				out.println("<html><body><b>Successfully Inserted"
                        + "</b></body></html>");
				
			}
		} catch (DAOAppException e) {
		
			e.printStackTrace();
		}
		
		
	}
}




