interface Shop{
    void showItems();
}

class Kirana implements Shop{
    
    int price;
    String name;
    
    Kirana(String name, int price){
        this.name = name;
        this.price = price;
    }
    
    public void showItems(){
        System.out.println("The name of the product is " + name);
        System.out.println("The price is " + price);
    }
    
}

class Main{
    public static void main(String[] args){
    
        Kirana d = new Kirana("Dal", 200);
        Kirana r = new Kirana("Rice", 500);
        d.showItems();
        r.showItems();
    }
}