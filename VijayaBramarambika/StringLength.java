
public class StringLength {
	public static void main(String args[]) {
		String str = "java";
		char str1[] = str.toCharArray();
		int len = str.length();
		System.out.println("Length of String "+str+": "+len);
	
		int i=0;
		for(char j:str1) {
			
			i++;
		}
		System.out.println("Length of string without using builtin function "+i);
		
	}
}

/*
Output:
	Length of String java: 4
	Length of string without using builtin function 4
*/