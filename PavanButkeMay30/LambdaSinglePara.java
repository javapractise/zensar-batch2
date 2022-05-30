package May30;

interface Sayable{  
    public String say(String name);  
}  
  
public class LambdaSinglePara{  
    public static void main(String[] args) {  
      
  
        Sayable s1=(name)->{  
            return "Hello, "+name;  
        };  
        System.out.println(s1.say("Subah"));  
          
        // You can omit function parentheses    
        Sayable s2= name ->{  
            return "Hello, "+name;  
        };  
        System.out.println(s2.say("Subah"));  
    }  
}  


/*Hello, Subah
Hello, Subah*/