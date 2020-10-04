package Exceptions;

import java.io.IOException;

import org.testng.annotations.Test;

public class TryCatch {

	@Test
	public void Test_TryCatch() {

		try {

			System.out.println("Inside try block");
			int i = 1 / 0;

		} catch (ArithmeticException e) {

			System.out.println("Inside Catch block");
			e.printStackTrace(); // Name of exception, Descreiption
			System.out.println(e.toString()); // Name of exception, Descreiption
			System.out.println(e.getMessage()); // Description

		}
		
		/*try {
			System.out.println("in 2nd ry");
		}
		catch (IOException e) {
			System.out.println("There is no IO operation performed");
		}*/
	}

}
