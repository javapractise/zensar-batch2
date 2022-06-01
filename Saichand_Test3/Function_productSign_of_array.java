package Saichand_Test2;
import java.util.Scanner;
public class Function_productSign_of_array {
	  
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int N = sc.nextInt();
		int[] array = new int[N];
		System.out.println("Enter the  elements of the array A : ");
		for(int i=0;i<N;i++) {
			array[i] = sc.nextInt();
		}
		boolean s = false;
		int Count = 0;
		for(int i=0;i<N;i++) {
			if(array[i] == 0) {
				s = true;
				break;
			}
			else if(array[i]<0) {
				Count++;
			}
		}
		int result;
		if(s) {
			result= 0;
		}
		else if(Count%2 == 0) {
			result = 1;
		}
		else {
			result = -1;
		}
		System.out.println(result);

	}
}

 /* output:
  * Example 1:
  Enter the number of elements : 
6
Enter the  elements of the array A : 
1 -2 -3 5 6 7

1


Example 2:
=========================
Enter the number of elements : 
4
Enter the  elements of the array A : 
1 2 3 -5

-1
==============================================================================
Example3:
output:
=======
Enter the number of elements : 
4
Enter the  elements of the array A : 
1 2 0 -5
0


  */


