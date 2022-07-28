package com.stock.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.stock.model.Users;








public class UsersDao{
	
	private String dbUrl = "jdbc:mysql://localhost:3306/stock?allowPublicKeyRetrieval=true&useSSL=false";
	private String dbUname = "root";
	private String dbPassword = "Mungai@97";
	private String dbDriver = "com.mysql.jdbc.Driver";
	
	//load driver
	public void loadDriver(String dbDriver)
	{
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//get connection
	public Connection getConnection()
	{
		Connection con = null;
		try {
			con = DriverManager.getConnection(dbUrl, dbUname, dbPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	
	//method to insert
	public String insert(Users users) {
		
		loadDriver(dbDriver);
		Connection con = getConnection();
		String result ="Data entered successfully!";
		String sql = "INSERT INTO users" +
	            "  ( firstName, lastName, username, email, password) VALUES " +
	            " ( ?, ?, ?, ?, ?);";
		
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
		
		ps.setString(1, users.getFirstName());
		ps.setString(2, users.getLastName());
		ps.setString(3, users.getUsername());
		ps.setString(4, users.getEmail());
		ps.setString(5, users.getPassword());
		ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "data not entered";
		}
		
		return result;
	}
}







//public class UsersDao {
//	
//	
//	 public int registerUsers(Users users) throws ClassNotFoundException {
//	        String INSERT_USERS_SQL = "INSERT INTO users" +
//	            "  (id, firstName, lastName, username, email, password) VALUES " +
//	            " (?, ?, ?, ?, ?, ?);";
////
//	        int result = 0;
//
//	        Class.forName("com.mysql.jdbc.Driver");
//
//	        try (Connection connection = DriverManager
//	            .getConnection("jdbc:mysql://localhost:3306/stock?allowPublicKeyRetrieval=true&useSSL=false", "root", "Mungai@97");
//
//	            // Step 2:Create a statement using connection object
//	            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
//	            preparedStatement.setInt(1, 1);
//	            preparedStatement.setString(2, users.getFirstName());
//	            preparedStatement.setString(3, users.getLastName());
//	            preparedStatement.setString(4, users.getUsername());
//	            preparedStatement.setString(5, users.getEmail());
//	            preparedStatement.setString(6, users.getPassword());
//	            
//
//	            System.out.println(preparedStatement);
//	            // Step 3: Execute the query or update query
//	            result = preparedStatement.executeUpdate();
//
//	        } catch (SQLException e) {
//	            // process sql exception
//	            printSQLException(e);
//	        }
//
//	        
//	        return result;
//	 }
//	 
//	 private void printSQLException(SQLException ex) {
//	        for (Throwable e: ex) {
//	            if (e instanceof SQLException) {
//	                e.printStackTrace(System.err);
//	                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
//	                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
//	                System.err.println("Message: " + e.getMessage());
//	                Throwable t = ex.getCause();
//	                while (t != null) {
//	                    System.out.println("Cause: " + t);
//	                    t = t.getCause();
//	                }
//	            }
//	        }
//	    }
//
//}
