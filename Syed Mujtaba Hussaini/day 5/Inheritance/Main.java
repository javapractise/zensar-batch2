public class Main
{
	public static void main(String[] args) {
		System.out.println("calculator world, please begin....");
		System.out.println(calculator(2,3,"+")); //Add
		System.out.println(calculator(2,3,"-")); //Subtract
		System.out.println(calculator(2,3,"*")); //Multiplication
		System.out.println(calculator(2,3,"/")); //Division
		System.out.println(calculator(2,3,";")); //Incorrect operator
	}
	
	static float calculator(int numone, int numtwo, String operator){
	    if (operator == "+")
	        return numone + numtwo;
	    else if (operator == "-")
	        return numone - numtwo;
	    else if (operator == "*")
	        return numone * numtwo;
	    else if (operator == "/")
	        return numone / numtwo;
	   else
	        System.out.println("Incorrect operator, please try again");
	        return 0;
	}
}
