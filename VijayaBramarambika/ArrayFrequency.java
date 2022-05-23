
public class ArrayFrequency {
	public static void main(String args[]) {
		int[] arr1 = {1,4,2,2,4,6,1,2,8,1,6};
		int n = arr1.length;
		int[] freq = new int [n];
		for(int i=0;i<n;i++) {
			int count =1;
			for(int j=i+1;j<n;j++) {
				if(arr1[i] == arr1[j]) {
					count ++;
					freq[j] = -1;
				}
			}
			if(freq[i]!= -1) {
				freq[i] = count;
			}
		}
		System.out.println("The frequency of each elemnt in array is");
		for(int i=0;i<n;i++) {
			if(freq[i]!=-1) {
				System.out.println(arr1[i]+ "-> "+freq[i]);
			}
		}
	}
}

/*
Output:
	1-> 3
	4-> 2
	2-> 3
	6-> 2
	8-> 1
	*/
