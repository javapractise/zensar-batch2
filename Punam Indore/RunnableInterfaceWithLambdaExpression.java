public class RunnableInterfaceWithLambdaExpression {
	public static void main(String[] args) {

		Runnable r = () -> { // lambda expression
			System.out.println("Runnable Interface with Lambda Expression");
		};

		new Thread(r).start();
	}
}


//Output: Runnable Interface with Lambda Expression
