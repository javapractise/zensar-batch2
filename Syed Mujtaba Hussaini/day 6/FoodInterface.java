interface Drinks{
    void bestDrink();
}

interface Food{
    void bestFood();
}

class CafeDay implements Drinks, Food{
    
    int quantity;
    String flavour;
    
    CafeDay(String flavour, int quantity){
        this.quantity = quantity;
        this.flavour = flavour;
    }
    
    public void bestDrink(){
        System.out.println("The best drink is " + flavour);
    }
    
    public void bestFood(){
        System.out.println("The best food is samosa and the quantity consumed is " + quantity);
    }
}

class Main{
    public static void main(String[] args){
            
        CafeDay df = new CafeDay("Espresso", 3);
        df.bestDrink();
        df.bestFood();

    }
}