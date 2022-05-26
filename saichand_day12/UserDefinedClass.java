package saichand_day12;

	import java.util.*;  

	class Student implements Comparable<Student> {  
	    public String name;  
	  public Student(String name) {  
	    this.name = name;  
	  }  
	  public int compareTo(Student person) {  
	    return name.compareTo(person.name);  
	      
	  }   
	}  
	public class UserDefinedClass {  
	  public static void main(String[] args) {  
	      ArrayList<Student> al=new ArrayList<Student>();  
	      al.add(new Student("kadiyala"));  
	      al.add(new Student("Saichand"));  
	      al.add(new Student("Mukesh"));  
	      al.add(new Student("sahir"));  
	      
	    Collections.sort(al);  
	    for (Student s : al) {  
	      System.out.println(s.name);  
	    }  
	  }  
}
	/* output:
	 Mukesh
Saichand
kadiyala
sahir
*/
