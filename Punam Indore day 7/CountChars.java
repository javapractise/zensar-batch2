public class CountChars {
	public static void main(String args[]) {
		String str = "She is very intelligent";
		int len = str.length();
		int count =0;
		for(int i=0;i<len;i++) {
			if(str.charAt(i)!= ' ') {
				count++;
			}
		}
		System.out.println("Total no. of characters in string : "+count);
		
	}
}
