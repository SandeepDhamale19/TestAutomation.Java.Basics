package Exceptions;

import org.testng.annotations.Test;

public class NumberFormatExceptionType {
	
	@Test
	public void Test_NumberFormatException() {

		int x = Integer.parseInt("20");	//Integer value so executes fine
		int i = Integer.parseInt("wrong type");	// Exception in thread "main" java.lang.NumberFormatException: For input string: "wrong type"
	}
}
