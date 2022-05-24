package Test1;
import java.util.*;
import java.io.*;
public class word_interchange {
	
	 
	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter the  string1 : " );
        String s1 = sc.next();
       
        s1 = s1.toUpperCase();
        
        
         System.out.print("Enter the  string2 : " );
         String s2 = sc.next();
         s2 = s2.toUpperCase();
        char arr1[] = s1.toCharArray();
        Arrays.sort(arr1);
        
        char arr2[] = s2.toCharArray();
        Arrays.sort(arr2);
        
        String r1 = new String(arr1);
        
        String r2 = new String(arr2);
        
        if(r1.equals(r2))
            System.out.println("\n 1");
        else
            System.out.println("\n 0");    
    }
}
/* Out put1:
Enter the  string1 : sai
Enter the   string2 : asi
1
*/
/* Output2:
 * Entered the  string1 : bus
Entered the second  string2 : van

 0
 *  
 */

