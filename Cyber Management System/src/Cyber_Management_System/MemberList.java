package Cyber_Management_System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MemberList {

	MemberList()
	{
	    try
	    {  
			Class.forName("com.mysql.jdbc.Driver");  
		      Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/project","root","ambesh");
		      
		      System.out.println("Member List::");
		      //String query="select  name,gender,dob,amount,no_of_year,loan_type,status  from new_application  where username=? && password=?  ";
		     Statement stmt=con.createStatement();
		      ResultSet rs=stmt.executeQuery("select *\r\n" + 
		      		"from CMS");
		   
			while(rs.next())
			{
				
				System.out.println(rs.getString(1)+" | "+rs.getString(2)+" | "+rs.getString(3)+" | "+rs.getString(4)+" | "+rs.getString(5));
				
				       			
				
			}
		
			con.close();  
	    }  
	     catch(Exception e1)
	     { 
		   System.out.println(e1);
	     } 
		
		
	}
	
	
}
