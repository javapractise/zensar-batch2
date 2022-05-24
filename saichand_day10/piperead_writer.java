package javacodes;
import java.io.*;
public class piperead_writer {
	public static void main(String[] args) throws IOException
    {
        PipedReader geek_reader = new PipedReader();
        PipedWriter geek_writer = new PipedWriter();
  
        // Use of connect() : connecting geek_reader with geek_writer
        geek_reader.connect(geek_writer);
  
        geek_writer.write(71);
        geek_writer.write(69);
        geek_writer.write(69);
        geek_writer.write(75);
        geek_writer.write(83);
  
        // Use of ready() method
        System.out.print("Stream is ready to be read : "+geek_reader.ready());
  
        // Use of read(char[] carray, int offset, int maxlen)
        System.out.print("\nUse of read(carray, offset, maxlen) : ");
        char[] carray = new char[5];
        geek_reader.read(carray, 0, 5);
  
        for (int i = 0; i < 5; i++)
        {
            System.out.print(carray[i]);
        }
  
        // USe of close() method :
        System.out.println("\nClosing the stream");
        geek_reader.close();
    }
}
/* output:
  Stream is ready to be read : true
Use of read(carray, offset, maxlen) : GEEKS
Closing the stream

 */

