
import java.util.Arrays;
import java.util.Scanner;
public class Test1 {
	public static void main(String args[]) {
	 	   	Scanner sc = new Scanner(System.in);
	 	   	System.out.println("Enter adjacent student's word :");
	 	   	String sWord = sc.nextLine();
	 	   	System.out.println("Enter Rahul's word :");
	 	    String rWord = sc.nextLine();
	        int len1 = sWord.length();
	        int len2 = rWord.length();
	        if(len1!=len2) {
	             	System.out.println(0); 	
	        }
	        sWord = sWord.toLowerCase();
	        rWord = rWord.toLowerCase();
	        char[] s1 = sWord.toCharArray();
	        char[] s2 = rWord.toCharArray();
	        Arrays.sort(s1);
	        Arrays.sort(s2);
	        if(Arrays.equals(s1,s2)) {
	             	System.out.println(1);
	        }
	        else {
	            	System.out.println(0);
	        }      

	}

}

/*
Output:
	Enter adjacent student's word :
	Car
	Enter Rahul's word :
	Acr
	1
*/

