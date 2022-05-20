public class Main
{
	public static void main(String[] args) {
	    
	    String s = "Hi! Syed, how was your day.";
	    int i = 0;
	    int countVowels = 0;
	    int countConsonants = 0;
	    for(i = 0; i<s.length(); i++){
	        if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' ||s.charAt(i) 
	        == 'u') {  
                countVowels++;  
            }else{
                countConsonants++;
            }  
	    }
	   
		System.out.println("Total vowels count: " + countVowels + "\n" + "Total consonants count: " + countConsonants);
	}
}
