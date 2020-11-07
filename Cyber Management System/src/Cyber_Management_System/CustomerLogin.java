package Cyber_Management_System;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CustomerLogin {

	
	CustomerLogin(String name,String mob){
	       JFrame f = new JFrame();
	       JButton b1 = new JButton("Chat with other");
	       JButton b2 = new JButton("Request  for a coffee");
	       JButton b3 = new JButton("Download Files from Server");
	       b1.setBounds(100,150,400,50);
	        b2.setBounds(100,250,400,50);
	         b3.setBounds(100,350,400,50);
	      
	       
	       
	       //multi client and multi server chat
	       
	       b1.addActionListener(new ActionListener() {
	       	public void actionPerformed(ActionEvent e) {
	       		
	       		new AppClient();
	       		
	       		
	       		
	       	}
	       });
	     
	       
	       //request for a coffee
	     
	       b2.addActionListener(new ActionListener() {
	          	public void actionPerformed(ActionEvent e) {
	          
	          		Scanner sc=new Scanner(System.in);
	          		
	          		//String name = null,mob,
	          	      String requirement;
	          		int table_number;
	          		
	          	
//	          		
//	          		System.out.println("Enter name :");
//	          		name=sc.next();
//	          		
//	          		System.out.println("Enter 10 digit mobile  number:");
//	          		mob=sc.next();
//	          		
	          		System.out.println("Enter the Quantity:");
	          		table_number=sc.nextInt();
	          		
	          		System.out.println("What do you want to order:");
	          		requirement=sc.next();
	          		
	          		new InsertRequest(name,mob,table_number,requirement);
	          		
	          		
	          		
	          		
	          	}
	          });
	       
	       
	       
	       //Download or upload from server
	       b3.addActionListener(new ActionListener() {
	          	public void actionPerformed(ActionEvent e) {
	          		new ClientDownload();
	          	}
	          });
	       
	       
	       
	       
	       f.setSize(600,600);
	       f.add(b1);
	       f.add(b2);
	       f.add(b3);
	       f.setLayout(null);
	       f.setVisible(true);
	       
	       
	   }

}
