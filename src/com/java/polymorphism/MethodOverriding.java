package com.java.polymorphism;

class A1 {
	public void add(int i, int j) {

		System.out.println("Parent Class Method!");
	}
}

class B1 extends A1 {

	public void add(int i, int j) {
		super.add(i, j);
		System.out.println("SubClass Method!");
	}

}

public class MethodOverriding {

	public static void main(String[] args) {

//		B1 b= (B1) new A1(); ClassCastException
		A1 a = new B1();
//		b.add(1, 2);
		a.add(1, 2);

	}

}
