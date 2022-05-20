import java.util.Scanner;
import java.lang.annotation.*;  
import java.lang.reflect.*;

public class Main {

	static class Vehicle{
		void drive() {
			System.out.println("Im driving a vehicle");
		}
	}
	
	static class Car extends Vehicle{
		
		@Override
		void drive() {
			System.out.println("Im driving a Car");
		}
		
		@Deprecated
		// Use only if it is required
		void skid() {
			System.out.println("Dont drift");
		}
	}
	
	//Single value
	@interface Syed{
		int age();
	}
	
	//Multi value
	@Retention(RetentionPolicy.RUNTIME)  
	@Target(ElementType.METHOD)
	@interface Cities{
		String c_one() default "Bengaluru";
		String c_two() default "Delhi";
	}
	
	@Retention(RetentionPolicy.RUNTIME)  
	@Target(ElementType.METHOD)  
	@interface Test{  
		int value();  
	}
	
	static class Greet{  
		@Test(value=10)
		@Cities
		public void sayHello(){
			System.out.println("Hello java");
			}  
		} 
	
	@SuppressWarnings("unchecked")  
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		
		Car c = new Car();
		c.drive();
		c.skid();
		
		Greet g = new Greet();
		Method m = g.getClass().getMethod("sayHello");
		
		Test t = m.getAnnotation(Test.class);
		Cities cy = m.getAnnotation(Cities.class);
		System.out.println("The value of Test annotaion is " +t.value());
		System.out.println("The value of cities annotation is " + 
		cy.c_one()+ " and " + cy.c_two());
	}

}

/**
Output 

Im driving a Car
Dont drift
The value of Test annotaion is 10
The value of cities annotation is Bengaluru and Delhi
**/