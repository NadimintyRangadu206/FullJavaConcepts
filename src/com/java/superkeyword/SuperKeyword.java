package com.java.superkeyword;

class A1 {

	int no = 20;
	
	A1(){
		System.out.println("Parent Class Constructor!..");
	}

	void add() {
		System.out.println("Parent Class");
	}

}

class B1 extends A1 {

	int no = 10;

	B1() {
		System.out.println("Child Class Constructor");
		System.out.println(super.no);
	}

	void add() {

super.add();
		System.out.println("Child Classs");
	}
}

public class SuperKeyword {

	public static void main(String[] args) {

		B1 b = new B1();
		System.out.println(b.no);

//		A1 a = new A1();
//		System.out.println(a.no);
//
//		A1 a1 = (A1) new B1();
//		System.out.println(a1.no);

//		B1 b2= (B1) new A1(); // ClassCastException

		System.out.println(b.no);

		b.add();
		
		A1 a= new B1();
		a.add();
		System.out.println( a instanceof A1);
		
		B1 c= (B1)new A1(); // If the refference Variable of the Child class refers to the Object Of Parent Class.Is Know as DownCasting classCastException
		c.add();

	}

}
