

class ApplicationException extends Exception{
	ApplicationException(Exception e) {
		super(e);
	}
	
}
public class ChainedException {
	public static void test() throws ApplicationException {
		try {
			int a=10;
			int b=0;
			int c = a/b;
		}
		catch(Exception e) {
			throw new ApplicationException(e);
		}
	}
	public static void  main(String args[]) {
		try {
			test();
		}
		catch(ApplicationException e) {
			System.out.println(e.getMessage());
			
		}
		finally {
			System.out.println("Example for Chained Exception");
		}
	}
}

/*
Output:
	java.lang.ArithmeticException: / by zero
	Example for Chained Exception
*/

