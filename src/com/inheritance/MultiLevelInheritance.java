package com.inheritance;

class Animals {

	public void eat() {
		System.out.println("Eating......");
	}
}

class Dogs extends Animals {
	public void brak() {
		System.out.println("Dog is Braking.....");
	}
}

class Cats extends Animals {
	public void meow() {
		System.out.println("Cat is sounds the Meow....");
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		
		Cats c= new Cats();
		c.eat();
		c.meow();
//		c.brak();
		
		Animals a= new Cats();
		a.eat();
        

	}

}
