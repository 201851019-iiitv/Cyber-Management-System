package Cyber_Management_System;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;



public class AppServer extends Frame implements ActionListener,Runnable
{
 //Declarations
 Button b1;
 TextField tf;
 TextArea ta;
 ServerSocket ss;
 Socket s;
 PrintWriter pw;
 BufferedReader br;
 Thread th;
 
 public AppServer()
 {
	 
	 System.out.println("Enetring app server");
  Frame f=new Frame("Server Side Chatting");//Frame for Server
  f.setLayout(new FlowLayout());//set layout
  f.setBackground(Color.orange);//set background color of the Frame
  b1=new Button("Send");//Send Button
  b1.setBackground(Color.pink);
  b1.addActionListener(this);//Add action listener to send button.
  tf=new TextField(15);
  ta=new TextArea(12,20);
  ta.setBackground(Color.cyan);
  f.addWindowListener(new W1());//add Window Listener to the Frame
  f.add(tf);//Add TextField to the frame
  f.add(b1);//Add send Button to the frame
  f.add(ta);//Add TextArea to the frame
  try{
   ss=new ServerSocket(4999);//Socket for server
   s=ss.accept();//accepts request from client
   System.out.println(s);
   //below line reads input from InputStreamReader
   br=new BufferedReader(new InputStreamReader(s.getInputStream()));
   //below line writes output to OutPutStream
   pw=new PrintWriter(s.getOutputStream(),true);
  }catch(Exception e)
  {
  }
  th=new Thread(this);//start a new thread
  th.setDaemon(true);//set the thread as demon
  th.start();
  setFont(new Font("Arial",Font.BOLD,20));
  
 
  f.setSize(500,500);//set the size
  f.setLocation(600,100);//set the location
  f.setVisible(true);
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
    String s=br.readLine();//reads the input from textfield
    ta.append(s+"\n");//Append to TextArea
   }catch(Exception e)
   {
   }
  } 
 }
 
 
 
 //Main method
 public static void main(String args[]) 
 {
  //Instantiate AppServer class
  AppServer server = new AppServer();
 }
} 
