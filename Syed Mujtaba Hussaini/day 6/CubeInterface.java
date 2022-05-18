interface Drawable{  
    void draw();  
    static int cube(int x){return x*x*x;}  
}

class Rectangle implements Drawable{  
    public void draw(){
        System.out.println("drawing rectangle");
    }  
}

class Main{
    public static void main(String[] args){
            
        Rectangle r = new Rectangle();
        r.draw();
        System.out.println(Drawable.cube(12));

    }
}