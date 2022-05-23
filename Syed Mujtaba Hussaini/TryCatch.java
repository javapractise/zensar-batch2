
public class Main {
	
	static class MultipleCatch{
		void testing() {			
			try {
				int[] num = new int[10];
				num[1] = 2;
				int result = num[11] + num[2];
				System.out.println(result);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}catch(NullPointerException e) {
				System.out.println(e);
			}catch(Exception e) {
				System.out.println("The final catch block");
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		try {
			int num = 3 / 0;
			System.out.println(num);
			
		}catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println("In the catch block");
		}

		MultipleCatch m = new MultipleCatch();
		m.testing();
		
	}

}

/**
Output

java.lang.ArithmeticException: / by zero
In the catch block
java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 10

**/
