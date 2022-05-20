package String;

import java.util.Arrays;

public class Check_Anagram {  
	 public static void main(String[] args) {
		String str1= "Keep";
		String str2= "Peek";  
        boolean status = true;  
        if (str1.length() != str2.length()) {  
            status = false;  
        } else {  
            char[] ArrayS1 = str1.toLowerCase().toCharArray();  
            char[] ArrayS2 = str2.toLowerCase().toCharArray();  
            Arrays.sort(ArrayS1);  
            Arrays.sort(ArrayS2);  
            status = Arrays.equals(ArrayS1, ArrayS2);  
        }  
        if (status) {  
            System.out.println(str1 + " and " + str2 + " are anagrams");  
        } else {  
            System.out.println(str1 + " and " + str2 + " are not anagrams");  
        }  
    
    }  
}

/*
 * 
 * Output: Keep and Peek are anagrams
 * 
*/
