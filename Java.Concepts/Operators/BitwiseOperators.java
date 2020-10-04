package Operators;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BitwiseOperators {

	public static int Num1;
    public static int Num2;
    
    
    @Test
    public void BitwiseOperators_OR()
    {
    	System.out.println("Bitwise Operator: OR");
        Num1 = 6;
        Num2 = 4;
        String bln1 = ConvertToBinaryEightBits(Num1); //8-bit
        String bln2 = ConvertToBinaryEightBits(Num2); //8-bit
        System.out.println(String.format("Binary of %d = %s", Num1, bln1));
        System.out.println(String.format("Binary of %d = %s", Num2, bln2));
        System.out.println(String.format("Operator '|' (OR): {(Num1)} | {(Num2)} = %d | %d", Num1, Num2));
        System.out.println(String.format("In Binary: %s | %s = %s",bln1, bln2, ConvertToBinaryEightBits(Num1 | Num2)));

        Assert.assertEquals(Num1, ConvertToInteger(ConvertToBinaryEightBits(Num1 | Num2)));
    }
    
    @Test
    public void BitwiseOperators_AND()
    {
    	System.out.println("\n\nBitwise Operator: AND");
        Num1 = 6;
        Num2 = 4;
        String bln1 = ConvertToBinaryEightBits(Num1); //8-bit
        String bln2 = ConvertToBinaryEightBits(Num2); //8-bit
        System.out.println(String.format("Binary of %d = %s", Num1, bln1));
        System.out.println(String.format("Binary of %d = %s", Num2, bln2));
        System.out.println(String.format("Operator '&' (AND): {(Num1)} & {(Num2)} = {%d & %d}", Num1, Num2));
        System.out.println(String.format("In Binary: %s & %s = %s",bln1, bln2, ConvertToBinaryEightBits(Num1 & Num2)));

        Assert.assertEquals(Num2, ConvertToInteger(ConvertToBinaryEightBits(Num1 & Num2)));
    }

    @Test
    public void BitwiseOperators_XOR()
    {
    	System.out.println("\n\nBitwise Operator: XOR");
        Num1 = 6;
        Num2 = 4;
        String bln1 = ConvertToBinaryEightBits(Num1); //8-bit
        String bln2 = ConvertToBinaryEightBits(Num2); //8-bit
        System.out.println(String.format("Binary of %d = %s", Num1, bln1));
        System.out.println(String.format("Binary of %d = %s", Num2, bln2));
        System.out.println(String.format("Operator '^' (XOR): {(Num1)} ^ {(Num2)} = {%d ^ %d}", Num1, Num2));
        System.out.println(String.format("In Binary: %s ^ %s = %s",bln1, bln2, 
        													    ConvertToBinaryEightBits(Num1 ^ Num2)));

        Assert.assertEquals(2, ConvertToInteger(ConvertToBinaryEightBits(Num1 ^ Num2)));
    }

    @Test
    public void BitwiseOperators_Complement()
    {
    	System.out.println("\n\nBitwise Operator: Complement");
        Num1 = 6;
        Num2 = 4;
        String bln1 = ConvertToBinaryEightBits(Num1); //8-bit
        System.out.println(String.format("Binary of %d = %s", Num1, bln1));
        System.out.println(String.format("Operator '~' (COMPLEMENT): ~Num1 = ~%d", Num1));
        System.out.println(String.format("In Binary: ~%s = %s",bln1, 
        													ConvertToBinaryEightBits(~Num1)));

        Assert.assertEquals(-7, ConvertToInteger(ConvertToBinaryEightBits(~Num1)));
    }

    @Test
    public void BitwiseOperators_ShiftLeft()
    {
    	System.out.println("\n\nBitwise Operator: Sh8ift Left");
        Num1 = 6;
        Num2 = 4;
        String bln1 = ConvertToBinaryEightBits(Num1); //8-bit
        System.out.println(String.format("Binary of %d = %s", Num1, bln1));
        System.out.println(String.format("Operator '<<' (Shift Left): %d<<1 = {%d << 1}", Num1,Num1));
        System.out.println(String.format("In Binary: %s<<1 = %s", bln1, ConvertToBinaryEightBits(Num1 << 1)));

        Assert.assertEquals(12, ConvertToInteger(ConvertToBinaryEightBits(Num1 << 1)));
    }

    @Test
    public void BitwiseOperators_ShiftRight()
    {
    	System.out.println("\n\nBitwise Operator: Shift Right");
        Num1 = 6;
        Num2 = 4;
        String bln1 = ConvertToBinaryEightBits(Num1); //8-bit
        System.out.println(String.format("Binary of %d = %s", Num1, bln1));
        System.out.println(String.format("Operator '>>' (Shift Left): %d>>1 = {%d >> 1}", Num1,Num1));
        System.out.println(String.format("In Binary: %s>>1 = %s",bln1, ConvertToBinaryEightBits(Num1 >> 1)));

        Assert.assertEquals(3, ConvertToInteger(ConvertToBinaryEightBits(Num1 >> 1)));
    }    

    private String ConvertToBinaryEightBits(int number) {  return Integer.toBinaryString(number);}
    private int ConvertToInteger(String bit) { return Integer.parseInt(bit, 2);}

}
