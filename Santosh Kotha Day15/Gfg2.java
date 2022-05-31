package Day15;

//importing required classes

import java.io.file;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;

//main class
//parallelStreamTest

public class Gfg2 {

	//main driver method
	
	public static void main(String []args) throws IOException {
		// creating a file object
		File FileName = new File("M:\\Document\\List_Textfile.txt");
		//Reading the line of text file by 
		//creating a list using realAllLines()method
		List<String>text=Files.readingAllLines(fileName.topath());
		
		//creating parallel stream bycreating a list
		//Using readAllLines()Method
		
		text.parallelStream().forEach(System.out.println);
		
	}
}
