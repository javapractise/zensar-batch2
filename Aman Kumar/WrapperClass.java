
public class WrapperClass {
	public static void main(String[] args) {
		 //Creating the object using the Wrapper class
	    Integer a = 45332;
	    
	     //Converting the integer value to String and assigning it to stringObject
	    String b = a.toString();
	    
	    // checking the data type of b
	    System.out.println(b.getClass().getSimpleName());
	    
	    // printing the string
	    System.out.println(b);
	    
	    
	    //Printing the length of the String using length() method
	    System.out.println(b.length());
	}
}



/*
Output:
String
45332
5
*/