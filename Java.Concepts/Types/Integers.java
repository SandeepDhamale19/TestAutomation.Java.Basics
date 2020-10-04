package Types;

import org.testng.annotations.Test;

public class Integers {

	@Test
	public void Test_Integers()
	{
		// integer
        int myValue = 7_000;
        System.out.println("Integer: " + myValue);
        
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        // overflow
        System.out.println("Overflow: " + (Integer.MAX_VALUE + 1));
        // underflow
        System.out.println("Underlow" + (Integer.MIN_VALUE - 1));
	}
	
	@Test
	public void Test_Float()
	{
		//Floating numbers
        float myMinFloatValue = Float.MIN_NORMAL;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("My min float value: " + myMinFloatValue);
        System.out.println("My max float value: " + myMaxFloatValue);
	}
	
	@Test
	public void Test_Double()
	{
		double myMinDoubleValue = Double.MIN_NORMAL;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("My min float value: " + myMinDoubleValue);
        System.out.println("My max float value: " + myMaxDoubleValue);
	}
}
