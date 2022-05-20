public class Main
{
	public static void main(String[] args) {
	    
	    StringBuilder sone = new StringBuilder("eye");
	    StringBuilder stwo = new StringBuilder("eye");
	    if(stwo.reverse().toString().equals(sone.toString())){
	        	System.out.println("It is an anagram");
	    }else{
	        System.out.println("It is not an anagram");
	    }
	   
	}
}
