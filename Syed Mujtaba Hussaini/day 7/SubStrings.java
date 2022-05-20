public class Main
{
	public static void main(String[] args) {
	    String s = "cup";
	    int len = s.length();
	    int k = 0;
	    String[] temp = new String[(len * (len + 1)) / 2];
	    
	    for(int i = 0; i < len; i++){
	        for(int j = i; j < len; j++){
	            temp[k] = s.substring(i, j+1);
	            k++;
	        }
	    }
	    
	    for(String t: temp){
	        System.out.println(t);
	    }
	}
}
