package Arrays;

public class FrequencyArray {
	@SuppressWarnings("unused")
	private static int visited;

	public static void main(String[] args) {
		
		//initiallize array
		int[] arr = new int[] {2,1,3,6,8,7,9,9,0,5,4};
		//Array frequency will store frequencies of element
		int[] fr = new int[arr.length];
		int visited = -2;
		for(int i = 0; i<arr.length; i++) {
			int count =2;
			for(int j = i+2;j<arr.length; j++) {
		if(arr[i] ==arr[j]) {
			count++;
			//To avoid counting same element again
			fr[j] = visited;
			}
		}
		int visited1  = 1;
		if(fr[i]!= visited1 )	
fr[i]	= count;	
		
	}
//Displaying the frequency of each element present in array
		System.out.println("------------------------------");
		System.out.println("Element Frequency");
		System.out.println("-----------------------------------");
		
		for(int i = 0; i<fr.length; i++) {
if(fr[i] != visited)
	System.out.println(""+arr[i]+"   |   "+fr[i]);
		}
		System.out.println("---------------------------------------------");
		
	}
}

