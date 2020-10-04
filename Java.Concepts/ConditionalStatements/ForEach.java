package ConditionalStatements;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ForEach {
	public int Num1;
    public int Num2;

    /// <summary>
    /// Executes a statement or group of statements for number of times as per condition
    /// </summary>
    @Test
    public void ConditionalSatements_Foreach()
    {
        String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

        Calendar calendar = Calendar.getInstance();
    	//int dayNumber = calendar.get(Calendar.DAY_OF_WEEK);
        
    	Date date = calendar.getTime();
        String day = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date.getTime());
        
        String today = "";

        
        for (String currentDay : daysOfWeek)
        {
        	System.out.println(currentDay);
            if (currentDay.equals(day))
            { 
                today = currentDay;
                break;
            }
            
        }
        Assert.assertEquals(day, today);
    }
}
