package sai;
import java.util.Scanner;
public class add_sub_mul_div {
	public static void main(String[] args) {
		int c,d,e,f;
		Scanner int_1= new Scanner(System.in);
		Scanner int_2= new Scanner(System.in);
		int a=int_1.nextInt();
		int b=int_2.nextInt();
	
		c=a+b;
		d=a-b;
		e=a*b;
		f=a/b;
	System.out.print("add" +c+ "sub" +d+ "mul" +e+ "div" +f);
	}
}
