package Types;

import org.testng.annotations.Test;

public class TypeCast {
	
	@Test
	public void Test_TypeImplicitCast()
	{
		int myMinIntValue = Integer.MIN_VALUE;
		
		int myTotal = (myMinIntValue / 2);
		System.out.println("Integer Cast = " + myTotal);
		
		int myIntNumber = 5 / 3 ;
        float myFloatNumber = 5f / 3f;
        double myDoubleNumber = 5d / 3d;

        System.out.println("myIntNumber = " + myIntNumber);
        System.out.println("myFloatNumber = " + myFloatNumber);
        System.out.println("myDoubleNumber = " + myDoubleNumber);
	}
	
	@Test
	public void Test_TypeExplicitCast()
	{
		byte myMinByteValue = Byte.MIN_VALUE;
				
        byte myNewByteValue = (byte)(myMinByteValue / 2);
        System.out.println("Byte Cast = " + myNewByteValue);
	}
}
