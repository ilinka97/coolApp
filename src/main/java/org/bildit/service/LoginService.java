package org.bildit.service;

import org.bildit.dao.UserDAO;
import org.bildit.model.User;

public class LoginService {

	public User login(User user){
		
		UserDAO userDAO=new UserDAO();
		User userByEmail=userDAO.getUserByEmail(user.getEmail());
		
		if(userByEmail==null) {
			return null;
		}else if(userByEmail.getPassword().equals(user.getPassword())){
			return userByEmail;
		}else {
			return null;
		}
		
		
	}
	
	
	
	
	
}
