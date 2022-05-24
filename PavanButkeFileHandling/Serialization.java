

package zensar;
import java.io.*;

public class student implements serializable{

int id;
string name;
public student(int id,string name){
this.id=id;
this.name=name;
}
}


thread example1
//implementing runnable interface by extending thread class
public class  ThreadExample1 extends Thread{
//run()method to perform action for thread.
public void run()
{

int a=10;
intb=12;
int result=a+b;

system.out.println("Thread started running..");
system.out.println("sum of the two numbers is:"+result);
}
publlic static void main(string args[])
{
//creating instance of the clas extend Thread class
ThreadExample1 t1=new ThreadExample1();
//calling start method to execute the run ()method of the thread class
t1.start();
}
}