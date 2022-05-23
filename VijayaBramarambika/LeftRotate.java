
public class LeftRotate {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		int n = arr.length;
		int k = 2;
		if(k%n != 0) {
			k = k % n;
			int previous;
			for(int i=0;i<k;i++) {
				previous = arr[0];
				for(int j=0;j<n-1;j++) {
					arr[j] = arr[j+1];
				}
				arr[n-1] = previous;
			}
		}
		System.out.println("The rotated array is ");
		for(int i=0;i<n;i++) {
			System.out.print(" "+arr[i]);
		}
	}
}

/*
Output:
	The rotated array is 
	 3 4 5 6 1 2
*/