class Outer {
	int a = 20;
	private class Inner{
		void print() {
			System.out.println("This is a book");
		}
	}
	void display() {
		System.out.println("This is a story book");
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
