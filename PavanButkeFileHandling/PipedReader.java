/*Example1 PipeReader PipeWriter in Java by Pavan Butke*/


package zensar;

import java.io.PipedReader;  
import java.io.PipedWriter;  

public class PipeReader {
	
	  public static void main(String[] args) {  
	        try {  
	  
	            final PipedReader read = new PipedReader();  
	            final PipedWriter write = new PipedWriter(read);  
	  
	            Thread readmeThr = new Thread(new Runnable() {  
	                public void run() {  
	                	
	                    try {  
	                        int dataOfFile = read.read();  
	                        while (dataOfFile != -1) {  
	                        	
	                        	
	                            System.out.print((char) dataOfFile);  
	                            dataOfFile = read.read();  
	                        }  
	                    } catch (Exception e) {  
	                    }  
	                }  
	            });  
	  
	            Thread writeIntoThr = new Thread(new Runnable() {  
	                public void run() {  
	                    try {  
	                    	
	                      write.write("Welcome to Zensar ! ".toCharArray());  
	                        
	                        
	                    } catch (Exception e) {  
	                    }  
	                }  
	            });  
	  
	            readmeThr.start();  
	            writeIntoThr.start();  
	  
	        } catch (Exception e) {  
	            System.out.println(e.getMessage());  
	        }  
	  
	    }  
	}  



/*op: Welcome to Zensar*/
