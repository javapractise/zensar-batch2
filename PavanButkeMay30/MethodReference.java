package May30_2;


interface sayable{
	void say();

}
public class MethodReference{
	public static void saySomething(){
          system.out.println("Hello,thid is static method");
}
public static void main(String[] args);


sayable sayable=MethodReference::saySomething;

sayable.say();
}

public class MethodReference2 {  
    public static void ThreadStatus(){  
        System.out.println("Thread is running...");  
    }  
    public static void main(String[] args) {  
        Thread t2=new Thread(MethodReference2::ThreadStatus);  
        t2.start();       
    }  
}  

/*o/p:Hello, this is static method.*/