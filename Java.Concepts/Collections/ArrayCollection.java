package Collections;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class ArrayCollection {
			@Test
	        public void Arrays_DeclareAndInitialize()
	        {
	            // defining array with size 5. 
	            // But not assigns values
	            int[] intArray1 = new int[5];

	            // defining array with size 5 and assigning
	            // values at the same time
	            int[] intArray2 = { 1, 2, 3, 4, 5 };

	            // defining array with 5 elements which 
	            // indicates the size of an array
	            int[] intArray3 = { 1, 2, 3, 4, 5 };

	            // Accessing Array values
	            int member2 = intArray3[2];
	            Assert.assertEquals(3, member2);

	            // Accessing array values using for loop
	            for (int i = 0; i < intArray3.length; i++)
	                System.out.println(" " + intArray3[i]);

	            // Accessing array values using for loop
	            for (int i : intArray3)
	                System.out.println(" " + i);

	        }

	        @Test
	        public void Arrays_Multidimensional()
	        {
	            // creates a two-dimensional array of 
	            // four rows and two columns.
	            int[][] intarrayA = new int[4][2];

	            //creates an array of three dimensions, 4, 2, and 3
	            int[][][] intarray1 = new int[4][2][3];

	            // Two-dimensional array 
	            int[][] intarray = new int[][] { { 1, 2 },
	                                         { 3, 4 },
	                                         { 5, 6 },
	                                         { 7, 8 } };

	            // The same array with dimensions  
	            // specified 4 row and 2 column. 
	            int[][] intarray_d = new int[][] { { 1, 2 }, { 3, 4 },
	                                             { 5, 6 }, { 7, 8 } };

	            // A similar array with string elements. 
	            String[][] str = new String[][] { { "one", "two" },
	                                            { "three", "four" },
	                                            { "five", "six" },
	                                            { "seven", "eight" } };

	            // Three-dimensional array. 
	            int[][][] intarray3D = new int[][][] { { { 1, 2, 3 },
	                                             { 4, 5, 6 } },
	                                             { { 7, 8, 9 },
	                                           { 10, 11, 12 } } };


	            // The same array with dimensions  
	            // specified 2, 2 and 3. 
	            int[][][] intarray3Dd = new int[][][] { { { 1, 2, 3 },
	                                                  { 4, 5, 6 } },
	                                                  { { 7, 8, 9 },
	                                                { 10, 11, 12 } } };

	            // Accessing array elements. 
	            System.out.println("2DArray[0][0] : " + intarray[0][0]);
	            System.out.println("2DArray[0][1] : " + intarray[0][1]);
	            System.out.println("2DArray[1][1] : " + intarray[1][1]);
	            System.out.println("2DArray[2][0] " + intarray[2][0]);

	            System.out.println("2DArray[1][1] (other) : "
	                                     + intarray_d[1][1]);

	            System.out.println("2DArray[1][0] (other)"
	                                 + intarray_d[1][0]);

	            System.out.println("3DArray[1][0][1] : "
	                               + intarray3D[1][0][1]);

	            System.out.println("3DArray[1][1][2] : "
	                              + intarray3D[1][1][2]);

	            System.out.println("3DArray[0][1][1] (other): "
	                                 + intarray3Dd[0][1][1]);

	            System.out.println("3DArray[1][0][2] (other): "
	                                 + intarray3Dd[1][0][2]);

	            // using nested loop show string elements 
	            System.out.println("To String element");
	            for (int i = 0; i < 4; i++)
	                for (int j = 0; j < 2; j++)
	                	System.out.println(str[i][j] + " ");
	        }

	        @Test
	        public void Arrays_UpdateArrayValues()
	        {
	            String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
	            cars[0] = "Opel";
	            System.out.println(cars[0]);

	            Assert.assertEquals(cars[0], "Opel");
	        }

	        @Test
	        public void Arrays_SortArrayValues()
	        {
	            int[] myNumbers = { 5, 1, 8, 9 };
	            Arrays.sort(myNumbers);

	            for (int i=0; i< myNumbers.length;i++)
	            {
	                System.out.println(myNumbers[i]);
	                if (i < myNumbers.length - 1)
	                {
	                    Assert.assertTrue(myNumbers[i] <= myNumbers[i + 1]);
	                }
	            }

	            
	        }
}
