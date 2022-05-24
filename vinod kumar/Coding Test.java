Problem Statement – Rahul copies in the exam from his adjacent students. But he doesn’t want to be caught, so he changes words keeping the letter constant. That means he interchanges the positions of letters in words. You are the examiner and you have to find if he has copied a certain word from the one adjacent student who is giving the same exam, and give Rahul the markings he deserves.
 
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

------------------------------------------------------------------------------------------------------------------------------------
 
import java.util.Arrays;
import java.util.Scanner;

	public class CodingAssignment 
	{
		public static void main(String[] args)
	  		{
	  			Scanner sc=new Scanner(System.in);
	  		
	  					System.out.println("Enter the text of adjacent student : ");
	  		
	  				String student1=sc.next();
			
	  					System.out.println("Enter the text of rahul : ");
			
	  				String student2=sc.next();
			
	  				String s1=student1.toUpperCase();
			
	  				String s2=student2.toUpperCase();
	  		
		  	char st1_arr[]=s1.toCharArray(); //converting string to  array
		  	
	  			Arrays.sort(st1_arr);
	  		
		  	char st2_arr[]=s2.toCharArray();//converting string to  array
		  	
	  			Arrays.sort(st2_arr);
	  		
		  	String st1_res=new String(st1_arr);
		  	
	  		String st2_res=new String(st2_arr);
	  		
		  			if(st1_res.equals(st2_res))
		  			{
		  				System.out.println("1");// matches means '1'
		  			}
		  			else
		  			{ 
		  				System.out.println("0");  // if not matches means '0'
		  			}
	  		}
	}

----------------------------------------------------
  
output:

//matches
Enter the text of adjacent student : 
CAR
Enter the text of rahul : 
Acr
1

//not matches

Enter the text of adjacent student : 
CAR
Enter the text of rahul : 
Cat
0



