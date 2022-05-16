public class Binary
{
	public static void main(String[] args) {
		
		int numone = 0b1001; //9 in decimal
		int numtwo = 0b0110; //6 in decimal
		
		int result = numone + numtwo; //15 in decimal
		
		System.out.printf("The result in binary is %s", Integer.toBinaryString(result));
		//Final result in binary
		
	}
}
