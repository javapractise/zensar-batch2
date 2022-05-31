package May31;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;


public class ParallelStream1{


	public static  void main(String[] args)throws IOException{



		File FileName = new File("C:\\Users\\pb67966\\\\Documents.txt");




		Stream<String>text =Files.lines(FileName.toPath());


		
		text.parallel().forEach(System.out::println);


	
		text.close();
	}
}

/*o/p:
Hidden Doc\
*/
