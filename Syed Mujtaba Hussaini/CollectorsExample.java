import java.util.stream.*;  
import java.util.List;  
import java.util.ArrayList;

class Product{  
    int id;  
    String name;  
    float price;  
      
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}

public class Collectors {  
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        List<Float> productPriceList =   
                productsList.stream()  
                            .map(x -> x.price)         // fetching price  
                            .toList();
        long totalPrices =   
                productsList.stream()  
                            .count();
        					// collecting as list  
        System.out.println(productPriceList);  
        System.out.println(totalPrices);
    }

}  

/**
[25000.0, 30000.0, 28000.0, 28000.0, 90000.0]
5
**/