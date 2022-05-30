package day14;

interface sayable5 {
	default void method() {
		System.out.println("Hello ,this is default method");
	}

//abstract method
	void sayMore(String msg);

//static method
	static void sayLouder(String msg) {
		System.out.println(msg);
	}
}

public class defaultMethods implements sayable5 {
	public void saymore(String msg) { // implementing abstract method
		System.out.println(msg);
	}

	public static void main(String[] args) {
		defaultMethods dm = new defaultMethods();
		dm.method(); // calling Default method
		dm.sayMore("work is worship"); // calling abstract method
		sayable5.sayLouder("Hellooooo...."); // calling static method
	}

	@Override
	public void sayMore(String msg) {
		// TODO Auto-generated method stub

	}
}

/*

Output:
Hello ,this is default method
Hellooooo....

*/