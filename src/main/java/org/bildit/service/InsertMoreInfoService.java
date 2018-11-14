package org.bildit.service;

import org.bildit.dao.UserDAO;
import org.bildit.model.User;

public class InsertMoreInfoService {

	public boolean insertMoreInfo(User user) {
		
		User userUpdate=new User();
		userUpdate.setfName(user.getfName());
		userUpdate.setlName(user.getlName());
		userUpdate.setStreetAdress(user.getStreetAdress());
		userUpdate.setCity(user.getCity());
		userUpdate.setUserId(user.getUserId());
		
		UserDAO userDAO=new UserDAO();
		if(userDAO.updateUser(userUpdate)) {
			return true;
		}
		
		return false;
	}	
	
}
