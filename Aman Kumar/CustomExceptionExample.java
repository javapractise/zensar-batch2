class InvalidForVotingException extends Exception {
	public InvalidForVotingException(String str) {
		super(str);
	}
	
}
public class CustomExceptionExample {
	public static void eligible(int age) throws Exception {
		if(age<18) {
			throw new InvalidForVotingException("Not eligible for Voting..");
		}
		else {
			System.out.println("Eligible for Voting..");
		}
	}
 	public static void main(String args[]) throws Exception {
		try {
			eligible(29);
		}
		catch(InvalidForVotingException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		try {
			eligible(17);
		}
		catch(InvalidForVotingException e) {
			System.out.println(e);
		}
	}
}


/*

Eligible for Voting..
InvalidForVotingException: Not eligible for Voting..

*/