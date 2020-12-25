
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;


      public class JAVATOSQL {
	    // Connect to your database.
	    // Replace server name, username, and password with your credentials
	    public static void main(String[] args) {
	        String connectionUrl =
	                "jdbc:sqlserver://LAPTOP-CIKUG36M//SQLEXPRESS;database=Student_DB;integratedSecurity=true";
	                        
	        try (Connection connection = DriverManager.getConnection(connectionUrl);) {
	          System.out.println("Connected");
	        }
	           // Handle any errors that may have occurred.
	        catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}


