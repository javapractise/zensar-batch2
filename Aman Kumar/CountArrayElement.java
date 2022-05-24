package ArrayDemo;

public class CountArrayElement {
	public static void main(String args[]) {
		int[] array = {1,3,5,2,1,6,2,5,1,2,3,6};
		int len = array.length;
		int[] f = new int [len];
		for(int i=0;i<len;i++) {
			int count =1;
			for(int j=i+1;j<len;j++) {
				if(array[i] == array[j]) {
				
					count ++;
					f[j] = -1;
				}
			}
			if(f[i]!= -1) {
				f[i] = count;
			}
		}
		System.out.println("The frequency of element in the array is: ");
		for(int i=0;i<len;i++) {
			if(f[i]!=-1) {
				System.out.println(array[i]+ "-> "+f[i]);
			}
		}
	}
}

/*

The frequency of element in the array is: 
1-> 3
3-> 2
5-> 2
2-> 3
6-> 2
	
*/