
public class RunnableLambda {
	public static void main(String aergs[]) {
		Runnable task1 = ()->{
			System.out.println("Implementing Runnable using Lambda");
		};
		Thread t1 = new Thread(task1);
		t1.start();
	}
}


/*Output:
Implementing Runnable using Lambda
*/