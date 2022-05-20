

class Outer {
	int a = 20;
	private class Inner{
		void print() {
			System.out.println("This is private Inner class");
		}
	}
	void display() {
		System.out.println("Here we call private Inner class method");
		Inner obj1 = new Inner();
		obj1.print();
	}
}
public class PrivateInner {
	public static void main(String args[]) {
		Outer obj = new Outer();
		obj.display();
		
	}
}

/*
Output:
	Here we call private Inner class method
	This is private Inner class
	*/