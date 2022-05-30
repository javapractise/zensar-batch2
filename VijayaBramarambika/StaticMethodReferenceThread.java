

public class StaticMethodReferenceThread{
	   public static  void ThreadStatus(){
	     System.out.println("Thread is running...");
	}
	public static void main(String[] args){
	Thread t2=new Thread(StaticMethodReferenceThread::ThreadStatus);
	t2.start();

	}
}

/*
Output:
Thread is running...
*/