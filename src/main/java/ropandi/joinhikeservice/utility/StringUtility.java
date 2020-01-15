package ropandi.joinhikeservice.utility;

import java.util.Random;
import java.util.UUID;

public class StringUtility {

	
	public static String generatedRandomString(int length) {
		int leftLimit = 97; // letter 'a'
	    int rightLimit = 122; // letter 'z'
	    //int targetStringLength = 50;
	    Random random = new Random();
	 
	    String generatedString = random.ints(leftLimit, rightLimit + 1)
	      .limit(length)
	      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
	      .toString();
	    return generatedString;
	}
	public static String generateUUID() {
		return UUID.randomUUID().toString();
	}
}
