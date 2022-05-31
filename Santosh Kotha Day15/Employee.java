package Day15;
import java.util.Objects;


public class Employee {

	private int id;
	private String firstName;
	private int age;
	private String city;
	private double salary;
	
	public Employee(int id, String firstName, String lastName,int age, String city, double salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.city = city;
		this.salary = salary;
		
	}
	public int getid() {
		return id;
		
	}
	
	public void setid(int id) {
		this.id = id;
		
	}
	
	public String getFirstName() {
		return firstName;
		
	}
public void setFirstName(String firstName) {
	this.firstName = firstName;
	
}
public int getAge() {
	return age;
	
}

public void setAge(int age) {
	this.age = age;
}

public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary =salary;
}

}
}

