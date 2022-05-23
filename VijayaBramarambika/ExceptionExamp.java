
public class ExceptionExamp {
	public static void main(String args[]) {
		try {
			int a = 100/0;
			System.out.println("Exception not handled");
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println("Exception handled");
		}
		finally {
			System.out.println("Finally block executed");
		}
		
		System.out.println("Rest of code");

	}

}


/*
 Output:
	java.lang.ArithmeticException: / by zero
	Exception handled
	Finally block executed
	Rest of code

 */
