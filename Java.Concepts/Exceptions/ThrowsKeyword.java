package Exceptions;

/*We can use Throws keyword to delegate responsibility of Exception handling to the caller(It maybe another method or JVM) then caller
method is responsible to handle that exception*/
//Only for Checked Exception (Compile time error). for Unchecked it does not make any impact.
//Usage of Throws keyword does not prevent abnormal termination as JVM terminates using default handler
//Class level we cannot use throws keyword

public class ThrowsKeyword {

	public static void main(String[] args) throws InterruptedException {
		
		Thread.sleep(100);
	}

}

//Compile time Exception
class CheckedExcpetion{
	
	public static void main(String[] args) {
	//	throw new Exception();	// Unhandled exception type Exception
	}
}

//Run time Exception
class UnCheckedExcpetion{
	
	public static void main(String[] args) {
		throw new Error();
	}
}
