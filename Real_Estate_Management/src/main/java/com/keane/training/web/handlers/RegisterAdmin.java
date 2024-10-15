package com.keane.training.web.handlers;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import com.keane.mvc.HttpRequestHandler;
import com.keane.training.dao.DAOAppException;
import com.keane.training.dao.RegisterDAO;
import com.keane.training.domain.Admin;


public class RegisterAdmin implements HttpRequestHandler 
{
	
	static Logger log = Logger.getLogger(RegisterAdmin.class);

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {

		RegisterDAO dao = new RegisterDAO();
		Admin user = new Admin();
		
		
		user.setAid(Integer.parseInt(request.getParameter("aid")));
		user.setName(request.getParameter("Name"));
		user.setEmail(request.getParameter("Email"));
		user.setContactnumber(request.getParameter("contactnumber"));

		boolean isExists;
		try {
			isExists = dao.validateAdmin(user.getEmail()); // is this user already existed ? / not 

			if (isExists) {
				log.info("User already registered");
				RequestDispatcher dispatcher = request.getRequestDispatcher("..\\pages\\AdminRegister.jsp");
				request.setAttribute("Err",	"User already registered with the system");
				dispatcher.forward(request, response);
			} else 
			{
				
				user.setPassword("Admin@"+ Integer.toString(user.getAid()));
				int finalRes = dao.registerAdmin(user);
				
				if (finalRes > 0) {
					RequestDispatcher dispatcher = request.getRequestDispatcher("..\\pages\\AdminSuccess.jsp");
					request.setAttribute("success","User succesfully registered with the system");
					request.setAttribute("details", user);
					dispatcher.forward(request, response);
					
				}
			}
		} catch (DAOAppException e) {
			RequestDispatcher dispatcher = request
					.getRequestDispatcher("error.jsp");
			request.setAttribute("Err", e.getMessage());
			dispatcher.forward(request, response);
		}
	}

}