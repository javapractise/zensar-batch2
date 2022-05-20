import java.util.*;  
public class SupperssWarningAnnotation {
	@SuppressWarnings("unchecked")  
	public static void main(String args[]){  
	ArrayList list=new ArrayList();  
	list.add("AMAN");  
	list.add("AJAY");  
	list.add("AMIT");  
	  
	for(Object obj:list)  
	System.out.println(obj);  
	  
	}
}

  
/*
Output:
	AMAN
	AJAY
	AMIT

*/