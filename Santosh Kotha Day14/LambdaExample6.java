package Day14;

interface Sayable{  
	String say(String message);
	
}

public class LambdaExample6 {
	public static void main(String[] args) {
		
		//you can pass multiple statements in lambda expression
	Sayable person = (message)->{
		String str1 ="I would like to say,";
		String str2= str1 + message;
		
		return str2;
	};
	
		System.out.println(person.say("Time is Very Precious"));
			
	}
}
