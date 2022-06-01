package test2;
import java.util.Scanner;

public class MultipleArraySign {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements : ");
		int n = sc.nextInt();
		int[] array = new int[n];
		System.out.println("Enter " + n + " elements : ");
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		boolean isZero = false;
		int negativeCount = 0;
		for (int i = 0; i < n; i++) {
			if (array[i] == 0) {
				isZero = true;
				break;
			} else if (array[i] < 0) {
				negativeCount++;
			}
		}
		int sign;
		if (isZero) {
			sign = 0;
		} else if (negativeCount % 2 == 0) {
			sign = 1;
		} else {
			sign = -1;
		}
		System.out.println(sign);

	}
}


/*
Output:1
Enter number of elements : 4
Enter 4 elements : 1 -2 -3 5
1
Output:2
Enter number of elements : 4
Enter 4 elements : 1 2 3 -5
-1
Output:3
Enter number of elements : 4
Enter 4 elements : 1 2 0 -5
0
*/
