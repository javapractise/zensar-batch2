//Using Lambda expression and Functional interface Predicate

/*
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
public class EmployeePredicateTest {
   public static void main(String[] args) {
      Employee e1 = new Employee(1, 23, "M", "Raja");
      Employee e2 = new Employee(2, 13, "M", "Jai");
      Employee e3 = new Employee(3, 36, "F", "Yamini");
      Employee e4 = new Employee(4, 26, "F", "Geetha");
      Employee e5 = new Employee(5, 19, "M", "Adithya");
      List<Employee> employees = new ArrayList<Employee>();
      employees.addAll(Arrays.asList(new Employee[]{e1, e2, e3, e4, e5}));
      System.out.println(EmployeePredicate.filterEmployees(employees, EmployeePredicate.isAdultMale()));
      System.out.println(EmployeePredicate.filterEmployees(employees, EmployeePredicate.isAdultFemale()));
      System.out.println(EmployeePredicate.filterEmployees(employees,       EmployeePredicate.isAgeMoreThan(35)));
      System.out.println(EmployeePredicate.filterEmployees(employees, EmployeePredicate.isAgeMoreThan(35).negate()));
   }
}
// Employee class
class Employee {
   private Integer id;
   private Integer age;
   private String gender;
   private String name;
   public Employee(Integer id, Integer age, String gender, String name) {
      this.id = id;
      this.age = age;
      this.gender = gender;
     this.name = name;
   }
   public Integer getAge() {
      return age;
   }
   public String getGender() {
      return gender;
   }
   public String getName() {
      return name;
   }
   @Override
   public String toString() {
      return this.name.toString()+" - "+ this.age.toString();
   }
}
// EmployeePredicate class
class EmployeePredicate {
   public static Predicate isAdultMale() {
      return p -> p.getAge() > 21 && p.getGender().equalsIgnoreCase("M");
   }
   public static Predicate isAdultFemale() {
      return p -> p.getAge() > 18 && p.getGender().equalsIgnoreCase("F");
   }
   public static Predicate isAgeMoreThan(Integer age) {
      return p -> p.getAge() > age;
   }
   public static List filterEmployees(List<Employee> employees, Predicate<Employee> predicate) {
       return employees.stream().filter(predicate).collect(Collectors.<Employee>toList());
   }
}*/
import java.util.function.*;
public class EmployeePredicateTest {
  public static void main(String args[]) {             

    /* Java predicate lambda example */
    Predicate<Integer> lambdaPredicate = (Integer x) -> (x % 2 == 0);             

    System.out.printf("Gretzky's number is even: %s", lambdaPredicate.test(99));
    System.out.printf("\nLemieux's number is even: %s ", lambdaPredicate.test(66));
  }   
}