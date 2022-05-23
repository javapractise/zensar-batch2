public class Main
{
	public static void main(String[] args) {
		
		String s1 = "Syed";
		String s2 = "cool";
		int count = 0;
		int counttwo = 0;
		
		for(char ss: s1.toCharArray()){
		    count++;
		}
		
		for(char ss: (s1+s2).toCharArray()){
		    counttwo++;
		}
		
		System.out.println("The total no of char in s1 is: " + count);
		System.out.println("The total no of char in s1 and s2 is: " + counttwo);
		
		String s = "Hi! Syed, how was your day.";
	    int i = 0;
	    int countp = 0;
	    for(i = 0; i<s.length(); i++){
	        if(s.charAt(i) == '!' || s.charAt(i) == ',' || s.charAt(i) == ';' || s.charAt(i) == '.' ||s.charAt(i) 
	        == '?' || s.charAt(i) == '-' ||  
                    s.charAt(i) == '\'' || s.charAt(i) == '\"' || s.charAt(i) == ':') {  
                countp++;  
            }  
	    }
	   
		System.out.println("Total punctuation count: " + countp);
		
	}
}

/**
output

The total no of char in s1 is: 4
The total no of char in s1 and s2 is: 8
Total punctuation count: 3

**/