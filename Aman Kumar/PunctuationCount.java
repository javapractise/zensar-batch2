package String;

public class PunctuationCount {
	public static void main(String[] args) {    
		String str = "Good Morning! Mr. Aman Kumar. Have you completed your assignment?";    
        int a = 0;        
        for(int i = 0; i < str.length(); i++) {
        	char b=str.charAt(i);
            if(b == '!' || b == '.' || b=='?')    
                a++;    
        }    
            
        //Displays the total number of punctuation present in the given string    
        System.out.println("Total number of punctuation in the string: " + a);    
    }    
}



/*

Output:
Total number of punctuation in the string: 4

*/