
public class Synchronized {

	public static class MyThread extends Thread{
		int count;
		public void run(){
			counter();
		}
		
		public synchronized void counter() {
			for(long i =0; i < 10000000000000000L; i++) {
				count++;
			}
			System.out.println("Count " + count);
		}
	}
	
	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();
		
		t1.start();	
		

	}

}

/** Count 1874919424 **/