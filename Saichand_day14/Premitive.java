package Saichand_day14;


	interface sayable{
		//default method(){
		System.out.println("Hello ,this is default method");
		}
		//abstract method
		void saymmore(String msg);
		//static method
		static void  sayLouder(String msg){
		System.out.println(msg);
		}
		}
		public abstract class Premitive implements sayable{
		public void saymore(String msg){    //implementing abstract method
		System.out.println(msg);
		}

		public static void main(String[] args){
		Premitive dm = new Premitive();
		dm.sayable();       //calling Default method
		dm.saymmore("work is worship")		//calling abstract method
		sayable.sayLouder("Hellooooo....") 	//calling static method


}
