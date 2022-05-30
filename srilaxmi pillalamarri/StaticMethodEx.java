interface Sayless{  
    void say();  
}  
public class StaticMethodEx{  
    public static void saySomething(){  
        System.out.println("Hello, this is static method.");  
    }  
    public static void main(String[] args) {  
        // Referring static method  
        Sayless sayless = StaticMethodEx::saySomething;  
        // Calling interface method  
        sayless.say();  
    }  
}  
/*
 
 Output:
 
  Hello, this is static method.
 */