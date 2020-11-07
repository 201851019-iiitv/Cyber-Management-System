package Cyber_Management_System;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class NewReg {

	NewReg(String name, String mob, String addr,String Gender,String Dob)
	{
	    try
	    {  
	      Class.forName("com.mysql.jdbc.Driver");  
	      Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/project","root","ambesh"); 
	      String sql="INSERT INTO CMS VALUES ('"+name+"','"+mob+"','"+addr+"','"+Gender+"','"+Dob+"')";
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
	/*
	    public static void main(String args[])
		  {  
	    
	   }  
	   */
}


