package Day14;
import java.util.*;

public class LambdaExample5 {
public static void main(String[] args) {
	
	List<String>list = new ArrayList<String>();
	list.add("Balaya");
	list.add("Rama");
	list.add("Krishna");
	list.add("Janatha");
	
	list.forEach(
			(n)->System.out.println(n)
	);
}
}


//output:
//Balaya
//Rama
//Krishna
//Janatha
