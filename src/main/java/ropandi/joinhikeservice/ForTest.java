package ropandi.joinhikeservice;

import java.nio.charset.Charset;
import java.util.Random;

public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int leftLimit = 97; // letter 'a'
//	    int rightLimit = 122; // letter 'z'
//	    int targetStringLength = 50;
//	    Random random = new Random();
//	 
//	    String generatedString = random.ints(leftLimit, rightLimit + 1)
//	      .limit(targetStringLength)
//	      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
//	      .toString();
	 
	   // System.out.println(generatedString);
		String email = "eintrusty@gmail.com";
		String username = email.substring(0, email.indexOf("@"));
		System.out.println(username);
		
	}

}
