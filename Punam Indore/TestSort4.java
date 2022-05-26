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
public class TestSort4 {  
  public static void main(String[] args) {  
      ArrayList<Student> al=new ArrayList<Student>();  
      al.add(new Student("Punam"));  
      al.add(new Student("Mona"));  
      al.add(new Student("Komal"));  
      al.add(new Student("Neha"));  
      
    Collections.sort(al);  
    for (Student s : al) {  
      System.out.println(s.name);  
    }  
  }  
}
//output:
 Komal
 Mona
 Neha
 Punam
