package Day14;
interface Sayable{  
    public String say();  
}  
public class LamdaExample2{  
public static void main(String[] args) {  
    Sayable s=()->{  
        return "I have nothing to say.";  
    };  
    System.out.println(s.say());  
}  
}  

//output:
//I have nothing to say.
