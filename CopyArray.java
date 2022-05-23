package Arrays;

public class CopyArray {
public static void main(String[] args) {
	//innitialize array
	int [] arr1 = new int [] {1, 2, 4, 6, 8, 9};
	// create another array arr3 with the size of arr1
	int arr2[] = new int[arr1.length];
	//copying all the elements of one array into another
	for(int i =0; i<arr1.length; i++) {
	arr2[i] = arr1[i];
}
	//displaying elements of array arr1
	System.out.println("Elements of original array");
	for(int i =0; i<arr1.length; i++) {
		System.out.println(arr1[i]+"");
		
	}
	System.out.println();
	//Displaying elements of array 2
	System.out.println("Elements of new array");
	for(int i = 0; i<arr2.length; i++) {
		System.out.println(arr2[i]+"");
		
	}
}
}
