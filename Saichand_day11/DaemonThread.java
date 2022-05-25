package Treads;


	public class DaemonThread extends Thread{
		public void run(){
			if(Thread.currentThread().isDaemon()){//checking for daemon thread
				System.out.println("daemon thread work");
			}
			else{
				System.out.println("user thread work");
			}
		}
		public static void main(String[]args){
			DaemonThread t1=new DaemonThread();//creating thread
			DaemonThread t2=new DaemonThread();
			DaemonThread t3=new DaemonThread();


			t1.setDaemon(true);//now t1 is daemon thread

			t1.start();//starting threads
			t2.start();
			t3.start();
		}

}
