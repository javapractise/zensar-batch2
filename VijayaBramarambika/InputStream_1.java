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


/*
I am learning java microservices
I am very intrested  to learn java programs
*/
