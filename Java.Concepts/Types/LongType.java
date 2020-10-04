package Types;

import org.testng.annotations.Test;

public class LongType {
	
	@Test
	public void Test_Long()
	{
		long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        long myLongValue = 2_147_483_648L;

        System.out.println("Min long value: " + myMinLongValue);
        System.out.println("Max long value: " + myMaxLongValue);
        System.out.println("My long value: " + myLongValue);
	}

}
