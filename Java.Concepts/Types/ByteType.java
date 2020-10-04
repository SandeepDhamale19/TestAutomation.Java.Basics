package Types;

import org.testng.annotations.Test;

public class ByteType {

	@Test
	public void Test_Byte()
	{
		//BYTE
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Min byte value: " + myMinByteValue);
        System.out.println("Max byte value: " + myMaxByteValue);

	}
}
