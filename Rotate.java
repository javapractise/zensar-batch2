package Arrays;

public class Rotate {
public static void main(String []args) {
	//initiallize the array
	int [] arr = new int [] {9,8,7,6,5,4,3,2,1};
	//n determine the number of times an array should be rotated
	int n =5;
	//Display original array
	System.out.println("Original array");
	for(int i =0; i<arr.length; i++) {
		System.out.println(arr[i] + "");
		
	}
	
	//Rotate the given array by n times toward left
	for(int i =0; i<n; i++) {
		int j, first;
		//Stores the first element of the array
		first = arr[0];
		for(j = 0; j<arr.length-1;j++) {
		//shift element of array by one
			arr[j] = arr[j+1];
		}
		//First element of array after rotation
		System.out.println("Array after left rotation");
		for(int i1 = 0; i1<arr.length; i1++) {
			System.out.print(arr[i1]+"");
		}
		} 
}
}
