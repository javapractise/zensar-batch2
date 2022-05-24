/* Q. Problem Statement – Rahul copies in the exam from his adjacent students. But he doesn’t want to be caught, so he changes words keeping the letter constant. That means he interchanges the positions of letters in words. You are the examiner and you have to find if he has copied a certain word from the one adjacent student who is giving the same exam, and give Rahul the markings he deserves.
 
Note that: Uppercase and lowercase are the  same.
 
Input Format:
 
First line with the adjacent student’s word
Second line with Rahul’s word
Output Format:
 
0 if not copied
1 if copied
Constraints:
 
1<=Length of string<=10^6
Sample Input:
 
CAR
 
Acr
 
Sample Output:
 
1



Solution of the Problem By Pavan Butke */


package abCoreJava;
import java.util.*;

public class Test2 {
	
	
	
	  public static void main(String[] args)
	{
	  Scanner scan=new Scanner(System.in);
	  
	  System.out.println("Please Enter a String1 which you think it is copied Check if it is copied or not :" );
	  String str1=scan.next();
	  
	  System.out.println("Please Enter a String2 from which you think is copied :");
	  
	  String str2=scan.next();
	  str1=str1.toUpperCase(); // Here I'm Pavan handling the uppercase edge case
	  
	  str2=str2.toUpperCase(); //Here again same
	  
	  
	  char arr1[]=str1.toCharArray();  // convrtng string to character array
	  Arrays.sort(arr1);  // sorting array in asc order
	  
	  
	  char arr2[]=str2.toCharArray();
	  Arrays.sort(arr2); 
	  
	  
	  String result1=new String(arr1);
	  String result2=new String(arr2);
	  
	  if(result1.equals(result2))
	   System.out.println("1");   //Checking if character is in array matches if so then return 1 
	  else 
	   System.out.println("0");  // If not then return 0
	}
	

}



/*o/p-->

Please Enter a String1 which you think it is copied Check if it is copied or not :
CAR
Please Enter a String2 from which you think is copied :

Acr
1 */

