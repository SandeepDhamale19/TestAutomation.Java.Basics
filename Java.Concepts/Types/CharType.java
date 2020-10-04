package Types;

import org.testng.annotations.Test;

public class CharType {

	@Test
	public void Test_CharType()
	{
		// char variables can story only one literal letter or an unicode character and are defined by '' instead of ""
        char myCharVarabiable = 'D';
        char myUnicodeChar = '\u0044';

        System.out.println(myCharVarabiable);
        System.out.println(myUnicodeChar);
	}
}
