
public class DivideString {
	public static void main(String args[]) {
		String s = "DivideString";
		int n = 3;
		int len = s.length();
		int charsnum = len/n;	
		String[] str = new String[n];
		int pos = 0;
		if((len%n) != 0) {
			System.out.println("The string can't be divided");
		}
		else {
			for(int i=0;i<len;i=i+charsnum) {
				str[pos++] = s.substring(i,i+charsnum);
			}
		}
		System.out.println("The "+n+" equal parts of string are :");
		for(int i=0;i<pos;i++) {
			System.out.println(" "+str[i]);
		}
	}
}

/*
Output:
	The 3 equal parts of string are :
		 Divi
		 deSt
		 ring
*/
