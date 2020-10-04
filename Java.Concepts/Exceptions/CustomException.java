package Exceptions;

public class CustomException extends RuntimeException{

	CustomException(String s){
		super(s);
	}
}

//Customized Exception 
class AgeLimit extends RuntimeException{
	
	AgeLimit(String s){
		super(s);	// To make description available to the Default Exception Handler
	}
}

class Voting{
	
	public static void main(String[] args) {
		int age = 12;
		if(age< 18)
			throw new AgeLimit("To Young for Voting");	// Customized exception thrown
	}
}
