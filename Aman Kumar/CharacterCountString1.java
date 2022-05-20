package String;

public class CharacterCountString1 {
	public static void main(String[] args) {    
        String str = "The escape character is used to escape some of the characters present inside a string";    
        int a = 0;    
            
        //Counts each character except space    
        for(int i = 0; i < str.length(); i++) {    
            if(str.charAt(i) != ' ')    
                a++;    
        }    
            
        //Displays the total number of characters present in the given string    
        System.out.println("Total number of characters in the string: " + a);    
    }    
}



/*

Output:
Total number of characters in the string: 71

*/