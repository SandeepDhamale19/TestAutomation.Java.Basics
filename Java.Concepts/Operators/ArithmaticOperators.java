package Operators;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArithmaticOperators {
	
	public static int Num1;
    public static int Num2;
    
    @Test
    public void ArithmeticOperators_Addition()
    {
        Num1 = 7;
        Num2 = 3;
        System.out.println(String.format("Operator '+' (add): %d + %d = %d", Num1, Num2, Num1+Num2));
        Assert.assertEquals(10, Num1 + Num2);
    }

    @Test
    public void ArithmeticOperators_Substraction()
    {
        Num1 = 8;
        Num2 = 5;
        System.out.println(String.format("Operator '-' (substract): %d - %d = %d", Num1, Num2, Num1-Num2));
        Assert.assertEquals(3, Num1 - Num2);
    }

    @Test
    public void ArithmeticOperators_Multiplication()
    {
        Num1 = 2;
        Num2 = 3;
        System.out.println(String.format("Operator '*' (multiply): %d * %d = %d", Num1, Num2, Num1*Num2));
        Assert.assertEquals(6, Num1 * Num2);
    }

    @Test
    public void ArithmeticOperators_Division()
    {
        Num1 = 8;
        Num2 = 2;
        System.out.println(String.format("Operator '/' (division): %d / %d = %d", Num1, Num2, Num1/Num2));
        Assert.assertEquals(4, Num1 / Num2);
    }

    @Test
    public void ArithmeticOperators_Modulus()
    {
        Num1 = 7;
        Num2 = 3;
        System.out.println(String.format("Operator %% (modulus): %d %% %d = %d", Num1, Num2, Num1%Num2));
        Assert.assertEquals(1, Num1 % Num2);
    }

    @Test
    public void ArithmeticOperators_PreIncrement()
    {
        Num1 = 7;
        System.out.println(String.format("Operator '++' (increment): pre-increment: ++%d = %d", Num1, Num2, ++Num1));
        Assert.assertEquals(8, Num1);
    }

    @Test
    public void ArithmeticOperators_PostIncrement()
    {
        Num1 = 7;
        System.out.println(String.format("Operator '++' (increment): post-increment: %d++ = %d", Num1, Num2, Num1++));
        Assert.assertEquals(8, Num1);
    }

    @Test
    public void ArithmeticOperators_PreDecrement()
    {
        Num1 = 7;
        System.out.println(String.format("Operator '--' (decrement): pre-increment: --%d = %d", Num1, Num2, --Num1));
        Assert.assertEquals(6, Num1);
    }

    @Test
    public void ArithmeticOperators_PostDecrement()
    {
        Num1 = 7;
        System.out.println(String.format("Operator '--' (decrement): post-increment: %d-- = %d", Num1, Num2, Num1--));
        Assert.assertEquals(6, Num1);
    }


}
