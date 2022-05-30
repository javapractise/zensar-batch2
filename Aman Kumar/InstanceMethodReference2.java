package day14;

public class InstanceMethodReference2 {
	public void printMsg() {
		System.out.println("Hello ,this is Instance Method");

	}

	public static void main(String[] args) {
		Thread t2 = new Thread(new InstanceMethodReference2()::printMsg);
		t2.start();
	}
}

/*

Output:
Hello ,this is Instance Method


*/