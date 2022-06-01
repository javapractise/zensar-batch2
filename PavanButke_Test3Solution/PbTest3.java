/* do not type comma(,) while entering the values use spaces or tabs (1,2,-3,5 this is wrong  , 1 2 -3 5 is a correct way to pass values) */

package May31;

import java.util.*;


public class PbTest3{
    public static void main(String[] args) {
      
//         int arr[] = {1,-2,-3, 5};
//         int arr1[] = {1, 2, 3, -5};
//         int arr2[] = {1, 2, 0, -5};

    Scanner scan = new Scanner(System.in);
    int arr[] = new int[4];
    int arr1[] = new int[4];
    int arr2[] = new int[4];
    System.out.println("Kindly Enter values in arr ");
    for(int i=0; i<arr.length ; i++) {
    	arr[i]= scan.nextInt();
    }
    
    System.out.println("Kindly Enter values in arr1 ");
    for(int i=0; i<arr.length ; i++) {
    	arr1[i]= scan.nextInt();
    }
    
    System.out.println("Kindly Enter values in arr2 ");
    for(int i=0; i<arr.length ; i++) {
    	arr2[i]= scan.nextInt();
    }
    	
         int[][] array_of_arrays = {arr, arr1, arr2};
         int[] results_array;
         results_array = solution_wrapper(array_of_arrays); 
         
         
         
         System.out.println("Result of arr having values 1,-2,-3, 5 whose multiplication = 30 is --> "+results_array[0]);
         System.out.println("Result of arr1 having values 1,-2, 3,-5 whose multiplication =-30 is --> "+results_array[1]);
         System.out.println("Result of arr2 having values 1,-2,-3, 5  whose multiplication =0 is --> "+results_array[2]);
         
    }
    
    public static int solution(int[] A) {
        int temp = 1;
        for (int i = 0; i < A.length; i++){
            temp *= A[i];
        }
        return Integer.signum(temp);
    }

    public static int[] solution_wrapper(int[][] allA) {
        int[] Solution = new int[allA.length];
        for (int j = 0; j < allA.length; j++) {
            Solution[j] = solution(allA[j]);
        }
        return Solution;
    }
}



/*o/p:
Kindly Enter values in arr 

1 -2 -3 5
Kindly Enter values in arr1 

1 2 3 -5
Kindly Enter values in arr2 
1 2 0 -5
Result of arr having values 1,-2,-3, 5 whose multiplication = 30 is --> 1
Result of arr1 having values 1,-2, 3,-5 whose multiplication =-30 is --> -1
Result of arr2 having values 1,-2,-3, 5  whose multiplication =0 is --> 0

*/

