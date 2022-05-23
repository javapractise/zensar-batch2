
public class Arraycopy {
	public static void main(String args[]) {
		int arr1[] = {1,2,3,4,5,6};
		int n = arr1.length;
		int arr2[] = new int[n];
		for(int i=0;i<n;i++) {
			arr2[i] = arr1[i];
		}
		System.out.println("The copied array is ");
		for(int i=0;i<n;i++) {
			System.out.print(" "+arr2[i]);
		}
	}
}

/*
Output:
	The copied array is 
 	1 2 3 4 5 6
*/