package day14;

import java.util.*;
import java.util.function.Predicate;

class Employee {
	public String name;
	public int age;

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class LambdaPredicateTest {
	public static void main(String args[]) {
		Employee emp1 = new Employee("Raja", 26);
		Employee emp2 = new Employee("Jaidev", 24);
		Employee emp3 = new Employee("Adithya", 30);

		List<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);

		Predicate<Employee> p = (e) -> e.age >= 25;
		for (Employee emp : empList) {
			if (p.test(emp)) {
				System.out.println(emp.name + " is eligible by age");
			}
		}

	}

}


/*

Output:
Raja is eligible by age
Adithya is eligible by age

*/
