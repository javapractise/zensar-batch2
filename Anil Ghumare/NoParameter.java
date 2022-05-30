//no parameter:
interface sayable{
public String say();
}
public class NoParameter{
public static void main(String[] args){
sayable s=()->{
return "i have nothing to say.";
};
System.out.println(s.say());
}
}


/*
 output:
 
 i have nothing to say.
 
 */