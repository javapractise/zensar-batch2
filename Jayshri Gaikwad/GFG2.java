package day15;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

//main class
//parallelStreamTest
public class GFG2 {

	// main driver method
	public static void main(String[] args) throws IOException {

		// creating a file object
		File FileName = new File("D:\\test.txt");

		// Reading the line of text file by
		// creating a List using readAllLines()method
		List<String> text = Files.readAllLines(FileName.toPath());

		// creating parallel stream by creating a List
		// using readAllLines()method

		text.parallelStream().forEach(System.out::println);
	}
}

/*

Output:
22
13
17
4
9

*/