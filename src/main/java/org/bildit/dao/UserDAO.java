package org.bildit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
			statement.setString(2, user.getPassword());

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
	
	public User getUserByEmail(String email) {
		
		String query = "Select * from user where email=?";
		ResultSet rs = null;
		User user = new User();
		PreparedStatement statement=null;
		
		try {
			statement=connection.prepareStatement(query);
			statement.setString(1, email);
			rs = statement.executeQuery();

			if (rs.next()) {

				user.setUserId(rs.getInt("userid"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return user;

	}

	
	
	
}
