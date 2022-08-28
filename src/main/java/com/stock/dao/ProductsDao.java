package com.stock.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.stock.model.Products;
import com.stock.model.Users;


public class ProductsDao{
	
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
	public String insert(Products products) {
		
		loadDriver(dbDriver);
		Connection con = getConnection();
		String result ="Data entered successfully!";
		String sql = "INSERT INTO products" +
	            "  ( productName, productCategory, productPrice) VALUES " +
	            " ( ?, ?, ?);";
		
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
		
		ps.setString(1, products.getProductName());
		ps.setString(2, products.getProductCategory());
		ps.setString(3, products.getProductPrice());
		ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "data not entered";
		}
		
		return result;
	}
}







