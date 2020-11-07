package Cyber_Management_System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class GuestList {

	
	GuestList()
	{
		
		try
	    {  
			Class.forName("com.mysql.jdbc.Driver");  
		      Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/project","root","ambesh");
		      
		      System.out.println("Guest List::");
		     Statement stmt=con.createStatement();
		      ResultSet rs=stmt.executeQuery("select *\r\n" + 
    		      		"from guest");
  			
  			
  			while(rs.next())
  			{
  				
  				System.out.println(rs.getString(1)+" | "+rs.getString(2));
  				
  				       			
  				
  			}
  			
  			con.close();  
		    }  
		     catch(Exception e1)
		     { 
			   System.out.println(e1);
		     } 
		
		
		
	}
	
	void InsertRequest(String name, String mob)
	{
	    try
	    {  
	      Class.forName("com.mysql.jdbc.Driver");  
	      Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/project","root","ambesh"); 
	      String sql="INSERT INTO guest VALUES ('"+name+"','"+mob+"')";
	 //inserting values;
	      if(con!=null){
	          Statement stmt =con.createStatement();
	          int result= stmt.executeUpdate(sql);
	          if(result!=-1){
	              System.out.println("Inserted "+result+"Record(s) successfully");
	          }else{
	              System.out.println("Unable to insert record. Please check you  SQL syntax");
	          }

	      stmt.close();
	      con.close();
	      }else{
	          System.out.println("Unable to get the connection");
	      }
			       con.close();  
			     
	    }  
	     catch(Exception e)
	     { 
		   System.out.println(e);
	     } 
	
	
	
	}
}
