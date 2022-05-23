
class InvalidMarksException extends Exception {
	public InvalidMarksException(String e) {
		super(e);
	}
	
}
public class CustomException {
	public static void promote(int marks) throws Exception {
		if(marks<35) {
			throw new InvalidMarksException("Not eligible to promote");
		}
		else {
			System.out.println("Promoted");
		}
	}
 	public static void main(String args[]) throws Exception {
		try {
			promote(29);
		}
		catch(InvalidMarksException e) {
			System.out.println(e.getMessage());
		}
		
	}
}


/*
Output:
	Not eligible to promote
	*/


