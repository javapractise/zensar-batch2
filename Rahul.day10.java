InputStream:


import java.io.*;  
class InputStream_1 {    
  public static void main(String args[])throws Exception{    
   FileInputStream input1=new FileInputStream("D:\\testin.txt");    
   FileInputStream input2=new FileInputStream("D:\\testout.txt");    
   SequenceInputStream inst=new SequenceInputStream(input1, input2);    
   int j;    
   while((j=inst.read())!=-1){    
    System.out.print((char)j);    
   }    
   inst.close();    
   input1.close();    
   input2.close();    
  }    
}    


output:

Learn Java Micro services
Madasu Rahul


-----------------------------------------------------------------------------------------
PipeWriter:

import java.io.PipedReader;  
import java.io.PipedWriter;  
  
public class PipeWriter_2 {  
    public static void main(String[] args) {  
        try {  
  
            final PipedReader read = new PipedReader();  
            final PipedWriter write = new PipedWriter(read);  
  
            Thread readerThread = new Thread(new Runnable() {  
                public void run() {  
                    try {  
                        int data = read.read();  
                        while (data != -1) {  
                            System.out.print((char) data);  
                            data = read.read();  
                        }  
                    } catch (Exception ex) {  
                    }  
                }  
            });  
  
            Thread writerThread = new Thread(new Runnable() {  
                public void run() {  
                    try {  
                        write.write("Rahul\n".toCharArray());  
                    } catch (Exception ex) {  
                    }  
                }  
            });  
  
            readerThread.start();  
            writerThread.start();  
  
        } catch (Exception ex) {  
            System.out.println(ex.getMessage());  
        }  
  
    }  
} 



output:
Rahul


-----------------------------------------------------------------------------------------
PipeReader:

import java.io.PipedReader;  
import java.io.PipedWriter;  
  
public class PipeReader_1 {  
    public static void main(String[] args) {  
        try {  
  
            final PipedReader read = new PipedReader();  
            final PipedWriter write = new PipedWriter(read);  
  
            Thread readerThread = new Thread(new Runnable() {  
                public void run() {  
                    try {  
                        int data = read.read();  
                        while (data != -1) {  
                            System.out.print((char) data);  
                            data = read.read();  
                        }  
                    } catch (Exception ex) {  
                    }  
                }  
            });  
  
            Thread writerThread = new Thread(new Runnable() {  
                public void run() {  
                    try {  
                        write.write("Rahul\n".toCharArray());  
                    } catch (Exception ex) {  
                    }  
                }  
            });  
  
            readerThread.start();  
            writerThread.start();  
  
        } catch (Exception ex) {  
            System.out.println(ex.getMessage());  
        }  
  
    }  
}  




output:
Rahul