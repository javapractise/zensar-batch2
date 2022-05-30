package May30_2;


public class RunnableLambda {
  public static void main(String[] args) {

 
    Runnable runnable1 = new Runnable() {
      @Override
      public void run() {
        System.out.println("Thread name : " + Thread.currentThread().getName());
      }
    };
    Thread thread1 = new Thread(runnable1);

   
    Runnable runnable2 = () -> {
      System.out.println("Thread name : " + Thread.currentThread().getName());
    };
    Thread thread2 = new Thread(runnable2);

  
    thread1.start();
    thread2.start();
  }
}


/*o/p:
Thread name : Thread-0
Thread name : Thread-1
*/