/*Program 2 filter writer class by Pavan Butke*/

package zensar;
import java.io.*;  


class CustomFilterWriter extends FilterWriter {  
    CustomFilterWriter(Writer out) {  
        super(out);  
    }  
    public void write(String str) throws IOException {  
        super.write(str.toLowerCase());  
    }  
}  
public class FilterWriterExample {  
    public static void main(String[] args) {  
        try {  
            FileWriter fw = new FileWriter("MyRecord.txt");   
            CustomFilterWriter filterWriter = new CustomFilterWriter(fw);             
            filterWriter.write("Welcome to Zensar");  
            filterWriter.close();  
            FileReader fr = new FileReader("myrecord.txt");  
            BufferedReader bufferedReader = new BufferedReader(fr);  
            int k;  
            while ((k = bufferedReader.read()) != -1) {  
                System.out.print((char) k);  
            }  
            bufferedReader.close();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
}

/* o/p: Welcome to Zensar */