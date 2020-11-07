package Cyber_Management_System;

import java.awt.*;
import java.awt.event.*;

import java.io.*;
import java.net.*;

public class AppClient extends Frame implements ActionListener,Runnable
{
 //Declarations
 Button b;
 TextField tf;
 TextArea ta;
 Socket s;
 PrintWriter pw;
 BufferedReader br;
 Thread th;
 
 public AppClient()
 {
	 System.out.println("Enetring app client");
  Frame f=new Frame("Client Side Chatting");
  f.setLayout(new FlowLayout());
  f.setBackground(Color.orange);
  b=new Button("Send");
  b.addActionListener(this);
  f.addWindowListener(new W1());
  tf=new TextField(15);
  ta=new TextArea(12,20);
  ta.setBackground(Color.cyan);
  f.add(tf);
  f.add(b);
  f.add(ta);
  try{
   s=new Socket(InetAddress.getLocalHost(),4999);
   
   br=new BufferedReader(new InputStreamReader(s.getInputStream()));
   
   pw=new PrintWriter(s.getOutputStream(),true);
  }catch(Exception e)  
  {
  }
  th=new Thread(this);//start a new thread
  th.setDaemon(true);//set the thread as demon
  th.start();
  setFont(new Font("Arial",Font.BOLD,20));
  f.setSize(500,500);//set the size
  f.setVisible(true);
  f.setLocation(50,100);//set the location
  f.validate();
 }
 //method required to close the Frame on clicking "X" icon.
 private class W1 extends WindowAdapter
 {
  public void windowClosing(WindowEvent we)
  {
   System.exit(0);
  }
 }
 //This method will called after clicking on Send button.
 public void actionPerformed(ActionEvent ae)
 {
  pw.println(tf.getText());//write the value of textfield into PrintWriter
  tf.setText("");//clean the textfield
 }
 //Thread running as a process in background
 public void run()
 {
  while(true)
  {
   try{
    ta.append(br.readLine()+"\n");//Append to TextArea
   }catch(Exception e) {}
  }
 }
 //Main method
// public static void main(String args[])
// {
//  //Instantiate AppClient class
//  AppClient client = new AppClient();
// }

}