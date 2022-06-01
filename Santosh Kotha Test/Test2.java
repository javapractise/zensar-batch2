package Test;


public class Test2 {
	public static void main(String[] args) {
		
		int arr1[] = {1, -2, -3, 5};
		int arr2[] = {1, 2, 3, -5};
		int arr3[] = {1, 2, 0, -5};
		System.out.println("[ "+ solution(arr1) +"] => Needs to be = 30"); 
		System.out.println("[ "+ solution(arr2) +"] => Needs to be = -30"); 
	System.out.println("[ "+ solution(arr3) +"] => Needs to be = 0"); 
	System.out.println("final return should be(-1, 0, 1)");
}

	public static int solution(int[]A) {
		int temp = 1;
		for(int i =0; i < A.length; i++) {
			temp*=A[i];
			
	}
		return temp;
	}

}


//Output:
//[ 30] => Needs to be =30
//[ -30] => Needs to be = -30
//[ 0] => Needs to be = 0
//final return should be(-1, 0, 1)
