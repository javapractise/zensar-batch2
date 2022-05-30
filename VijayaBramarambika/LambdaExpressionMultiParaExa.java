
interface Multiply{
	public int mul(int a,int b);
}
public class LambdaExpressionMultiParaExa {
	public static void main(String args[]) {
		Multiply m1 = (a,b)-> {return (a*b);};
		System.out.println("Lambda expression with multiple parameters");
		System.out.println("The multiplication is "+m1.mul(4, 5));
		Multiply m2 = (int a,int b)->{return (a*b);};
		System.out.println("Multiplication with datatypes mentioned is "+m2.mul(50, 6));
	}

}


/*
 Output:
 Lambda expression with multiple parameters
 The multiplication is 20
 Multiplication with datatypes mentioned is 300
 */
