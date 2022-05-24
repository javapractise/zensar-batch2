package basics;

public class Test {

	public static void main(String[] args) {
		
		String ans_given = "car";
		String possible_comb = "";
		printPerm(ans_given, possible_comb);

	}
	
	public static void printPerm(String ques, String ans) {
		StringBuilder s = new StringBuilder();
		String possible_ans = "acr";
		
		if(ques.length() == 0) {
			s.append(ans);
			checkAnswer(s,possible_ans);
		}
	
		
		
		for(int i = 0; i<ques.length(); i++) {
			char test = ques.charAt(i);
			String l = ques.substring(0, i);
			String r = ques.substring(i+1);
			String rest = l + r;
			printPerm(rest, ans+test);
		}
	}
	
	public static void checkAnswer(StringBuilder s, String c) {
		

			if(s.toString().contains(c)) {
				System.out.println("1"); //It gives output only for copied answers
				System.exit(0);
			}else {
				return;
			}
		
		
	}
}

/**Output

1

**/