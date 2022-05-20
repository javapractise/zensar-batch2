public class Main
{
	public static void main(String[] args) {
	    
	    String s = "Hi! Syed, how was your day.";
	    int i = 0;
	    int count = 0;
	    for(i = 0; i<s.length(); i++){
	        if(s.charAt(i) == '!' || s.charAt(i) == ',' || s.charAt(i) == ';' || s.charAt(i) == '.' ||s.charAt(i) 
	        == '?' || s.charAt(i) == '-' ||  
                    s.charAt(i) == '\'' || s.charAt(i) == '\"' || s.charAt(i) == ':') {  
                count++;  
            }  
	    }
	   
		System.out.println("Total punctuation count: " + count);
	}
}
