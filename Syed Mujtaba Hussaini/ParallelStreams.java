import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

public class ParallelStreams {

	public static void main(String[] args) throws IOException {
		
		File fileName = new File("D:\\syed.txt");
		  
        Stream<String> text = Files.lines(fileName.toPath());
  
        text.parallel().forEach(System.out::println);
  
        text.close();

	}

}

/**
9
4
22
7
13
**/