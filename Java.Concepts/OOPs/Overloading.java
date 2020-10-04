package OOPs;

import org.testng.annotations.Test;

public class Overloading {

	@Test
	public void Test_Overloading() {

		add();
		add(1.2f, 3.4f);
	}

	private static void add() {

		int sum = 3 + 4;
		System.out.println(sum);
	}

	private static void add(float a, float b) {
		double sum = a + b;
		System.out.println(sum);
	}
}
