package Cyber_Management_System;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;

public class main {

	  public static void main(String[] args){
	        new main();
	    }
	    main(){
	        JFrame f = new JFrame();
	        JButton b1 = new JButton("Login as Admininstration");
	         JButton b2 = new JButton(" Register as New Member");
	          JButton b3 = new JButton("Login  as a Member");
	           JButton b4 = new JButton("Login as a Guest");
	           
	           
	           
	           // login as Administration
	            b1.addActionListener(new ActionListener(){
	              public void actionPerformed(ActionEvent e){
	                 Admin ob=new Admin();
	                  
	              }
	          });
	            
	            
	            // Create an  new Member account
	          b2.addActionListener(new ActionListener(){
	              
	              public void actionPerformed(ActionEvent e){
	                 new New_Member();    
	        
	              }
	          });
	          
	          
	          
	          // login as member
	          b3.addActionListener(new ActionListener(){
	              public void actionPerformed(ActionEvent e){
	       ExistCustomer ob=new  ExistCustomer();         	  
	            	 
	              }
	          });
	          
	          
	          //login as guest
	          b4.addActionListener(new ActionListener(){
	              public void actionPerformed(ActionEvent e){
	             new Guest();
	              }
	          });


	           f.add(b1);
	           f.add(b2);f.add(b3);f.add(b4);
	           f.setLayout(new GridLayout(2,2));
	           f.setSize(400,400);
	           f.setVisible(true);

	           

	    }
}
