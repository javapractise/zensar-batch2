
import java.util.*;
public class LambdaExpressionForLoop {

	public static void main(String[] args) {
		List<String> ls = new ArrayList<String>();
		ls.add("Ambika");
		ls.add("Yamini");
		ls.add("Jyothsna");
		ls.add("Srija");
		ls.forEach((n)->System.out.println(n));

	}

}

/*
 Output:
 Ambika
 Yamini
 Jyothsna
 Srija

 */
