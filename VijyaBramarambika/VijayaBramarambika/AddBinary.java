package Addition;

public class AddBinary {
	public static void main(String args[]) {
		String s1 = "1001";
		String s2 = "1010";
		int m = s1.length();
		int n = s2.length();
		int carry = 0 ;
		int i = m-1, j = n-1;
		String res = " ";
		while(i>=0 || j>=0) {
			int first = ((i>=0) && s1.charAt(i) == '1') ? 1 : 0;
			int second = ((j>=0) && s2.charAt(j) == '1') ? 1 : 0;
			int sum = first+second+carry;
			carry = sum/2;
			res = sum%2 + res;
			i--;
			j--;
		}
		if(carry == 1) {
			res = carry + res;
		}
		System.out.println("The result is " +res);
	}
}
