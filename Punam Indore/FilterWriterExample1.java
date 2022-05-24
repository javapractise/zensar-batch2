import java.io.*;  
class CustomFilterWriter extends FilterWriter {  
    CustomFilterWriter(Writer out) {  
        super(out);  
    }  
    public void write(String str) throws IOException {  
        super.write(str.toLowerCase());  
    }  
}  
public class FilterWriterExample1 {  
    public static void main(String[] args) {  
        try {  
            FileWriter fw = new FileWriter("Record.txt");   
            CustomFilterWriter filterWriter = new CustomFilterWriter(fw);             
            filterWriter.write("I am learning java");  
            filterWriter.close();  
            FileReader fr = new FileReader("record.txt");  
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
//Output
i am learning java
