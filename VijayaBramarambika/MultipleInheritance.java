package inheritance.multiple;
interface Runnable {
	void run();
}
interface Printable {
	void print();
}
class Derived implements Runnable,Printable {
	Derived() {
		System.out.println("This is multiple inheritance");
	}
	public void run() {
		System.out.println("This is Runnable Interface");
	}
	public void print() {
		System.out.println("This is Printable Interface");
	}
}

public class MultipleInheritance {
	public static void main(String args[]) {
		Derived obj = new Derived();
		obj.run();
		obj.print();
	}

}

/*
Output:
	This is multiple inheritance
	This is Runnable Interface
	This is Printable Interface
	*/
