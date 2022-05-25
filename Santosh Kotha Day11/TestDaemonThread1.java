package MultiThreading;

public class TestDaemonThread1 extends Thread {
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			//Checking for daemon thread
			System.out.println("daemon thread work");
		}
		else {
			System.out.println("user thread work");
		}
	}
	
	public static void main(String[] ags) {
		TestDaemonThread1 t1 = new TestDaemonThread1();
				TestDaemonThread1 t2 = new TestDaemonThread1();
				TestDaemonThread1 t3 = new TestDaemonThread1();
				
				t1.setDaemon(true);//now it is daemon thread
				
				t1.start();//starting threads
				t2.start();
				t3.start();
				
				}
}
 
//output*
//daemon thread work
//user thread work
//user thread work

