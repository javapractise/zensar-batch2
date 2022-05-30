import java.lang.Runnable;
public class LambdaExpressionThread {
	public static void main(String args[]) {
		// Without Lambda Expression
		Runnable r1 = new Runnable() {
			public void run() {
				System.out.println("Thread1 is running without Lambda Expression");
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
		Runnable r2 = ()->{
			System.out.println("Thread2 is running with Lambda Expression");
		};
		Thread t2 = new Thread(r2);
		t2.start();
		
	}
}


/*
Output:
Thread1 is running without Lambda Expression
Thread2 is running with Lambda Expression
*/