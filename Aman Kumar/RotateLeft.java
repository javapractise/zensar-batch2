package ArrayDemo;

import java.util.Scanner;

public class RotateLeft {
	public static void main(String[] args) {  
        
        int [] array = new int [] {1, 2, 3, 4, 5,6,7};  
        try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter number of operation: ");
			int n = sc.nextInt();
			int len =array.length;
			System.out.println("Original array: ");  
			for (int i = 0; i <len; i++) {  
			    System.out.print(array[i] + " ");  
			}  
			
			for(int i = 0; i < n; i++){  
			    int j, f;  
			    
			    f = array[0];  
			    for(j = 0; j < len-1; j++){  
			        array[j] = array[j+1];  
			    }  
			   
			    array[j] = f;  
			}  
			System.out.println();   
			System.out.println("Array after left rotation: ");  
			for(int i = 0; i< len; i++){  
			    System.out.print(array[i] + " ");  
			}
		}  
    } 
}

/*

Output:
Enter number of operation: 2
Original array: 
1 2 3 4 5 6 7 
Array after left rotation: 
3 4 5 6 7 1 2 

*/