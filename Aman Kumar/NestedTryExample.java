
public class NestedTryExample {

	public static void main(String[] args) {
		try{
			try{
			int a= 20/0;
			
			}
			catch(ArithmeticException e) {
				System.out.println(e);
			}	
			
			try{
				int a[]= new int[5];
				a[5]=10;
				
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println(e);
			}
			
		}
		catch(Exception e){
			System.out.println(e);
			
		}
		
		System.out.println("Rest Code....");

	}

}



/*

Output:
java.lang.ArithmeticException: / by zero
java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
Rest Code....

*/