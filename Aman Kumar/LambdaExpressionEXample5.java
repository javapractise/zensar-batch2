package day14;

interface Addable {
	int add(int a, int b);
}

public class LambdaExpressionEXample5 {
	public static void main(String[] args) {

		//multiple parameters in lambda expression

		Addable add1 = (a, b) -> (a + b);
		System.out.println(add1.add(10, 20));

		//multiple parameters with data type in lambda expression
		Addable add2 = (int a, int b) -> (a + b);
		System.out.println(add2.add(100, 200));
	}
}

/*

Output:
30
300

*/