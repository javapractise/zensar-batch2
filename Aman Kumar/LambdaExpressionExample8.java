package day14;

interface Sayable2{  
    String say(String msg);  
}  
  
public class LambdaExpressionExample8{  
    public static void main(String[] args) {  
      
        // You can pass multiple statements in lambda expression  
        Sayable2 person = (msg)-> {  
            String str1 = "I would like to say, ";  
            String str2 = str1 + msg;   
            return str2;  
        };  
            System.out.println(person.say("time is precious."));  
    }  
}  

/*

Output:
I would like to say, time is precious.

*/