package Exceptions;

//An unwanted or unexpected event which disturbs normal flow of execution of a program is Exception .
//Exception Handling purpose is graceful termination of program
//Defining alternative way to continue rest of execution is called exception handling
/*For every thread JVM will craete a Run-time Stack, each n every method call performed by tat thread will be stored in the corresponding
stack. Each entry in the stack is called Stack frame or Activation record. Aftr completing every method call the corresponding frm
the stack will be removed. Aftr completing all method calls the stack will become empty and tat empty stack will be destroyed by JVM 
just before teminationg the Thread*/

//Default Exception handler is part of JVM
/*Inside a method if any exception then the method called is responsible to create exception Object with details of location, name,
description of exception
*/

public class DefaultException {

	public static void main(String[] args) {
		doStuff();
	}
	public static void doStuff() {
		System.out.println("do stuff method");
		doMoreStuff();
	}
	public static void doMoreStuff(){
		int i = 10/0;
	}
}