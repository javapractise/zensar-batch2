import java.util.Scanner;
public class MultipliedArraySign {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements : ");
		int N = sc.nextInt();
		int[] array = new int[N];
		System.out.println("Enter "+N+" elements : ");
		for(int i=0;i<N;i++) {
			array[i] = sc.nextInt();
		}
		boolean isZero = false;
		int negativeCount = 0;
		for(int i=0;i<N;i++) {
			if(array[i] == 0) {
				isZero = true;
				break;
			}
			else if(array[i]<0) {
				negativeCount++;
			}
		}
		int sign;
		if(isZero) {
			sign = 0;
		}
		else if(negativeCount%2 == 0) {
			sign = 1;
		}
		else {
			sign = -1;
		}
		System.out.println(sign);

	}
}
Output:1
Enter no. of elements : 4
Enter 4 elements : 1 -2 -3 5
1

Output:2
Enter no. of elements : 4
Enter 4 elements : 1 2 3 -5
-1

Output:3
Enter no. of elements : 4
Enter 4 elements : 1 2 0 -5
0
