package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.testng.annotations.Test;

//The exceptions which are checked by compiler for smooth execution at Runtime are checked exceptions.
//Anything followed by throws is checked exception
//Every exception occurs at Run-time only both Checked and Unchecked Exception 
//Fully Checked Exception where both parent and child are checked eg: Interrupted, IOException
//Partially Checked Exception where some of its child classes are Unchecked eg: Exception,Throwable
//Only possible partially checked exception are Exception, Throwable
/*	Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
Unhandled exception type FileNotFoundException
at introduction.exception.CheckedException.main(CheckedException.java:10)*/

public class CheckedException {

	@Test
	public void Test_CheckedException() throws FileNotFoundException {

		PrintWriter pw = new PrintWriter(GetPath() + File.separator + "crap.txt");
		pw.write("hello");
	}
	
	private String GetPath() {
		File dir = new File(System.getProperty("user.dir"));
        return dir.toString() + "\\Java.Concepts\\Exceptions";
	}
}
