import java.util.Scanner;

public class Calculator {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int add = a+b;
		int sub = a-b;
		int mul = a*b;
		int div = a/b;
		int mod = a%b;
		System.out.println("Addition of two numbers :" +add);
		System.out.println("Subtraction of two numbers :" +sub);
		System.out.println("Multiplication of two numbers :" +mul);
		System.out.println("Division of two numbers :" +div);
		System.out.println("Remainder of two numbers :" +mod);
		sc.close();
		
		
		
	}
}
