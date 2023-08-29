package com.java.string;


class Animal{
	
	int count=10;
}
class Dog extends Animal{
	
	String name="Lucky";
}

public class CompareToMethod {

	public static void main(String[] args) {
		
		Animal a= new Dog();
		System.out.println(a.count+"-");
		
		Dog d= (Dog) new Animal();

		System.out.println(d.name+"-");
	}

}
