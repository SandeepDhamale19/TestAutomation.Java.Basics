package Exceptions;

import org.testng.annotations.Test;

public class MultiCatchBlock {

	@Test
	public void Test_MultiCatchBlock() {

		try {
			//int a  = 10/0;
			String s = null;
			s.length();
			System.out.println("Inside try block");
		}
		//Parent-Child relation not possible in Multicatch block
		catch (ArithmeticException | NullPointerException e) {	// Multiple Catch declaration

			System.out.println(e);
		}
	}
}
