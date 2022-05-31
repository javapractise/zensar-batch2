package May30_2;

interface Sayable{  
    void say();  
}  
public class InstanceMethodReference {  
    public void saySomething(){  
        System.out.println("Hello, this is non-static method.");  
    }  
    public static void main(String[] args) {  
        InstanceMethodReference methodReference = new InstanceMethodReference(); // Creating object  
         
            Sayable sayable = methodReference::saySomething;  
     
            sayable.say();  
         
            Sayable sayable2 = new InstanceMethodReference()::saySomething; // You can use anonymous object also  
           
            sayable2.say();  
    }  
}  

/*o/p:
Hello, this is non-static method.
Hello, this is non-static method.
*/