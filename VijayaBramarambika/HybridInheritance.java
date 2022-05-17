package inheritance;

class Tree {
	Tree() {
		System.out.println("This is hybrid inheritance");
		System.out.println("This is Tree class ");
	}
}
class Fruit extends Tree {
	Fruit(){
		System.out.println("This is fruit class "); 
		System.out.println("Extends tree class and follows single inheritance");
	}
}
class Apple extends Fruit{
	Apple() {
		System.out.println("This is Apple class");
		System.out.println("Extends Fruitclass to follow hierarchial");
	}
}
class Mango extends Fruit{
	Mango() {
		System.out.println("This is Mango class");
		System.out.println("Extends Fruit class to follow hierarchial");
		System.out.println("Thus Hybrid inheritance");
	}
}
public class HybridInheritance {
	public static void main(String args[]) {
		Apple a = new Apple();
		Mango m = new Mango();
	}

}
/*
output:
	This is hybrid inheritance
	This is Tree class 
	This is fruit class 
	Extends tree class and follows single inheritance
	This is Apple class
	Extends Fruitclass to follow hierarchial
	This is hybrid inheritance
	This is Tree class 
	This is fruit class 
	Extends tree class and follows single inheritance
	This is Mango class
	Extends Fruit class to follow hierarchial
	Thus Hybrid inheritance

*/