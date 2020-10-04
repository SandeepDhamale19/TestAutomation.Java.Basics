package Exceptions;

import java.io.BufferedReader;
import java.io.FileReader;

// Try with Resources is from 1.7 and the resources that are opened as part of try block will be automatically closed without any finally block
// We can declare multiple Resources seperated by Semicolon

public class TryWithResource {

	public static void main(String[] args) {

		try(BufferedReader br = new BufferedReader(new FileReader("Input.xt")))	// These are by default final we cannot reassign the values
		{
			//br = new BufferedReader(new FileReader("Output.xt"));	//The resource br of a try-with-resources statement cannot be assigned 
			System.out.println("Inside try block");
		}
		catch (Exception e) {
			
		System.out.println("Inside catch block");
		}
	}

}