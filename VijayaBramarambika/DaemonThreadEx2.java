
class TestDaemonThread2 extends Thread{
	public void run(){
		System.out.println("Name:"+Thread.currentThread().getName());

		System.out.println("Daemon:"+Thread.currentThread().isDaemon());
	}

	public static void main(String[] args){

		TestDaemonThread2 t1=new TestDaemonThread2();
		TestDaemonThread2 t2=new TestDaemonThread2();
		t1.start();
		t1.setDaemon(true);//will throw exception here 
		t2.start();
	}
}


/*
Output:
	Exception in thread "main" java.lang.IllegalThreadStateException
	at java.base/java.lang.Thread.setDaemon(Thread.java:1403)
	at TestDaemonThread2.main(DaemonThreadEx2.java:14)
	Name:Thread-0
	Daemon:false
*/