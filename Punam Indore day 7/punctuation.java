public class punctuation {  
    public static void main (String [] args) {  
      int countPuncMarks = 0;  
        String str = "Welcome! Ms.Punam Indore. Had your dinner?";  
        for (int i = 0; i < str.length(); i++) {  
            if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||        str.charAt(i) == '?' || str.charAt(i) == '-' ||  
                    str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':') {  
                countPuncMarks++;  
            }  
        }  
        System.out.println("Total number of punctuation characters exists in string: " +        countPuncMarks);  
    }  
}
