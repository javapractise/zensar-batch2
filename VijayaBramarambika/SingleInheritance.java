package Inheritance;

// Parent Class
class Parent{
	void run() {
		System.out.println("Parent class method");
	}
}
class Child extends Parent {
	void get() {
		System.out.println("Child class method");
	}
}

public class SingleInheritance {
	public static void main(String args[]) {
		Child c = new Child();
		c.run();
		c.get();
		
	}

}

/*
output:
	Parent class method
	Child class method
	*/
