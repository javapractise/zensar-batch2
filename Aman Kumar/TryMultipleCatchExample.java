
public class TryMultipleCatchExample {

	public static void main(String[] args) {
		try {
		int a[]= new int[10];
		a[11]= 20/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Rest code....");
		
	}

}



/* 

Output:
java.lang.ArithmeticException: / by zero
Rest code....

*/