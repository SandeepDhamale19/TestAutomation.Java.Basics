package ConditionalStatements;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IfElse {
	public static int Num1;
    public static int Num2;

    @Test
    public void ConditionalStatement_If()
    {
        Num1 = 4;
        if (Num1 < 5)
        {
            System.out.println("You are a kid.");
            Assert.assertTrue(Num1 < 5);
        }
        else if (Num1 >= 5 && Num1 < 18)
        {
            System.out.println("You are a child.");
            Assert.assertTrue(Num1 >= 5 && Num1 < 18);
        }
        else if (Num1 >= 18 && Num1 < 60)
        {
            System.out.println("You are an adult.");
            Assert.assertTrue(Num1 >= 18 && Num1 < 60);
        }
        else
        {
            System.out.println("You are a Senoir Person.");
            Assert.assertTrue(Num1 > 60);
        }
    }

    @Test
    public void ConditionalStatements_NestedIf()
    {
        int candidateExp = 4;
        String candidatePrevOccupation = "IT Tester";

        if (candidatePrevOccupation == "IT Tester")
        {
            Assert.assertTrue(candidatePrevOccupation == "IT Tester");
            if (candidateExp >= 5)
            {
                System.out.println("Candidate is qualified for job.");
                Assert.assertTrue(candidateExp >= 5);
            }
            else
            {
                System.out.println("Candidate is not qualified for job");
                Assert.assertTrue(candidateExp < 5);
            }
        }           
        else
        {
            System.out.println("Candidate is not qualified for job");
            Assert.assertTrue(candidatePrevOccupation != "IT Tester");
        }
    }        
}
