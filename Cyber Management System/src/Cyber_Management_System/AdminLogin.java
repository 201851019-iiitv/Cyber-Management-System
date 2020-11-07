package Cyber_Management_System;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AdminLogin {

	AdminLogin()
	{
		   JFrame f = new JFrame();
  	       JButton b1 = new JButton(" Members List");
  	       JButton b2 = new JButton("Guest List");
  	       JButton b3 = new JButton("Coffee Tea and other things Request");
  	       b1.setBounds(100,150,400,50);
  	        b2.setBounds(100,250,400,50);
  	         b3.setBounds(100,350,400,50);
  	      
  	       
  	       
  	       //Member List
  	       
  	       b1.addActionListener(new ActionListener() {
  	       	public void actionPerformed(ActionEvent e) {
  	       		
  	       		new MemberList();
  	       		
  	       		
  	       		
  	       	}
  	       });
  	     
  	       
  	       //GuestList
  	     
  	       b2.addActionListener(new ActionListener() {
  	          	public void actionPerformed(ActionEvent e) {
  	          		
  	          	new GuestList();
  	          	}
  	          });
  	       
  	       
  	       
  	       //Cofffee or tea Requested List
  	       b3.addActionListener(new ActionListener() {
  	          	public void actionPerformed(ActionEvent e) {
  	          	
  	          new RequestCoffee();
  	          		
  	          		
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
