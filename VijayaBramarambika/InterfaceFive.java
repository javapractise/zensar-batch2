
interface Runnable {
	void run();
	interface Printable{
		void print();
	}
}
class Nested implements Runnable.Printable{
	Nested() {
		System.out.println("Implementing nested interfaces ");
	}
	public void run() {
		System.out.println("This is Runnable interface");
	}
	public void print() {
		System.out.println("This is Printable interface");
	}
}
public class InterfaceFive {
	public static void main(String args[]) {
		Nested obj = new Nested();
		obj.run();
		obj.print();
	}
}

/*
Output : 
	Implementing nested interfaces 
	This is Runnable interface
	This is Printable interface
*/