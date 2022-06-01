import java.util.Scanner;

public class ArrayMultiplicationSign {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Value of N: ");
		int N = s.nextInt();
		int[] Array = new int[N];
		System.out.println("Enter Array Element: ");
		for (int i = 0; i < N; i++) {
			Array[i] = s.nextInt();
		}
		int Mul = 1;
		for (int i = 0; i < N; i++) {
			Mul = Mul * Array[i];
		}
		if (Mul == 0) {
			System.out.println("0");
		} else if (Mul < 0) {
			System.out.println("-1");
		} else {
			System.out.println("1");
		}

	}
}

/*

Output:

Value of N: 
4
Enter Array Element: 
1
-2
-3
5
1

************

Value of N: 
4
Enter Array Element: 
1
2
3
-5
-1
*************

Value of N: 
4
Enter Array Element: 
1
2
0
-5
0

*/