
public class MultiThread {
	
	public static class MyThread extends Thread{
		
		@Override
		public void run() {
			for(int i = 0; i<11; i++) {
				System.out.println("Thread #1  " + i);
			try {
				Thread.sleep(2000);
			}catch(Exception e){
				e.printStackTrace();
			}
			}
			System.out.println("Thread #1 is finished :)");
		}
	}
	
	public static class MyThread2 extends Thread{
		
		@Override
		public void run() {
			for(int i = 0; i<11; i++) {
				System.out.println("Thread #2   " + i);
			try {
				Thread.sleep(1000);
			}catch(Exception e){
				e.printStackTrace();
			}
			}
			System.out.println("Thread #2 is finished :)");
		}
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		MyThread t1 = new MyThread();
		MyThread2 t2 = new MyThread2();
		
		t1.start();
//		t1.join(); //It waits for Thread 1 to be completed before starting Thread 2
		t2.start();

	}

}

/**

Thread #1  0
Thread #2   0
Thread #2   1
Thread #1  1
Thread #2   2
Thread #2   3
Thread #1  2
Thread #2   4
Thread #2   5
Thread #1  3
Thread #2   6
Thread #2   7
Thread #1  4
Thread #2   8
Thread #2   9
Thread #1  5
Thread #2   10
Thread #2 is finished :)
Thread #1  6
Thread #1  7
Thread #1  8
Thread #1  9
Thread #1  10
Thread #1 is finished :)

**/