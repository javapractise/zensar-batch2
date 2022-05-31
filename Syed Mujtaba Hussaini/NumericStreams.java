import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class NumericStreams {

	public static class Employee {
	 private int id;
	 private String firstName;
	 private String lastName;
	 private int age;
	 private String city;
	 private double salary;

	 public Employee(int id, String firstName, String lastName, int age,
	   String city, double salary) {
	  super();
	  this.id = id;
	  this.firstName = firstName;
	  this.lastName = lastName;
	  this.age = age;
	  this.city = city;
	  this.salary = salary;
	 }

	 public int getId() {
	  return id;
	 }

	 public void setId(int id) {
	  this.id = id;
	 }

	 public String getFirstName() {
	  return firstName;
	 }

	 public void setFirstName(String firstName) {
	  this.firstName = firstName;
	 }

	 public String getLastName() {
	  return lastName;
	 }

	 public void setLastName(String lastName) {
	  this.lastName = lastName;
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
	  this.salary = salary;
	 }

	 @Override
	 public boolean equals(Object employee) {
	  if (Objects.isNull(employee))
	   return false;

	  if (!(employee instanceof Employee))
	   return false;

	  Employee emp = (Employee) employee;

	  return id == emp.id;
	 }

	 @Override
	 public int hashCode() {
	  return Objects.hash(id, firstName, lastName, age);
	 }

	 @Override
	 public String toString() {
	  return String.format("%s(%s,%d,%f)", firstName, city, age, salary);
	 }

	}
	
	public static List<Employee> getEmployees() {
		  Employee emp1 = new Employee(1, "Hari Krishna", "Gurram", 26,
		    "Bangalore", 40000);
		  Employee emp2 = new Employee(2, "Joel", "Chelli", 27, "Hyderabad",
		    50000);
		  Employee emp3 = new Employee(3, "Shanmukh", "Kummary", 28, "Chennai",
		    35000);
		  Employee emp4 = new Employee(4, "Harika", "Raghuram", 27, "Chennai",
		    76000);
		  Employee emp5 = new Employee(5, "Sudheer", "Ganji", 27, "Bangalore",
		    90000);
		  Employee emp6 = new Employee(6, "Rama Krishna", "Gurram", 27,
		    "Bangalore", 56700);
		  Employee emp7 = new Employee(7, "PTR", "PTR", 27, "Hyderabad", 123456);
		  Employee emp8 = new Employee(8, "Siva krishna", "Ponnam", 28,
		    "Hyderabad", 98765);
		  Employee emp9 = new Employee(9, "Raju", "Antony", 40, "Trivendram",
		    198765);

		  Employee emp10 = new Employee(10, "Brijesh", "Krishnan", 34,
		    "Trivendram", 100000);
		  Employee emp11 = new Employee(9, "Raju", "Antony", 40, "Trivendram",
		    198765);

		  Employee emp12 = new Employee(10, "Brijesh", "Krishnan", 34,
		    "Trivendram", 100000);

		  List<Employee> employees = new ArrayList<>();

		  employees.add(emp1);
		  employees.add(emp2);
		  employees.add(emp3);
		  employees.add(emp4);
		  employees.add(emp5);
		  employees.add(emp6);
		  employees.add(emp7);
		  employees.add(emp8);
		  employees.add(emp9);
		  employees.add(emp10);
		  employees.add(emp11);
		  employees.add(emp12);

		  return employees;
		 }

	public static void main(String[] args) {
			List<Employee> emp = getEmployees();
				
				double salary = emp.stream().mapToDouble(Employee::getSalary).sum();
				OptionalDouble min_salary = emp.stream().mapToDouble(Employee::getSalary).min();
				OptionalDouble max_salary = emp.stream().mapToDouble(Employee::getSalary).max();
				OptionalDouble avg_salary = emp.stream().mapToDouble(Employee::getSalary).average();
				System.out.println("All salaries: " + salary);
				System.out.println("Min salary: " +  min_salary.getAsDouble());
				System.out.println("Max salary: " +  max_salary.getAsDouble());
				System.out.println("Average salary: " +  avg_salary.getAsDouble());
	}
}

/**
All salaries: 1167451.0
Min salary: 35000.0
Max salary: 198765.0
Average salary: 97287.58333333333
**/