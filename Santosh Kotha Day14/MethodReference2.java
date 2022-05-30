package Day14;

public class MethodReference2 {  
    public void printnMsg(){  
        System.out.println("Hello, this is instance method");  
    }  
    public static void main(String[] args) {  
    Thread t2=new Thread(new MethodReference2()::printnMsg);  
        t2.start();       
    }  
}
//output:
//Hello, this is instance method