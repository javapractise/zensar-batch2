interface sayable{  
    void say(String msg);   // abstract method  
}  
@FunctionalInterface  
interface Doable extends sayable{  
    // Invalid '@FunctionalInterface' annotation; Doable is not a functional interface  
    void doIt();  
}  

/*Compile Time Error*/