package Saichand_day14;
import java.util.*;
import java.util.stream.Collectors;
class product{
int id;
String name;
float price;
public product(int id,String name,float price){
this.id= id;
this.name=name;
this.price=price;
}
}
   
public class javaStream {
	public static void main(String[] args){
	     ArrayList <product> productList= new ArrayList <product>();//Adding products
	  productList.add(new product(1,"HP Laptop",25000f));
	  productList.add(new product(2,"Dell Laptop",30000f));
	  productList.add(new product(3,"Lenevo Laptop",28000f));
	  productList.add(new product(4,"Sony Laptop",280000f));
	  productList.add(new product(5,"Apple Laptop",900000f));
	  List<Float>productpriceList2=productList.stream()
		.filter(p->p.price>30000)//Filtering data
		.map(p->p.price)//fetching price
		.collect(Collectors.toList());//collecting as list
	   System.out.println(productpriceList2);
	}
}

/* output:
 [280000.0, 900000.0] 
 */
