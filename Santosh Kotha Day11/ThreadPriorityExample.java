package MultiThreading;
import java.lang.*;

public class ThreadPriorityExample extends Thread {

	//Method1 
	//Whenever  the start() method is calling by athread
	//the run() method is invoked
	public void run()
	{
		//print the statement
		System.out.println("Inside the run() method");
	}
	//the main method 
	
	public static void main(String args[]) {
		//creating thraeds with the help of ThreadPriorityExample class
	
		ThreadPriorityExample th1 = new ThreadPriorityExample();
		ThreadPriorityExample th2 = new ThreadPriorityExample();
		ThreadPriorityExample th3 = new ThreadPriorityExample();
		
		//we did not mention the priority of the thread
		// Therefore, the priorities of the thread is 5, the default value  
		
		//1st Thread
		//Displating the priority() method
		//using the getPriority()method
		System.out.println("Priority of the Thread th1 is :"+th1.getPriority());
		
		//2nd Thread
//Diplsying the Priorty of the Thread
		System.out.println("Priority of the Thread th2 is :"+th2.getPriority());
	//3RD Thread
		//Diplaying the priority of the THread
		System.out.println("Priority of the Thread th3:"+th3.getPriority());
		
		//setting priorities of above threads by
		//passing integer arguments
		th1.setPriority(6);
		th2.setPriority(3);
		th3.setPriority(9);
		
		//6
		System.out.println("Priority of the thread th1 is:"+th1.getPriority());
		
		//3
		System.out.println("Priority of the thraed th2 is:"+th2.getPriority());
		
		//9
		System.out.println("Priority of the thread th3:"+th3.getPriority());
	
		//Main Thread
		//Displaying name of the currently executing thread
		System.out.print("Currently Executing the Thread:"+Thread.currentThread().getName());
		
		System.out.println("Priority of the mains threads is:"+Thread.currentThread().getPriority());
		
		//Priority of the  Main Thread is 10 now
		Thread.currentThread().setPriority(10);
		
		System.out.println("Priority of the Thraed is:"+Thread.currentThread().getPriority());
		
	}
	
	
}

//output*:
//Priority of the Thread th1 is :5
//Priority of the Thread th2 is :5
//Priority of the Thread th3:5
//Priority of the thread th1 is:6
//Priority of the thraed th2 is:3
//Priority of the thread th3:9
//Currently Executing the Thread:mainPriority of the mains threads is:5
//Priority of the Thraed is:10

