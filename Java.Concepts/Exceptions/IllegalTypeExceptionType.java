package Exceptions;

import org.testng.annotations.Test;

public class IllegalTypeExceptionType {
	
	@Test
	public void Test_IllegalTypeException() {

		Thread t = new Thread();
		t.setPriority(5);
		t.setPriority(15);	// Exception in thread "main" java.lang.IllegalArgumentException
	}
}
