
public class TryCatchExample {

	public static void main(String[] args) {
		try {
			int a= 20/0;
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		
		
		try {
			String s= null;
			s.length();
		}
		catch(NullPointerException e){
			System.out.println(e);
		}
		
		
		try {
			int a[]= new int[5];
			a[5]= 50;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		
		
		try {
			String str= "asdf";
			int b= Integer.parseInt(str);
		}
		catch(NumberFormatException e){
			System.out.println(e);
		}
		
		
		System.out.println("Rest Code Executed...");
	}

}



/* 

Output:
java.lang.ArithmeticException: / by zero
java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null
java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
java.lang.NumberFormatException: For input string: "asdf"
Rest Code Executed...

*/