package org.bildit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.bildit.model.User;


public class UserDAO {

	Connection connection = ConnectionManager.getInstance().getConnection();

	public boolean addUser(User user) {
		String query = "Insert into user (email,password) values (?, ?) ";
		PreparedStatement statement=null;
		try  {
			statement=connection.prepareStatement(query);
			statement.setString(1, user.getEmail());
			statement.setString(2, user.getPasswrod());

			if(statement.executeUpdate() == 1) {
				return true;
			}
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return false;
	}
	
}
