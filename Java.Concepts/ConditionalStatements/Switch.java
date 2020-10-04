package ConditionalStatements;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Switch {
	public static int Num1;
    public static int Num2;
           
    @Test
    public void ConditionalSatements_Switch()
    {
    	Calendar calendar = Calendar.getInstance();
    	int dayNumber = calendar.get(Calendar.DAY_OF_WEEK);
        
    	Date date = calendar.getTime();
        String day = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date.getTime());

        switch (dayNumber)
        {
	        case 1:
	            System.out.println("Today is Sunday");
	            Assert.assertEquals("Sunday", day);
	            break;
            case 2:
                System.out.println("Today is Monday");
                Assert.assertEquals("Monday", day);
                break;
            case 3:
                System.out.println("Today is Tuesday");
                Assert.assertEquals("Tuesday", day);
                break;
            case 4:                    
                System.out.println("Today is Wednesday");
                Assert.assertEquals("Wednesday", day);
                break;
            case 5:
                System.out.println("Today is Thursday");
                Assert.assertEquals("Thursday", day);
                break;
            case 6:
                System.out.println("Today is Friday");
                Assert.assertEquals("Friday", day);
                break;
            case 7:
                System.out.println("Today is Saturday");
                Assert.assertEquals("Saturday", day);
                break;
        }
    }
}
