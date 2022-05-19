
public class UnBoxing {
	public static void main(String args[]) {
		Character obj = 'c';
		char a = obj.charValue();
		char b = obj;
		System.out.println("The Wrapperclass object Character value "+obj);
		System.out.println("Explicit conversion : "+a);
		System.out.println("Unboxing : "+b);
	}
}


/*
Output:
	The Wrapperclass object Character value c
	Explicit conversion : c
	Unboxing : c
*/