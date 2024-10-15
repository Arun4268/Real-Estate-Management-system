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

import com.keane.training.domain.Deal;


public class DealClosing implements HttpRequestHandler 
{
	
	static Logger log = Logger.getLogger(DealClosing.class);

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {

		RegisterDAO dao = new RegisterDAO();
		Deal user = new Deal();
		
		
		user.setDealid(Integer.parseInt(request.getParameter("dealid")));
		user.setPid(Integer.parseInt(request.getParameter("pid")));
		user.setSid(Integer.parseInt(request.getParameter("sid")));
		user.setBuyid(Integer.parseInt(request.getParameter("buyid")));
		user.setDeal_Status(request.getParameter("deal_Status"));
		
		boolean isExists;
		try {
			isExists = dao.validateDeal(user.getDealid()); // is this user already existed ? / not 

			if (isExists) {
				log.info("deal already closed ");
				RequestDispatcher dispatcher = request.getRequestDispatcher("..\\pages\\InsertDeal.jsp");
				request.setAttribute("Err",	"Deal Already Closed please book another property");
				dispatcher.forward(request, response);
			} else 
			{
				
			
				int finalRes = dao.GetDeal(user);
				
				if (finalRes > 0) {
					RequestDispatcher dispatcher = request.getRequestDispatcher("..\\pages\\DealSuccess.jsp");
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
