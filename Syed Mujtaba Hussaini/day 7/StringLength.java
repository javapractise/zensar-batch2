public class Main
{
	public static void main(String[] args) {
	    
	    String s = "Syed";
	    int i = 0;
	    for(char c: s.toCharArray()){
	        i++;
	    }
		System.out.println("The length of string without length function is: " + i);
		System.out.println("The length of string with length function is: " + s.length());
	}
}

/**
The length of string without length function is: 4
The length of string with length function is: 4
**/
