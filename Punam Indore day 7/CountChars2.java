public class CountChars{
        public static void main(String args[]) {
                String str = "This is a book";
                String str1 = "This is a story book";
                String str2 = str+str1;
                int len = str2.length();
                int count =0;
                for(int i=0;i<len;i++) {
                        if(str2.charAt(i)!= ' ') {
                                count++;
                        }
                }
                System.out.println("Total no. of characters in combined string : "+count);

        }
}
