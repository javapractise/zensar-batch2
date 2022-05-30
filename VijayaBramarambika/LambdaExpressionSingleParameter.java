
interface Runnable { // with no parameter
	public void run();
}
interface Sayable1 {   // with single parameter
	public void say(String msg);
}
public class LambdaExpressionSingleParameter {
	public static void main(String args[]) {
		Runnable r = ()->{
			System.out.println("The Lambda expression with no parameter");
		};
		r.run();
		Sayable1 s1 = msg->{
			System.out.println("The Lambda expression with single parameter msg is "+msg);
		};
		s1.say("Say something");
	}
}

/*
output:
The Lambda expression with no parameter
The Lambda expression with single parameter msg is Say something
*/