@FunctionalInterface//it is optional
interface Drawable{
public void draw();
}
public class LambdaExpressionEx1{
public static void main(String[] args){
int width=88;

//with lambda
Drawable d2=()->{
System.out.println("Drawing ="+width);
};
d2.draw();
}
}






/*
 output:
Drawing =88
*/