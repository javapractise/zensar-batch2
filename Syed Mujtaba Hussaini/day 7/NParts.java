public class Main
{
	public static void main(String[] args) {
	    String s = "abcdabcdabcd";
	    String part;
	    int n = 5, j = 0,chars = s.length() / n;
	    String[] temp = new String[3];
	    
	    if(s.length() % n != 0 ){
	        System.out.println("Number is not divisible");    
	    }else{
	        for(int i = 0; i < s.length(); i = i + chars){
	            part = s.substring(i,i+chars);
	            temp[j] = part;
	            j++;
	        }
	    }
	    
	    for(String stemp: temp){
		    System.out.println(stemp);
	    }
	}
}
