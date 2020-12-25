package com.meghana.sqL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Barrower{
String Tittle;
String First_Name;
String Last_Name;
String AddressLine1;
String AddressLine2;
String city;
String StateName;
String Country;
int PostCode;
int Mobile_Number_CountryCode ;
long Mobile_Number;
String Email_id;
String Barrower_type;

public static void main(String args[])
{
	Barrower b = new Barrower();
	b.Register();
	}
	
public  Barrower(){
this.First_Name="Megha";
this.Last_Name="Rao"	;
this.AddressLine1="Bangalore";
this.AddressLine2="Bombay";
this.city ="Chikmagalore";
this.StateName="Karnataka";
this.Country="India";
this.PostCode=577123;
this.Mobile_Number_CountryCode=91;
this.Mobile_Number= 9904555688L;
this.Email_id="meghanaraokl@gmail.com";
this.Barrower_type="Student";

}

	
	//Barrower b1 = new Barrower();

  	public void Register() {
		 String connectionUrl =
	       "jdbc:sqlserver://LAPTOP-CIKUG36M\\SQLEXPRESS;database=University_DB;integratedSecurity=true";
	       String SPsql = "EXEC spInsertBarrower ?,?,?,?,?,?,?,?,?,?,?,?,?";   
	        try (Connection connection = DriverManager.getConnection(connectionUrl);) {
	          System.out.println("Connected");
	          
	         PreparedStatement ps = connection.prepareStatement(SPsql);
	          ps.setEscapeProcessing(true);
	          ps.setQueryTimeout(60);
	          ps.setString(1,Tittle);
	          ps.setString(2,First_Name);
	          ps.setString(3,Last_Name);
	          ps.setString(4,AddressLine1);
	          ps.setString(5,AddressLine2);
	          ps.setString(6,city);
	          ps.setString(7,StateName);
	          ps.setString(8,Country );
	          ps.setInt(9, PostCode );
	          ps.setString(10,Integer.toString(Mobile_Number_CountryCode));
	          ps.setString(11,String.valueOf(Mobile_Number));
	          ps.setString(12,Email_id);
	          ps.setString(13,Barrower_type);
	      
	           
	          ResultSet rs = ps.executeQuery();
	
	
	        }
	           // Handle any errors that may have occurred.
	        catch (SQLException e) {
	        	
		          
	        
	            e.printStackTrace();
		    
	            System.out.println("Execute completed");
		
	}

}












}