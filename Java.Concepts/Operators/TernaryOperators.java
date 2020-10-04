package Operators;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TernaryOperators {
	@Test
	public static void Test_TernaryOperators() {

		int a = 2;
		int b = 3;

		int min = (a < b)? a : b;

		System.out.println(min);
		 Assert.assertEquals(2, min);
	}
}
