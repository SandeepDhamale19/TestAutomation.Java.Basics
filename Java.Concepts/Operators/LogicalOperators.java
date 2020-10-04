package Operators;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LogicalOperators {
	public static boolean bln1;
    public static boolean bln2;       

    /// <summary>
    /// Logical Operators operates on boolean values
    /// Logical Operators returns boolean values
    /// </summary>
    
    @Test
    public void LogicalOperators_AND()
    {
        bln1 = true;
        bln2 = false;
        System.out.println(String.format("Operator '&&' (AND): {(bln1)} && {(bln2)} = %b", bln1 && bln2));
        Assert.assertFalse(bln1 && bln2);
    }

    @Test
    public void LogicalOperators_OR()
    {
        bln1 = true;
        bln2 = false;
        System.out.println(String.format("Operator '||' (OR): {(bln1)} || {(bln2)} = %b", bln1 || bln2));
        Assert.assertTrue(bln1 || bln2);
    }

    @Test
    public void LogicalOperators_Not()
    {
        bln1 = true;
        bln2 = false;
        System.out.println(String.format("Operator '!' (NOT): {(bln1)} ! {(bln2)} = %b", !(bln1 && bln2)));
        Assert.assertTrue(!(bln1 && bln2));
    }

}
