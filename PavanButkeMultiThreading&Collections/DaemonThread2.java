/* Program to what happens when we start daemon thread by Pavan Butke*/

package zensar;

public class DaemonThread2 extends Thread {
	
		 public void run(){  
		  System.out.println("My Name: "+Thread.currentThread().getName());  
		  System.out.println("Show me a Daemon: "+Thread.currentThread().isDaemon());  
		 }  
		  
		 public static void main(String[] args){  
			 DaemonThread2 thr1=new DaemonThread2();  
			 DaemonThread2 thr2=new DaemonThread2();  
		  thr1.start();  
		  thr1.setDaemon(true); 
		  thr2.start();  
		 }  
}  


/*Exception in thread "main"
My Name: Thread-0
Show me a Daemon: false
Exception in thread "main" java.lang.IllegalThreadStateException
	at java.base/java.lang.Thread.setDaemon(Thread.java:1403)
	at zensar/zensar.DaemonThread2.main(DaemonThread2.java:14)
 */