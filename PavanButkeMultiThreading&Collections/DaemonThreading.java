/* Program to Test Daemon Thread and setDaemon by Pavan Butke */

package zensar;

public class DaemonThreading extends Thread {
	
	
public void run() {
	
	if(Thread.currentThread().isDaemon()) {
		System.out.println("Inside the Daemon , Daemon is working ");
	}
	else {
		System.out.println("Not inside Daemon");
	}
}


public static void main(String[] args) {
	DaemonThreading t1= new DaemonThreading();
	DaemonThreading t2= new DaemonThreading();
	DaemonThreading t3= new DaemonThreading();
	
	
	t1.setDaemon(true);
	t1.start();
	t2.start();
	t3.start();
	
}

}


/*o/p-->
Inside the Daemon , Daemon is working 
Not inside Daemon
Not inside Daemon
*/
