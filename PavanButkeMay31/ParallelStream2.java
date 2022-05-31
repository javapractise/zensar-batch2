package May31;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;


public class ParallelStream2{

       
		public static void main(String[] args)
				throws IOException
		{

		
		File FileName
			=new File("C:\\Users\\pb67966\\Documents\\\\Document.txt");

	
		List<String>text
			=Files.readAllLines(FileName.toPath());

			

			text.parallelStream().forEach(System.out::println);
		}
	
}

/*o/p:
Hidden Doc\
*/