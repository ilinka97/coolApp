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

	public boolean updateUser(User user) {
		
		String query="UPDATE user SET fname=?, lname=?, streetadress=?, city=? WHERE userid=? ";
		
		try(PreparedStatement statement=connection.prepareStatement(query)){
			
			statement.setString(1, user.getfName());
			statement.setString(2, user.getlName());
			statement.setString(3, user.getStreetAdress());
			statement.setString(4, user.getCity());
			statement.setInt(5, user.getUserId());
			
			if (statement.executeUpdate()==1) {
				return true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		return false;

	}
	
	public User getUserByEmailAndPassword(String email, String password) {
		
		String query = "SELECT * FROM user WHERE email=? AND password=?";
		ResultSet rs=null;
		User user=new User();
		
		try(PreparedStatement statement=connection.prepareStatement(query)){
			
			statement.setString(1, email);
			statement.setString(2, password);
			rs=statement.executeQuery();
			
			if (rs.next()) {
				user.setUserId(rs.getInt("userid"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				user.setfName(rs.getString("fname"));
				user.setlName(rs.getString("lname"));
				user.setStreetAdress(rs.getString("streetadress"));
				user.setCity(rs.getString("city"));
				
				rs.close();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return user;
	}
	
	public boolean editUser(User user) {
		
		String query="UPDATE user SET email=?, password=?, fname=?, lname=?, streetadress=?, city=? WHERE userid=? ";
		
		try(PreparedStatement statement=connection.prepareStatement(query)){
			
			statement.setString(1, user.getEmail());
			statement.setString(2, user.getPassword());
			statement.setString(3, user.getfName());
			statement.setString(4, user.getlName());
			statement.setString(5, user.getStreetAdress());
			statement.setString(6, user.getCity());
			statement.setInt(7, user.getUserId());
			
			if (statement.executeUpdate()==1) {
				return true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		return false;
	}
	
	public boolean deleteUser(int userId) {
		
		String query="DELETE FROM user WHERE userid=?";
		
		try(PreparedStatement statement=connection.prepareStatement(query)){
			
			statement.setInt(1, userId);
			
			if (statement.executeUpdate()==1) {
				return true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return false;
	}
	
}
