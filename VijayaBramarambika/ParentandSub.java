
class Parent {
	void run() {
		System.out.println("This is Parent class");
	}
}
class Child extends Parent {
	void print() {
		System.out.println("This is Child class");
	}
}
public class ParentandSub {
	public static void main(String args[]) {
		Parent p = new Parent();
		p.run();
		Child c = new Child();
		c.print();
		c.run();
	}
}
 
/*
Output:

This is Parent class
This is Child class
This is Parent class
*/
