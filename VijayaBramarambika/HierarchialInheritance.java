package Inheritance;


class Base {
	Base() {
		System.out.println("Base class Constructor"); 
	}
}
class Derived extends Base{
	Derived() {
		System.out.println("Derived class constructor");
	}
}
class Sub extends Base {
	Sub() {
		System.out.println("Sub class constructor");
	}
}
public class HierarchialInheritance {
	public static void main(String args[]) {
		Derived d = new Derived();
		Sub s = new Sub();
	}

}


/*
output:
	Base class Constructor
	Derived class constructor
	Base class Constructor
	Sub class constructor
	*/
