package org.bildit.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bildit.service.DeleteProfileService;

@WebServlet("/deleteProfile")
public class DeleteProfileController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userIdStr=request.getParameter("deleteButton");
		int userId=Integer.parseInt(userIdStr);
		
		DeleteProfileService deleteProfileService=new DeleteProfileService();
		if(deleteProfileService.deleteProfile(userId)) {
			request.getRequestDispatcher("/logout").forward(request, response);
		}else {
			request.getRequestDispatcher("deleteProfile.jsp").forward(request, response);
		}
		
	}
	
}
