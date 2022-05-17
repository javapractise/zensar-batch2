package Topic;



	 class Rat extends Animals1{
		 void kich() {
			 System.out.println("kiching");
		 }
	 }
	 class Cat extends Animals1{
		 void meow() {
			 System.out.println("meowing");
		 }
	 

	public static void main(String[] args) {
		Cat c= new Cat();
		c.meow();
		c.eat();
		//c.kich();

	}

}


