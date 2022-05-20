package String;

public class CharacterCountString2 {
	public static void main(String[] args) {    
        String str = "Find total number of Character present in the String";    
        int a = 0;    
            
        //Counts each character except space    
        for(int i = 0; i < str.length(); i++) {
        	char b=str.charAt(i);
            if(b != ' ')    
                a++;    
        }    
            
        //Displays the total number of characters present in the given string    
        System.out.println("Total number of characters in the string: " + a);    
    }    
}



/*

Output:
Total number of characters in the string: 44

*/