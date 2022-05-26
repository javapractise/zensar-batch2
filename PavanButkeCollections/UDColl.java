package May26;
import java.util.*;  
	  
	class Employee implements Comparable<Employee> {  
	    public String name;  
	  public Employee(String name) {  
	    this.name = name;  
	  }  
	  public int compareTo(Employee person) {  
	    return name.compareTo(person.name);  
	      
	  }   
	}  
	public class UDColl {
	  public static void main(String[] args) {  
	      ArrayList<Employee> ListOfEmp=new ArrayList<Employee>();  
	      ListOfEmp.add(new Employee("Vani"));  
	      ListOfEmp.add(new Employee("Neeha"));  
	      ListOfEmp.add(new Employee("Jayashree"));  
	      ListOfEmp.add(new Employee("Anushka"));  
	      
	    Collections.sort(ListOfEmp);  
	    for (Employee s : ListOfEmp) {  
	      System.out.println(s.name);  
	    }  
	  }  
	}  


/*o/p-->
Anushka
Jayashree
Neeha
Vani
*/