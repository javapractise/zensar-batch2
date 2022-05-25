package Day11;
class TestDaemonThread2 extends Thread{
	public void run(){
		System.out.println("Name:"+Thread.currentThread().getName());

		System.out.println("Daemon:"+Thread.currentThread().isDaemon());
	}

	public static void main(String[] args){

		TestDaemonThread2 t1=new TestDaemonThread2();
		TestDaemonThread2 t2=new TestDaemonThread2();
		t1.start();
		try {
			t1.setDaemon(true);//will throw exception here
		}
		catch(Exception e){
			System.out.println(e);
		}
		t2.start();
	}
}

/*
Output:
	java.lang.IllegalThreadStateException
	Name:Thread-0
	Daemon:false
	Name:Thread-1
	Daemon:false

*/