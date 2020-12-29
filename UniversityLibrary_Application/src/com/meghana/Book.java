package com.meghana;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Book {

	String title;
	String author;
	double price;
	Date d= new Date(0, 0, 0) published_date;
	Date(int purchased_date;
	double quantity;
	  
//public Book(){
//this.title="Jonny";
//this.author="Chintu";
//this.price=700;
//this.published_date= Date d= new Date(20, 3, 12);
//this.purchased_date=Date();
//this.quantity=7;
//}

public void AddBook() {

	 String connectionUrl 
      "jdbc:sqlserver://LAPTOP-CIKUG36M//SQLEXPRESS;database=University_DB;integratedSecurity=true";
      String SPsql = "EXEC spInsertBook ?,?,?,?,?,?";   
       try (Connection connection = DriverManager.getConnection(connectionUrl);) {
         System.out.println("Connected");
         
        PreparedStatement ps = connection.prepareStatement(SPsql);
         ps.setEscapeProcessing(true);
         ps.setQueryTimeout(60);
         
         ps.setString(1,title);
         ps.setString(2,author);
         ps.setDouble(3,70);
         ps.setDate(4, x);
         ps.setDate(5, x);
         ps.setDouble(6,7);
        
          
         ResultSet rs = ps.executeQuery();   }
          // Handle any errors that may have occurred.
       catch (SQLException e) {
       	
	          }