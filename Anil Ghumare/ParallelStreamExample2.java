import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
class Employee {
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
public class NumericStreamsExample {
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

 public static void main(String args[]) {
  List<Employee> employees = getEmployees();

  /* Get sum of all employee salaries */
  double totalSalary = employees.stream()
    .mapToDouble(Employee::getSalary).sum();

  /* Minimum salary */
  OptionalDouble minSalary = employees.stream()
    .mapToDouble(Employee::getSalary).min();

  /* Maximum salary */
  OptionalDouble maxSalary = employees.stream()
    .mapToDouble(Employee::getSalary).max();

  /* Average salary */
  OptionalDouble avgSalary = employees.stream()
    .mapToDouble(Employee::getSalary).average();

  System.out.println("Total Salary : " + totalSalary);
  System.out.println("Minimum Salary : " + minSalary.getAsDouble());
  System.out.println("Maximum Salary : " + maxSalary.getAsDouble());
  System.out.println("Average Salary : " + avgSalary.getAsDouble());
 }
}




/*Output:
Total Salary : 1167451.0
Minimum Salary : 35000.0
Maximum Salary : 198765.0
*/