
package pro1041.com.utils;

import java.sql.Connection;
import java.sql.DriverManager;
 import java.sql.SQLException;
 
 /**
  *
  * @author Tom
  */
 public class DBConnect {
      public static final String HOSTNAME = "localhost";
     public static final String PORT = "1433";
     public static final String DBNAME = "PRO1041_SD19308";
     public static final String USERNAME = "admin";
     public static final String PASSWORD = "123456";
 
     /**
      * Get connection to MSSQL Server
      *
      * @return Connection
      */
     public static Connection getConnection() {
 
 // Create a variable for the connection string.
         String connectionUrl = "jdbc:sqlserver://" + HOSTNAME + ":" + PORT + ";"
                 + "databaseName=" + DBNAME + ";encrypt=true;trustservercertificate=true";
 
         try {
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             return DriverManager.getConnection(connectionUrl, USERNAME, PASSWORD);
         } // Handle any errors that may have occurred.
         catch (ClassNotFoundException | SQLException e) {
             e.printStackTrace(System.out);
         }
         return null;
     }
 
     public static void main(String[] args) {
         System.out.println(getConnection());
     }
 }
