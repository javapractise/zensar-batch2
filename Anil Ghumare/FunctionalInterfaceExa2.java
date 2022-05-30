interface Doable{  
    default void doIt(){  
        System.out.println("Do it now");  
    }  
}  
@FunctionalInterface  
interface Sees extends Doable{  
    void say(String msg);   // abstract method  
}  
public class FunctionalInterfaceExample2 implements Sees{  
    public void say(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
        FunctionalInterfaceExample2 fie = new FunctionalInterfaceExample2();  
        fie.say("Hello there");  
        fie.doIt();  
    }  
}  


/*
Output:
Hello there
Do it now
*/