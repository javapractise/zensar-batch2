
interface Tree{
	void branch();
	
}
interface Plant{
	void stem();
}
class Human implements Tree,Plant {
	Human() {
		System.out.println("This is Human class");
	}
	public void branch() {
		System.out.println("This is Tree interface");
	}
	public void stem() {
		System.out.println("This is Plant interface");
	}
}
class Earth extends Human {
	Earth() {
		System.out.println("This is Earth class ");
	}
	
}
public class InterfaceFour {
	public static void main(String args[]) {
		Earth e = new Earth();
		e.branch();
		e.stem();
		
	}
}


/*
Output: 
This is Human class
This is Earth class 
This is Tree interface
This is Plant interface
*/
