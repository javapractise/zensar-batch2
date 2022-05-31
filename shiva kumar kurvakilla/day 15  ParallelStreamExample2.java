//importing required classes
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

//main class
//parallelStreamTest
public class ParallelStreamExample2{
     
            //main driver method
		public static void main(String[] args)
				throws IOException
		{
		
		//crreating a file object
		File FileName
			=new File("C:\\\\Users\\\\vk67972\\\\Desktop\\\\file1.txt");

		//Reading the line of text file by
		//creating a List using readAllLines()method
		List<String>text
			=Files.readAllLines(FileName.toPath());

			//creating parallel stream by creating a List
			//using readAllLines()method

			text.parallelStream().forEach(System.out::println);
		}
	}


/*
Output:
	Java File Parallel Stream class
*/