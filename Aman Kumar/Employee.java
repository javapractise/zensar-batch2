interface Virtual_Meeting{
	void join();
}
public class Employee implements Virtual_Meeting{
	public void join() {
		System.out.println("Employee is Joing the Meeting.");
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.join();

	}

}
