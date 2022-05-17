package Topic;

public class Employee {
	int wages= 100;
}
class programmer extends Employee{
	int bonus=75;
		public static void main(String[] args) {
		programmer p= new programmer();
		System.out.println("programmer wages is:"+p.wages);
		System.out.println("bonus of programmer is:"+p.bonus);
	}

}
