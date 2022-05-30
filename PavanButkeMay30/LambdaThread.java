package May30;

public class LambdaThread {
	
    public static void main(String[] args) {  
        
       
        Runnable r1=new Runnable(){  
            public void run(){  
                System.out.println("Thread1 is running... without Lambda");  
            }  
        };  
        Thread t1=new Thread(r1);  
        t1.start();  
        
        
        
        Runnable r2=()->{  
                System.out.println("Thread2 is running... with Lamda");  
        };  
        Thread t2=new Thread(r2);  
        t2.start(); 

    }}

/*o/p:->
 
 Thread1 is running... without Lambda
Thread2 is running... with Lamda
  */
