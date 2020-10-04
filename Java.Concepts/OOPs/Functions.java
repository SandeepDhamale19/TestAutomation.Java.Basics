package OOPs;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Functions {

	@Test
	public void Test_Functions() {

		// WAP to find if a number is even or odd
		boolean result1 = isEven(4);
		boolean result2 = isEven(5);

		System.out.println(result1);
		System.out.println(result2);

		Assert.assertTrue(result1);
		Assert.assertFalse(result2);
	}

	private static boolean isEven(int num) {

		boolean isEven = false;

		if (num % 2 == 0)
			isEven = true;
		else
			isEven = false;

		return isEven;
	}
}
