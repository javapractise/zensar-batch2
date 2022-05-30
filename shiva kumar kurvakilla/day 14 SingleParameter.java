//single parameter

interface Says{
public String say(String name);
}
public class SingleParameter{
public static void main(String[] args){


//Lambda expression with single parameter.
Says s1=(name)->{
return "Hello ,"+name;
};
System.out.println(s1.say("sonoo"));
//you can omit function parentheses
Says s2=(name)->{
return "Hello,"+name;
};
System.out.println(s2.say("sonoo"));
}
}


Output:
java -cp /tmp/r0sPMGjxde SingleParameter
Hello ,sonoo
Hello,sonoo