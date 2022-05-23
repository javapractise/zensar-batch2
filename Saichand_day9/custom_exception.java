package exceptionhandling;
import java.util.ArrayList;
import java.util.Arrays;

// create a unchecked exception class
class CustomException extends RuntimeException {
  public CustomException(String message) {
    // call the constructor of RuntimeException
    super(message);
  }
}
public class custom_exception {
	ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "Python", "JavaScript"));

	  // check the exception condition
	  public void checkLanguage(String language) {

	    // throw exception if language already present in ArrayList
	    if(languages.contains(language)) {
	      throw new CustomException(language + " already exists");
	    }
	    else {
	      // insert language to ArrayList
	      languages.add(language);
	      System.out.println(language + " is added to the ArrayList");
	    }
	  }

	  public static void main(String[] args) {

	    // create object of Main class
		  custom_exception obj = new custom_exception();

	    // check if language already present
	    obj.checkLanguage("Swift");
	    obj.checkLanguage("Java");
	  }

}
/* output:
 Swift is added to the ArrayList
Exception in thread "main" exceptionhandling.CustomException: Java already exists  */
 
 
