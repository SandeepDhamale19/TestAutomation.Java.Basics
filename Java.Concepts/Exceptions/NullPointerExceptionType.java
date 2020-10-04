package Exceptions;

import org.testng.annotations.Test;

public class NullPointerExceptionType {

	@Test
	public void NullPointerException() {

		String s = null;
		System.out.println(s.length());
	}
}
