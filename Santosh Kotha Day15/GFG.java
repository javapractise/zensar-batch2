package Day15;

//java program to illustrate parallel streams
//using parallel()method on a stream
//importing required classes

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.stream.Stream;

//Main class
//ParallelStreamTest

public class GFG{
	//Main driver method
	public static void main(String[] args, File fileName) throws IOException{
	
	//creating a file object 
	File FileName = new File("M:\\Documents\\Textfile.txt");
	
	//creating a stream of string type
	//using the lines()method to
	//read one line at a time from the text file
	
	Stream<String>text =File.lines(fileName.toPath());
	
	//creating parallel stream using parallel()method
	//later using forEach() to print on console
	text.parallel().forEach(System.out::println);
	
	//closing the stream
	//using close()method
	text.close();
}
}



