class Animal{
    void
eatsomething(){system.out.println("eating something");}
}
class Dog extends animal{
    @Override
    void
    eatssomething(){system.out.println("eating foods");}//should be something
}

class TestAnnotation1{
public static void main(String args[]){
    Animal a = new Dog();
    a.eatSomething();
}}   
