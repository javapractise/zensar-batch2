package day14;

interface Sayable6 {
	void say();

}

public class MethodReference {
	public static void saySomething() {
		System.out.println("Hello, this is static method");
	}

	public static void main(String[] args) {
//Referring static method

		Sayable6 sayable = MethodReference::saySomething;
//calling interface method
		sayable.say();
	}
}

/*
Output:
Hello, this is static method
*/