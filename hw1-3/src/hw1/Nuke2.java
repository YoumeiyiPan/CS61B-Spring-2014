package hw1;

import java.io.*;
import java.lang.*;

public class Nuke2 {
	  public static void main(String[] arg) throws Exception {

		    BufferedReader keyboard;
		    String inputLine;

		    keyboard = new BufferedReader(new InputStreamReader(System.in));

		    System.out.print("Please enter a string: ");
		    System.out.flush();        /* Make sure the line is printed immediately. */
		    inputLine = keyboard.readLine();
		    StringBuilder array=new StringBuilder(inputLine);
		   
		    array.deleteCharAt(1);
		    System.out.println(array);
		    
		    
		    
	  }

}
