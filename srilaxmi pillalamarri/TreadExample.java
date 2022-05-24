public class  TreadExample extends Thread{
//run()method to perform action for thread.
public void run()
{

int a=10;
int b=12;
int result=a+b;

System.out.println("Thread started running..");
System.out.println("sum of the two numbers is:"+result);
}
public static void main(String args[]) {
//creating instance of the clas extend Thread class
TreadExample t=new TreadExample();
//calling start method to execute the run ()method of the thread class
t.start();
}
}


/*
 
  output:
  
  Thread started running..
sum of the two numbers is:22

 */

