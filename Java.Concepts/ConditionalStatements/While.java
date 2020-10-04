package ConditionalStatements;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.testng.Assert;
import org.testng.annotations.Test;

public class While {
	public int Num1;
    public int Num2;     

    /// <summary>
    /// Reapeats a statement or group of statements while the condition is true
    /// </summary>
    @Test
    public void ConditionalSatements_While()
    {
        String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

        Calendar calendar = Calendar.getInstance();
    	int dayNumber = calendar.get(Calendar.DAY_OF_WEEK);
        
    	Date date = calendar.getTime();
        String day = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date.getTime());
        int currentDaynumber=0;

        while (currentDaynumber != dayNumber)
        {
            currentDaynumber++;
        }

        System.out.println("Today is " + daysOfWeek[currentDaynumber -1]);
        Assert.assertEquals(day, daysOfWeek[currentDaynumber -1]);
    }
}
