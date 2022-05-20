


public class VowelConsonantsCount {
        public static void main(String args[]) {
                String str = "This is Java program";
                int len = str.length();
                int count1 = 0,count2 =0;
                for(int i=0;i<len;i++) {
                	if((str.charAt(i)>='A' && str.charAt(i)<='Z') ||(str.charAt(i)>='a' && str.charAt(i)<='z')) {
                        if(str.charAt(i)== 'a' ||str.charAt(i)=='e'||str.charAt(i)== 'i' ||str.charAt(i)== 'o'||str.charAt(i)== 'u'|| str.charAt(i) == 'A' ||str.charAt(i)== 'E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U') {
                                count1++;
                        }
                        else {
                        	count2++;
                        }
                	}
                }
                System.out.println("Total no. of vowels in  string : "+count1);
                System.out.println("Total no. of consonants in  string : "+count2);

        }
}


/*
Output:
	Total no. of vowels in  string : 6
	Total no. of consonants in  string : 11
*/