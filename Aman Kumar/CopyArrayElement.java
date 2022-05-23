package ArrayDemo;

public class CopyArrayElement {

	public static void main(String[] args) {
		int array1[]= new int[] {0,1,2,3,4,5,6,7,8,9};
		int len= array1.length;
		int array2[] =new int[len];
		
		
		for(int i =0; i<len;i++) {
			array2[i]= array1[i];
		
		}
		System.out.println("Element of Array 1");
		for(int i=0;i<len;i++) {
			
			System.out.print(array1[i]+ " ");
		}
		System.out.println();
		System.out.println("Element of Array 2");
		for(int i=0;i<len;i++) {
			
			System.out.print(array1[i]+ " ");
		}
	}
		
}



/*

Output:
Element of Array 1
0 1 2 3 4 5 6 7 8 9 
Element of Array 2
0 1 2 3 4 5 6 7 8 9 

*/