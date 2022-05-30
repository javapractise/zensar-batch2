package day14;

interface Messageable {

	void getMessage(String string);
}

class Message {
	Message(String msg) {
		System.out.println(msg);
	}
}

public class ConstructorReference {
	public static void main(String[] args) {
		Messageable hello = Message::new;
		hello.getMessage("Hello");
	}
}


/*

Output:
Hello

*/