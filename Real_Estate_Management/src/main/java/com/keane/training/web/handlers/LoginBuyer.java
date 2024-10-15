package com.keane.training.web.handlers;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.keane.mvc.HttpRequestHandler;
import com.keane.training.dao.DAOAppException;
import com.keane.training.dao.LoginDAO;
import com.keane.training.domain.Buyer;



public class LoginBuyer implements HttpRequestHandler {

	public static Logger log = Logger.getLogger(LoginBuyer.class);

	public void handle(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		
		PrintWriter out = response.getWriter();
		
		String Email = request.getParameter("Email");
		String Password = request.getParameter("Password");
		
		
		int flag = -1;
		List users = null;
		LoginDAO dao = new LoginDAO();
		try {
			users = dao.loginBuyer(Email);
			log.info(users);
			for (Object object : users) {

				Buyer user = (Buyer) object;
				if (user.getPassword().equals(Password)) {
					flag = 0;
					break;		}
			}
			
			
			
			log.info("Flag in login " + flag);
			if (flag == 0) {
				RequestDispatcher dispatcher = request
						.getRequestDispatcher("BuyerHome.jsp");
				request.setAttribute("Name", Email);
				dispatcher.forward(request, response);

			} else {
				RequestDispatcher dispatcher = request
						.getRequestDispatcher("BuyerLogin.jsp");
				request.setAttribute("Err",
						"username are password is incorrect");
				dispatcher.forward(request, response);
			}

		} catch (DAOAppException e) {
			RequestDispatcher dispatcher = request
					.getRequestDispatcher("error.jsp");
			request.setAttribute("Err", e.getMessage());
			dispatcher.forward(request, response);

		}

	}
}
