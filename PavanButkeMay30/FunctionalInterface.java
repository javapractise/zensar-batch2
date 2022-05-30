interface Doable{  
    default void doIt(){  
        System.out.println("Do it now");  
    }  
}  

interface Sayable extends Doable{  
    void say(String msg);   
}  
public class FunctionalInterface implements Sayable{  
    public void say(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
    	FunctionalInterface fie = new FunctionalInterface();  
        fie.say("Welcome to Zensar");  
        fie.doIt();  
    }  
}  


/*Welcome to Zensar
Do it now
*/