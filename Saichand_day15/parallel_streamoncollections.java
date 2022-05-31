package Saichand_day15;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;
//Main class
	// ParallelStreamsTest
public class parallel_streamoncollections {

	  
	

	  
	    // Main driver method
	    public static void main(String[] args)
	        throws IOException
	    {
	  
	        // Creating a File object
	        File fileName = new File("C:\\Users\\sk67211\\Documents\\kadiyala.txt");
	  
	        // Reading the lines of the text file by
	        // create a List using readAllLines() method
	        List<String> text
	            = Files.readAllLines(fileName.toPath());
	  
	        // Creating parallel streams by creating a List
	        //  using readAllLines() method
	        text.parallelStream().forEach(System.out::println);
	    }

}
/* Output:
 Mr.kadiyala saichand
HII 
*/
