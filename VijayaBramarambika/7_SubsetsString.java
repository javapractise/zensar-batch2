
public class SubsetsStr {
	public static void main(String args[]) {
		String str = "HelloWorld";
		int len = str.length();
		String[] substr = new String[len*(len+1)/2];
		int pos = 0;
		for(int i=0;i<len;i++) {
			for(int j=i;j<len;j++) {
				substr[pos++] = str.substring(i, j+1); 
			}
		}
		System.out.println("The substrings are : ");
		for(int i=0;i<pos;i++) {
			System.out.println(substr[i]);
		}
		
	}
}

/*

Output:
	The substrings are : 
		H
		He
		Hel
		Hell
		Hello
		HelloW
		HelloWo
		HelloWor
		HelloWorl
		HelloWorld
		e
		el
		ell
		ello
		elloW
		elloWo
		elloWor
		elloWorl
		elloWorld
		l
		ll
		llo
		lloW
		lloWo
		lloWor
		lloWorl
		lloWorld
		l
		lo
		loW
		loWo
		loWor
		loWorl
		loWorld
		o
		oW
		oWo
		oWor
		oWorl
		oWorld
		W
		Wo
		Wor
		Worl
		World
		o
		or
		orl
		orld
		r
		rl
		rld
		l
		ld
		d
*/