package Types;

import org.testng.annotations.Test;

public class ShortType {
	
	@Test
	public void Test_Short()
	{
		//SHORT
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Min short value: " + myMinShortValue);
        System.out.println("Max short value: " + myMaxShortValue);
	}

}
