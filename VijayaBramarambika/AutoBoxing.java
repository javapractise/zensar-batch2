
public class AutoBoxing {
	public static void main(String args[]) {
		int a = 10;
		Integer obj1 =Integer.valueOf(a);
		Integer obj2 = a;
		System.out.println("The primitive int value : "+a);
		System.out.println("Explicit coversion :"+obj1);
		System.out.println("Autoboxing :"+obj2);
		
		
	}
}


/*
Output:
	The primitive int value : 10
	Explicit coversion :10
	Autoboxing :10
*/