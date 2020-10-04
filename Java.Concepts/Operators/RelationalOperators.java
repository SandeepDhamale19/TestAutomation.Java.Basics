package Operators;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RelationalOperators {
	public static int Num1;
    public static int Num2;

    /// <summary>
    /// Relational operators returns boolean values
    /// Use IsTure/ IsFalse while asserting values
    /// </summary>
    /// 
    
    @Test
    public void RelationalOperators_Equal()
    {
        Num1 = 7;
        Num2 = 7;
        System.out.println(String.format("Operator '==' (equal): {(Num1)} == {(Num2)} = %b", Num1 == Num2));
        Assert.assertTrue(Num1== Num2);
    }

    @Test
    public void RelationalOperators_NotEqual()
    {
        Num1 = 7;
        Num2 = 3;
        System.out.println(String.format("Operator '!=' (notequal): {(Num1)}!= {(Num2)} = %b",Num1 != Num2));
        Assert.assertTrue(Num1 != Num2);
    }

    @Test
    public void RelationalOperators_GreaterThan()
    {
        Num1 = 7;
        Num2 = 3;
        System.out.println(String.format("Operator '>' (greater than): {(Num1)} > {(Num2)} = %b", Num1 > Num2));
        Assert.assertTrue(Num1 > Num2);
    }

    @Test
    public void RelationalOperators_LessThan()
    {
        Num1 = 3;
        Num2 = 7;
        System.out.println(String.format("Operator '<' (less than): {nameof(Num1)} < {nameof(Num2)} = %b", Num1 < Num2));
        Assert.assertTrue(Num1 < Num2);
    }

    @Test
    public void RelationalOperators_GreaterThanOrEqual()
    {
        Num1 = 7;
        Num2 = 3;
        System.out.println(String.format("Operator '>=' (greater than or equal): {(Num1)} >= {(Num2)} = %b", Num1 >= Num2));
        Assert.assertTrue(Num1 >= Num2);
    }

    @Test
    public void RelationalOperators_LessThanOrEqual()
    {
        Num1 = 3;
        Num2 = 7;
        System.out.println(String.format("Operator '<=' (less than or equal): {nameof(Num1)} <= %b = ", Num1 <= Num2));
        Assert.assertTrue(Num1 <= Num2);
    }
}
