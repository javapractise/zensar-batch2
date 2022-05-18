class A{
		void parentClass() {
			System.out.println(" This is Parent Class..");
		}
	}
	class B extends A{
		void childClass() {
			System.out.println(" This is Child Class...");
		}
	}
public class Inheritance{
	
	public static void main(String[] args) {
		A p=new A();      // creating object for parent class A
		p.parentClass(); //method of parent class by object of parent class
		
		B c = new B();   // creating object for parent class b
		c.childClass();  //method of child class by object of child class
		
		
		c.parentClass();   //method of parent class by object of child class
		

	}

}
