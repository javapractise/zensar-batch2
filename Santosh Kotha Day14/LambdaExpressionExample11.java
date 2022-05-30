package Day14;

import java.util.ArrayList;

import java.util.List; 

importjava.util.stream.Stream;

class Product{  
    int id;  
	String name;
	float price;
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		
	}
}
public class LambdaExpressionExample11 {
	public static void main(String[] args) {
		List<Product>list=new ArrayList<Product>();
		
		 list.add(new Product(1,"Samsung F22",17000f));  
	        list.add(new Product(3,"Iphone 13 Pro",130000f));  
	        list.add(new Product(2,"Sony Xperia",25000f));  
	        list.add(new Product(4,"Nokia Lumia",15000f));  
	        list.add(new Product(5,"OnePlus Nord",26000f));  
	        list.add(new Product(6,"Redmi 10T",19000f));  
	     
	     // using lambda to filter data  
	        Stream<Product> filtered_data = list.stream().filter(p -> p.price > 20000);  
	          
	        // using lambda to iterate through collection  
	        filtered_data.forEach(  
	                product -> System.out.println(product.name+": "+product.price)  
	        );  
	}
}
