package May26;
import java.util.*;

 
	abstract class Dish{  
	abstract void eat();  
	}  
	class Biryani extends Dish{  
	void eat(){System.out.println("Eating Biryani");}  
	}  
	class Chawal extends Dish{  
	void eat(){System.out.println("Eating Chawal");}  
	}  
	class WildCard1 { 
	  
	public static void eatFood(List<? extends Dish> lists){  
	for(Dish s:lists){  
	s.eat();
	}  
	}  
	public static void main(String args[]){  
	List<Biryani> list1=new ArrayList<Biryani>();  
	list1.add(new Biryani());  
	  
	List<Chawal> list2=new ArrayList<Chawal>();  
	list2.add(new Chawal());  
	list2.add(new Chawal());  
	  
	eatFood(list1);  
	eatFood(list2);  
	}}

/* o/p-->
Eating Biryani
Eating Chawal
Eating Chawal
*/