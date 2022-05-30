public String say();
}
public class NoParameter{
public static void main(String[] args){
sayable s=()->{
return "siddu.";
};
System.out.println(s.say());
}
}


out put:
siddu.

