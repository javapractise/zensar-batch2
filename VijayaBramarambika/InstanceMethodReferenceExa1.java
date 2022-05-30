
interface SayableExa{
	void say();
}
public class InstanceMethodReferenceExa1 {
	public void saySomething(){
		System.out.println("Hello, this is non-static method.");
	}
	public static void main(String[] args) {
		InstanceMethodReferenceExa1 methodReference = new InstanceMethodReferenceExa1(); // Creating object
		// Referring non-static method using reference
	        SayableExa sayable = methodReference::saySomething;
		// Calling interface method
	        sayable.say();
	        // Referring non-static method using anonymous object
	        SayableExa sayable2 = new InstanceMethodReferenceExa1()::saySomething;	// You can use anonymous object also
        	// Calling interface method
	        sayable2.say();
	}
}

/*
Output:
Hello, this is non-static method.
Hello, this is non-static method.
*/