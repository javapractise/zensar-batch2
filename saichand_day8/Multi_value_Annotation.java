package sai;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.RetentionPolicy.CLASS;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(CLASS)
@Target(ANNOTATION_TYPE)
@interface Multi_value_Annotation {
	String book_name();
    int book_price();
    String author();
}
 
// Main class
class books {
 
    // Main driver method
    public static void main(String[] args)
    {
        // Print statement
        System.out.println("example of multi value Annotation.");
    }
}
Output:
 example of multi value Annotation.