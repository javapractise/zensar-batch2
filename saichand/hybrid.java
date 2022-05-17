package sai;
interface read{
	public void reading();
}
interface work{
	public void working();
}
class Employee implements read,work{
	String firstname,lastname;
	int age;
	public void reading() {
		System.out.println("Employee is reading");
	}
	public void working() {
		System.out.println("Employee is working");
	}
}
class HEmployee extends Employee{
	int salary = 90,hoursworked;
	public int pay(){
		return salary*hoursworked;
		
	}
}
public class hybrid {
	public static void main(String[] args) {
		HEmployee emp = new HEmployee();
		emp.hoursworked = 8;
		emp.firstname = "saichand";
		emp.lastname = "kadiyala";
		emp.age = 23;
		System.out.println(emp.pay());
	}
	

}
