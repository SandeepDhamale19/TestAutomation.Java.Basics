package Types;

import org.testng.annotations.Test;

public class StringType {

	@Test
	public void Test_StringType()
	{
		String myString = "This is a string";
        myString = myString + " \u00A9 2019";
        System.out.println("myString value is " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.45";
        System.out.println(numberString);
	}
}
