package Cyber_Management_System;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ExistCustomer {

ExistCustomer()
{
JFrame f = new JFrame("LOGIN PAGE");
//JButton b1 = new JButton();
//JButton b2 = new JButton();
JTextField p = new JTextField(); 
 JLabel l1=new JLabel("Mobile Number");    
 JLabel l2 = new JLabel("Name");
 JLabel l3 = new JLabel();
 l3.setBounds(100,20,200,30);
 JButton b1 = new JButton("Login");
 b1.setBounds(100,150,90,30);
 l2.setBounds(20,50,100,30);
 JTextField tf = new JTextField();
 tf.setBounds(100,50,100,30);
      
l1.setBounds(20,100, 80,30);    
 p.setBounds(100,100,100,30);    

 b1.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent e){
    	 String user=tf.getText();
	       String pass=p.getText();
  		
  		 //System.out.println(user +" "+pass);
  		
  		 String str="\""+user+"\"";
  		 String str1="\""+pass+"\"";
  		 
  		 
		      //System.out.println(str1+" "+str);
  		try
		    {  
  			Class.forName("com.mysql.jdbc.Driver");  
		      Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/project","root","ambesh");
		    
		      String sql="select name from CMS where name= "+str +"and mob ="+str1;
		         Statement stmt=con.createStatement();
  			     ResultSet rs=stmt.executeQuery(sql); 
  			    Component b = null;
			if(rs.next())
  			{
  				//System.out.println("Name  "+" | "+"Gender "+" | "+"DOB "+" | "+"Amount "+" | "+"No of Year "+" | "+"Loan Type"+" | "+"Status ");
  				//System.out.println(rs.getString(1)+" | "+rs.getString(2)+" | "+rs.getString(3)+" | "+rs.getString(4)+" | "+rs.getString(5)+" | "+rs.getString(6)+" | "+rs.getString(7));
  				
				System.out.println("Welcome :: "+" "+rs.getString(1));
  				JOptionPane.showMessageDialog(b, "You have successfully logged in");
  				
  				
  				
  				con.close();  
  				
  				new CustomerLogin(user,pass);
  				
  					
  
  			}
  			else
  				JOptionPane.showMessageDialog(b, "Wrong Username & Password or Appliccation rejected");
  				con.close(); 
  				
  				
		    }
  		catch ( Exception e1) {
              System.out.println(e1);
  		}
     }	
 
 });

    f.add(p); 
     f.add(l1);  
     f.add(l2);
     f.add(tf);
     f.add(b1);
     f.add(l3);
    f.setSize(300,300);    
    f.setLayout(null);    
    f.setVisible(true); 

}

}