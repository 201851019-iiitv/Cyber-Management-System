package Cyber_Management_System;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Guest {

	Guest()
	{
		
		JFrame f = new JFrame("LOGIN PAGE");
        //JButton b1 = new JButton();
        //JButton b2 = new JButton();
        JTextField p = new JTextField(); 
         JLabel l1=new JLabel("Mobile Number");    
         JLabel l2 = new JLabel("Name");
         JLabel l3 = new JLabel();
         l3.setBounds(100,20,200,30);
         JButton b1 = new JButton("Submit");
         b1.setBounds(100,150,90,30);
         l2.setBounds(20,50,100,30);
         JTextField tf = new JTextField();
         tf.setBounds(100,50,100,30);
              
        l1.setBounds(20,100, 80,30);    
         p.setBounds(100,100,100,30);    

         b1.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e){
                  String name=tf.getText(); 
                  String mob=p.getText();
                  
                  GuestList ob=new GuestList();
                  ob.InsertRequest(name,mob);
                  
                  new CustomerLogin(name,mob);
                  
              
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
