
package Training;

public class CountPunctuation1 {
	public static void main(String args[]) {
		
		//Stores the count of punctuation marks
		int count = 0;
		String str = "He said, 'The mailman loves you.' I heard it with my own ears";
	for(int i =0; i<str.length(); i++)
	{
		//Check wheather given character is punctuation mark
		
		if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == '.' || str.charAt(i) == ';' ||  str.charAt(i) == '?' || str.charAt(i) == '-' ||    
				str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == '/')  
		{
			count++;
			
		}
	}
	System.out.println("The number of punctuation exits in the string is:" +count );
	}
	}

