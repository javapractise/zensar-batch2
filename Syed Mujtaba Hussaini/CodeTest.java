//		Write a function solution  that, given an array A of N integers (between -100 and 100), returns 
//		the sign (-1,0,1) of the product of all the number in the array multiplied together . 
//		Assume that N is between 1 and 1000.		 
//
//		For example, given A = [1,-2,-3, 5],the function should return 1 (the multiplication equals 30).
//
//		Given A = [1, 2, 3, -5] your function should return -1(the multiplication equals -30).
//
//		Given A = [1, 2, 0, -5] your function should return 0(the multiplication equals 0).

package basics;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of the array: ");
		int lenarr = sc.nextInt();
		
		System.out.println("Enter the elements: ");
		for(int i = 0; i<lenarr; i++ ) {
			arr.add(i, sc.nextInt());;
		}
		
		sc.close();
		
		System.out.println("Array elements are: ");
		System.out.print(arr);
		int result = 1;
		
		for(Integer a: arr) {
			result = result * a;
		}
		
		System.out.println();
		
		if(result > 0) {
			System.out.println("1");
		}else if(result < 0) {
			System.out.println("-1");
		}else {
			System.out.println("0");
		}

	}
	
}

/**

Test case 1:

Enter length of the array: 4
Enter the elements: 
1
-2
-3
5
Array elements are: 
[1, -2, -3, 5]
1

Test case 2:

Enter length of the array: 4
Enter the elements: 
1
2
3
-5
Array elements are: 
[1, 2, 3, -5]
-1

Test case 3:

Enter length of the array: 4
Enter the elements: 
1
2
0
-5
Array elements are: 
[1, 2, 0, -5]
0

**/