package string;

public class string_example {
	 public static void main(String[] args) {  
	        String string = "I am jr.software engineer in a zensar Technilogys";
	        int count = 0;  
	          
	        //Counts each character except space  
	        for(int i = 0; i < string.length(); i++) {  
	            if(string.charAt(i) != ' ')  
	                count++;  
	        }  
	          
	        //Displays the total number of characters present in the given string  
	        System.out.println("Total number of characters in a string: " + count);  
	    }  

}
/* output
Total number of characters in a string: 42
*/