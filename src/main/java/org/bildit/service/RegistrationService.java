package org.bildit.service;

import org.bildit.dao.UserDAO;
import org.bildit.model.User;


public class RegistrationService {

	private boolean addUser(User user)  {
		
		UserDAO userDAO=new UserDAO();
		return userDAO.addUser(user);
			
	}
	
	public boolean registerUser(String email, String password) {
       
            User user = new User();
            user.setEmail(email);
            user.setPassword(password);

            if (addUser(user)) {
                return true;
            }
            else {
                return false;
            }
    }
	
}
