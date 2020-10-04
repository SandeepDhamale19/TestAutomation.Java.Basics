package Operators;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssignmentOperators {
	public static int Num1;
    public static int Num2;

    @Test
    public void AssignmentOperators_Assignemnt()
    {
        Num1 = 5;
        Num2 = 2;
        int result = 7;
        System.out.println(String.format("Operator '=' (assignmnet): [result]=[Num1] + [Num2] where [result]%d contains value: [Num1 + Num2]%d",  result, Num1+Num2));
        Assert.assertEquals(7, result);
    }

    @Test
    public void AssignmentOperators_AddAssignemnt()
    {
        Num1 = 5;
        int result = 7;
        System.out.println(String.format("Operator '+=' (add and assign): [result]+=[Num1]  where [result]%d contains value: {result += Num1}%d", result+Num1, result+=Num1));
        Assert.assertEquals(12, result);
    }

    @Test
    public void AssignmentOperators_SubstractAssignemnt()
    {
        Num1 = 5;
        int result = 7;
        System.out.println(String.format("Operator '-=' (substract and assign): [result]-=[Num1]  where [result]%d contains value: {result -= Num1}%d", result-Num1, result-=Num1));
        Assert.assertEquals(2, result);
    }

    @Test
    public void AssignmentOperators_MultiplyAssignemnt()
    {
        Num1 = 5;
        int result = 7;
        System.out.println(String.format("Operator '*=' (multiply and assign): [result]*=[Num1]  where [result]%d contains value: {result *= Num1}%d", result*Num1, result*=Num1));
        Assert.assertEquals(35, result);
    }

    @Test
    public void AssignmentOperators_DivisionAssignemnt()
    {
        Num1 = 5;
        int result = 10;
        System.out.println(String.format("Operator '/=' (divide and assign): [result]/=[Num1]  where [result]%d contains value: {result /= Num1}%d", result/Num1, result/=Num1));
        Assert.assertEquals(2, result);
    }

    @Test
    public void AssignmentOperators_ModulusAssignemnt()
    {
        Num1 = 5;
        int result = 8;
        System.out.println(String.format("Operator '%%=' (modulus and assign): [result]%%=[Num1]  where [result]%d contains value: {result %%= Num1}%d", result%Num1, result%=Num1));
        Assert.assertEquals(3, result);
    }
}
