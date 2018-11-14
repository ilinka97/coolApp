package org.bildit.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.bildit.model.User;
import org.bildit.service.EditUserService;

@WebServlet("/editInfo")
public class EditInfoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("editProfile.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String fName=request.getParameter("fName");
		String lName=request.getParameter("lName");
		String streetAdr=request.getParameter("streetAdr");
		String city=request.getParameter("city");
		
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("user");
		
		user.setEmail(email);
		user.setPassword(password);
		user.setfName(fName);
		user.setlName(lName);
		user.setStreetAdress(streetAdr);
		user.setCity(city);
		
		EditUserService editUser=new EditUserService();
		
		if(editUser.editUser(user)) {
			request.getRequestDispatcher("home.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("editProfile.jsp").forward(request, response);
		}
	}

}
