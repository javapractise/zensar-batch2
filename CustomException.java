package Training;

@SuppressWarnings("serial")
class MyCustomException extends Exception{
	
}
public class CustomException {



public static void main(String[] args) {
	
	try {
		throw new MyCustomException();
		
	}
	catch(MyCustomException ex)
	{
		System.out.println("Caught the Exception");
		System.out.println(ex.getMessage());
	}
		System.out.println("Rest of the code");
		
}}