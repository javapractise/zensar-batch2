interface Drawable{  
    public void draw();  
}  
  
public class LambdaExpressionexample1 {  
    public static void main(String[] args) {  
        int width=20;  
          
        //with lambda  
        Drawable d2=()->{  
            System.out.println("Drawing "+width);  
        };  
        d2.draw();  
    }  
} 
//Output: Drawing 20