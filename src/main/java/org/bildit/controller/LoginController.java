package org.bildit.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.bildit.model.User;
import org.bildit.service.LoginService;
import org.bildit.service.RegistrationService;


@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("index.jsp").forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		User user=new User();
		user.setEmail(email);
		user.setPassword(password);
		
		LoginService loginService=new LoginService();
		
		if((user = loginService.login(user)) != null) {
			RegistrationService registrationService=new RegistrationService();
			User userSession=registrationService.getUserByEmailAndPassword(email, password);
			HttpSession session=request.getSession();
			session.setAttribute("user", userSession);
			request.getRequestDispatcher("home.jsp").forward(request, response);;	
		}else {
            response.sendRedirect("/");
        }
	
	}

}
