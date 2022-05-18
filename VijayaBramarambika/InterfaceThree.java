
interface ExDefault {
	void run();
	default void example() {
		System.out.println("This is default method in interface");
	}
}
class code implements ExDefault {
	public void run() {
		System.out.println("Implements ExDefault interface");
	}
}
public class InterfaceThree {
	public static void main(String args[]) {
		code obj = new code();
		obj.run();
		obj.example();
	}

}


/*
Output:
	Implements ExDefault interface
	This is default method in interface
*/