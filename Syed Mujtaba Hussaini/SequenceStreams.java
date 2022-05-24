import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class Main {

	public static void main(String[] args) throws IOException {
		
		FileInputStream f = new FileInputStream("C://Users/SM67965/Documents/intro.txt");
		FileInputStream ff =new FileInputStream("C://Users/SM67965/Documents/javatypes.txt");
		SequenceInputStream s = new SequenceInputStream(f, ff);
		
//		Vector<FileInputStream> v = new Vector<FileInputStream>();
//		v.add(f);
//		v.add(ff);
//		
//		Enumeration<FileInputStream> e = v.elements();
//		
//		SequenceInputStream bin=new SequenceInputStream(e);    
//		int i=0;      
//		while((i=bin.read())!=-1){    
//		System.out.print((char)i);    
//		}
		
		int j;
		while((j = s.read()) != -1) {
			System.out.print((char)j);
		}

//		bin.close();
		f.close();
		ff.close();
		s.close();
	}

}

/**
My name is syedI am a java programmer
**/