package org.bildit.service;

import org.bildit.dao.UserDAO;

public class DeleteProfileService {

	public boolean deleteProfile(int userId) {
		
		UserDAO daoUser=new UserDAO();
		
		if (daoUser.deleteUser(userId)) {
			return true;
		}
		return false;
	}
	
}
