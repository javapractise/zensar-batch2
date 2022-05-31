package day14;

interface SaySomething {
	public String say(String name);
}

public class LambdaExpressionExample4 {
	
	public static void main(String[] args) {

		//Lambda expression with single parameter.
		SaySomething s1 = (name) -> {
			return "Hello " + name;
		};
		System.out.println(s1.say("World"));
		//you can omit function parentheses
		SaySomething s2 = name -> {
			return "Hello " + name;
		};
		System.out.println(s2.say("World"));
	}
}

/*

Output:
Hello World
Hello World

*/