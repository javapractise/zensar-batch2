package day14;

interface sayable {
	public String say();
}

public class LambdaExpressionExample3 {
	public static void main(String[] args) {
		sayable s = () -> {
			return "I have nothing to say.";
		};
		System.out.println(s.say());
	}
}


/*

Output:
I have nothing to say.

*/