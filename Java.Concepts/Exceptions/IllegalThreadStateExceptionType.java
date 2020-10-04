package Exceptions;

import org.testng.annotations.Test;

public class IllegalThreadStateExceptionType {

	@Test
	public void Test_IllegalThreadStateException() {

		Thread t = new Thread();
		t.start();
		t.start();	// Exception in thread "main" java.lang.IllegalThreadStateException
	}
}
