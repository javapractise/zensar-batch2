package String;

public class Divide_String {  
    public static void main(String[] args) {
    	String s = "aaabbbcccddd";
    	int a = s.length(); //Finding the length of String
        int n = 4;
        int b = 0;
        int c = a/n;  
       
        String[] equalStr = new String [n];  
         
        if(a % n != 0) {  
            System.out.println("Can't divided this String into "+ n +" equal parts.");  
        }  
        else {  
            for(int i = 0; i < a; i = i+c) {  
                String part = s.substring(i, i+c);  
                equalStr[b] = part;  
                b++;  
            }  
    System.out.println(n + " equal parts of given string are ");  
            for(int i = 0; i < equalStr.length; i++) {  
                System.out.println(equalStr[i]);  
                }  
            }  
        }  
}


/*
Output:
4 equal parts of given string are 
aaa
bbb
ccc
ddd

 */