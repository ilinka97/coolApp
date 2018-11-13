package org.bildit.service;

import org.bildit.dao.UserDAO;
import org.bildit.model.User;

public class InsertMoreInfoService {

	public boolean insertMoreInfo(int userId, String fName, String lName, String streetAdr, String city) {
		
		User user=new User();
		user.setfName(fName);
		user.setlName(lName);
		user.setStreetAdress(streetAdr);
		user.setCity(city);
		user.getUserId();
		
		UserDAO userDAO=new UserDAO();
		return userDAO.updateUser(user);
		
	}
	
	
	
	
}
