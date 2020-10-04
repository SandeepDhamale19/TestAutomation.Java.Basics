package Operators;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OperatorPrecedence {
	
	public static int Num1;
    public static int Num2;
    public static int Num3;
    public static int Num4;
    
    @Test
    public void OperatorsPrecedence()
    {
        Num1 = 2;
        Num2 = 3;
        Num3 = 10;
        Num4 = 5;
        int result = Num1 + Num2 * Num3 / Num4;
        System.out.println(String.format("Num1 + Num2 * Num3/Num4 = {%d}", result));
        Assert.assertEquals(8, result);
        result = Num1 + Num2 * (Num3 / Num4);
        System.out.println(String.format("Num1 + Num2 * (Num3/Num4) = {%d}", result));
        Assert.assertEquals(8, result);
        result = (Num1 + (Num2 * Num3)) / Num4;
        System.out.println(String.format("(Num1 + (Num2 * Num3)) /Num4 = {%d}", result));
        Assert.assertEquals(6, result);
        result = (Num1 + Num2) * Num3 / Num4;
        System.out.println(String.format("(Num1 + Num2) * Num3/Num4 = {%d}", result));
        Assert.assertEquals(10, result);
    }
}
