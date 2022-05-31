//using parallel()method on a stream
//importing required classes
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;


//Main class
//parallelStreamTest
public class ParallelStreamsExample1{

	//Main driver method
	public static  void main(String[] args)throws IOException{
	


		//creating a file object
		File FileName = new File("C:\\Users\\vk67972\\Desktop\\file1.txt");



		//creating a stream of string type
		//using the lines()method to
		//read one line at a time from the text file
		Stream<String>text =Files.lines(FileName.toPath());

		
		//creatiing parallel stream using parallel()method
		//later using forEach() to print on console
		text.parallel().forEach(System.out::println);


		//Closing the stream
		//using close ()method
		text.close();
	}
}

/*
Output:
	Java File Parallel Stream class
*/