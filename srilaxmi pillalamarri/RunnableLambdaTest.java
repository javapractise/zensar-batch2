//implementing Runnable using Lambda expression:


public class RunnableLambdaTest {
  public static void main(String args[]) {
    // Implementing Runnable using anonymous class
    Runnable runnable1 = new Runnable() {
      @Override
      public void run() {
        System.out.println("Runnable not using lambda " + Thread.currentThread().getName());
      }
    };
    System.out.println(Thread.currentThread().getName() + " started");
    Thread thread1 = new Thread(runnable1);
    thread1.start();
    // Implementing Runnable using lambda
    Runnable runnable2 = () -> System.out.println("Runnable using lambda " + Thread.currentThread().getName());
    Thread thread2 = new Thread(runnable2);
    thread2.start();
  }
}


/*

output:

main started
Runnable not using lambda Thread-0
Runnable using lambda Thread-1

*/