package day14;

interface Sayable7 {
	void say();
}

public class InstanceMethodsReference {
	public void saySomething() {
		System.out.println("Hello,this non-static method.");
	}

	public static void main(String[] args) {
		InstanceMethodsReference methodReference = new InstanceMethodsReference();// creating object
		// Referring non-static method using reference
		Sayable7 s = MethodReference::saySomething;
		// Calling interface Method

		s.say();
		// Referring non-static method using anonymous objects
		Sayable7 s1 = new InstanceMethodsReference()::saySomething;// you can use anonymous
		// calling interface method
		s1.say();
	}
}


/*

Output:
Hello, this is static method
Hello,this non-static method..


*/