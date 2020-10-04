package ConditionalStatements;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.testng.Assert;
import org.testng.annotations.Test;

public class For {
	
	public int Num1;
    public int Num2;   

    /// <summary>
    /// Executes a statement or group of statements for number of times as per condition
    /// </summary>
    @Test
    public void ConditionalSatements_For()
    {
        String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

        Calendar calendar = Calendar.getInstance();
    	int dayNumber = calendar.get(Calendar.DAY_OF_WEEK);
        
    	Date date = calendar.getTime();
        String day = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date.getTime());

        String today = "";

        for(int currentDayNum =1; currentDayNum<=dayNumber; currentDayNum++)
        {
        	System.out.println(daysOfWeek[currentDayNum-1]);
            today = daysOfWeek[currentDayNum-1];
        }

        Assert.assertEquals(day, today);
    }

}
