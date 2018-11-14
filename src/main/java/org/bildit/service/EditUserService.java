package org.bildit.service;

import org.bildit.dao.UserDAO;
import org.bildit.model.User;

public class EditUserService {

	public boolean editUser(User user) {
		
		UserDAO daoUser=new UserDAO();
		
		if (daoUser.editUser(user)) {
			return true;
		}else {
			return false;
		}
	}
	
}
