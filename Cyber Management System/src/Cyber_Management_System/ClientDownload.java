package Cyber_Management_System;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;


	public class ClientDownload {

	  public final static int SOCKET_PORT = 4999;      
	  public final static String SERVER = "localhost"; 
	  public final static String
	       FILE_TO_RECEIVED = "copy.txt";  // you may change this, I give a
	                                                           
	  public final static int FILE_SIZE = 500000; 

	  public static void main (String [] args ) throws IOException {
	    int bytesRead;
	    int current = 0;
	    FileOutputStream fos = null;
	    BufferedOutputStream bos = null;
	    Socket sock = null;
	    try {
	      sock = new Socket(SERVER, SOCKET_PORT);
	      //System.out.println("Connecting...");

	      // receive file
	      byte [] mybytearray  = new byte [FILE_SIZE];
	      InputStream is = sock.getInputStream();
	      fos = new FileOutputStream(FILE_TO_RECEIVED);
	      bos = new BufferedOutputStream(fos);
	      bytesRead = is.read(mybytearray,0,mybytearray.length);
	      current = bytesRead;

	      do {
	         bytesRead =
	            is.read(mybytearray, current, (mybytearray.length-current));
	         if(bytesRead >= 0) current += bytesRead;
	      } while(bytesRead > -1);

	      bos.write(mybytearray, 0 , current);
	      bos.flush();
	      System.out.println("File " + FILE_TO_RECEIVED
	          + " downloaded (" + current + " bytes read)");
	    }
	    finally {
	      if (fos != null) fos.close();
	      if (bos != null) bos.close();
	      if (sock != null) sock.close();
	    }
	  }

	
}
