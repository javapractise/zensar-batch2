package day15;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

//Main class
//parallelStreamTest
public class GFG {

	// Main driver method
	public static void main(String[] args) throws IOException {

		// creating a file object
		File FileName = new File("D:\\test1.txt");

		// creating a stream of string type
		// using the lines()method to
		// read one line at a time from the text file
		Stream<String> text = Files.lines(FileName.toPath());

		// creating parallel stream using parallel()method
		// later using forEach() to print on console
		text.parallel().forEach(System.out::println);

		// Closing the stream
		// using close ()method
		text.close();
	}
}

/*

Output: Welcome to Java Programming.

*/
