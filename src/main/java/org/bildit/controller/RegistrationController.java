package org.bildit.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bildit.service.RegistrationService;



@WebServlet("/registration")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("index.jsp").forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	String email,password;
		
    	email=request.getParameter("email");
		password=request.getParameter("password");
		
		RegistrationService registrationService = new RegistrationService();
		if (registrationService.registerUser(email,password)) {
			request.getRequestDispatcher("oneMoreStep.jsp").forward(request,response);
		}
		else {
            request.getRequestDispatcher("index.jsp").forward(request,response);
        }
		
	}

}
