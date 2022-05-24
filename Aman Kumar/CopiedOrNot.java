import java.util.Arrays;
import java.util.Scanner;

public class CopiedOrNot {

	public static void main(String[] args) {
		// Creating Object of Scanner Class
		Scanner s = new Scanner(System.in);
		String str1 = s.next();
		String str2 = s.next();
		
		
		// Converting String into Lower Case
		String s1= str1.toLowerCase();
		String s2= str2.toLowerCase();
		
		//converting strings into character array
		char array1[]= s1.toCharArray();
		char array2[]= s2.toCharArray();
		
		//sorting the Array element
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		//Creating string from array
		String letters1= new String(array1);
		String letters2= new String(array2);
		
		
		if(letters1.equals(letters2))
		{
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
	}

}


/*

Output:
CAR
Acr
1

*/