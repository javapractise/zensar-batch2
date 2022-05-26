package Day12;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
	public String name;
	public Student(String name) {
		this.name = name;
	}
	public int compareTo(Student person) {
		return name.compareTo(person.name);
		
	}
	
}

public class TestSort4 {
	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		
		al.add(new Student("virender"));
		al.add(new Student("Dhoni"));
		al.add(new Student("Virat"));
		al.add(new Student("Rahul"));
	
		Collections.sort(al);
		
		for(Student s:al) {
			System.out.println(s.name);
			
		}
	}

}

//output:
//Dhoni
//Rahul
//Virat
//virender

