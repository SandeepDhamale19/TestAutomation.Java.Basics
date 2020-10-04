package Exceptions;

//try catch finally block curly braces are mandatory
public class TryWithMultipleCatchBlocks {

	public static void main(String[] args) {

		try {
			System.out.println("Risky code Implementation");
		} catch (Exception e) {

			System.out.println("Handling code");
		}

		// CE error
		// Case 1 : try catch finally block curly braces are mandatory
		/*
		 * try System.out.println("without curly braces throws compile time error");
		 * catch (Exception e) { System.out.println("inside catch"); }
		 */

	}

}
