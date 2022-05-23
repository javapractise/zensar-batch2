
public class MultipleCatch {
	public static void main(String[] args) {
		try {
			int n = 50/0;
			System.out.println("Exception not handled");
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Arithmetic Exception has to be handled");
		}
		System.out.println("This is program with 1 try block and multiple catch blocks");
	}
}




/*
Output:
	java.lang.ArithmeticException: / by zero
	Arithmetic Exception has to be handled
	This is program with 1 try block and multiple catch blocks
	*/

