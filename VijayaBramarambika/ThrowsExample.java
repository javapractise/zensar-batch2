
import java.io.IOException;
 class Test{
	void run() throws IOException {
		throw new IOException("Device error");
	}
	void fast() throws IOException {
		run();
	}
	void start() throws IOException {
		try {
			fast();
		}
		catch(IOException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Exception handling using throws");
		}
	}
}
public class ThrowsExample {
	public static void main(String args[]) throws IOException {
			Test obj = new Test();
			obj.start();
	}

}

/*
Output:
	java.io.IOException: Device error
	Exception handling using throws
	*/
