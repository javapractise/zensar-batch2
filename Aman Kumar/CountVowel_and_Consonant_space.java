package String;

public class CountVowel_and_Consonant_space {
	public static void main(String[] args) {    
		String str = "The escape character is used to escape some of the characters present inside a string";    
        int v = 0;    
        int c = 0;
        int s = 0; 
        for(int i = 0; i < str.length(); i++) {
        	char b=str.charAt(i);
        	if (b=='a'|| b=='e'|| b=='i'|| b=='o' || b=='u') {
               v++;
        	}
        	else if(b==' ') {
        		s++;
        	}
        	else {
        		c++;
        	}
        }    
        System.out.println("Total number of vowel in the string: " + v);
        System.out.println("Total number of consonant in the string: " + c);
        System.out.println("Total number of space in the string: " + s);
    }    
}


/*

Output:
Total number of vowel in the string: 28
Total number of consonant in the string: 43
Total number of space in the string: 14

*/