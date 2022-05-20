

class Outer {
	private int num =10;
	class Inner {
		void print() {
			System.out.println("This is Inner class");
			System.out.println("The value of outerclass variable "+num);
		}
	}
}
public class OuterInner {
	public static void main(String args[]) {
		Outer obj = new Outer();
		Outer.Inner in = obj.new Inner();
		in.print();
		
	}

}



/*
Output:
This is Inner class
The value of outerclass variable 10
*/