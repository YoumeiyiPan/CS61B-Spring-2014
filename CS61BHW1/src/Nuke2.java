import java.util.*;
import java.io.*;

public class Nuke2 {
	 public static void main(String[] arg) throws Exception {
		 
		 System.out.println("Please enter whatever you want:");
		 
//		/* <method 1>*/ 
//		 Scanner input = new Scanner(System.in);
//		 StringBuffer newString = new StringBuffer(input.nextLine());
//         newString.deleteCharAt(1);
//		 
//		 System.out.println(newString);
	/*<method 2>*/	 
		 BufferedReader keyboard 
			= new BufferedReader(new InputStreamReader(System.in));

		String line = keyboard.readLine();
		
		
		String lineOmited = line.charAt(0) + line.substring(2);
		System.out.println(lineOmited);
	 }


}
