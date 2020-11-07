package Cyber_Management_System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RequestCoffee {

	RequestCoffee()
	{
		try
	    {  
			Class.forName("com.mysql.jdbc.Driver");  
		      Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/project","root","ambesh");
		      
		      System.out.println("Request List::");
		     Statement stmt=con.createStatement();
		      ResultSet rs=stmt.executeQuery("select *\r\n" + 
		      		"from request");
		   
			while(rs.next())
			{
				
				System.out.println(rs.getString(1)+" | "+rs.getString(2)+" | "+rs.getString(3)+" | "+rs.getString(4));
				
				       			
				
			}
		
			con.close();  
	    }  
	     catch(Exception e1)
	     { 
		   System.out.println(e1);
	     } 
			
		
		
	}
	
	
}
