Code Test :-
============

import java.util.*;
public class RahulcopyExam
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //Taking strings to compare
        String s1 = sc.next();
        System.out.print("Entered the first string : " +s1);
        String s2 = sc.next();
        s1 = s1.toUpperCase();
        s2 = s2.toUpperCase();
        
         System.out.print("Entered the second  string : " +s2);
        //sorting of arrays 
        char arr1[] = s1.toCharArray();
        Arrays.sort(arr1);
        
        char arr2[] = s2.toCharArray();
        Arrays.sort(arr2);
        //validate the strings results
        String res1 = new String(arr1);
        
        String res2 = new String(arr2);
        //validating the output by using if() and else()
        if(res1.equals(res2))
            System.out.println("\n 1");
        else
            System.out.println("\n 0");    
    }
}

Output :-
==========
1.

>>>ARUN
Entered the first string : ARUN>>>
>>>RUna
Entered the second  string : RUNA
 1

2.
>>>SAIREP
Entered the first string : SAIREP>>>
>>>REpiss
Entered the second  string : REPISS
 0



