package com.java.polymorphism;

class A1 {
	public void add(int i, int j) {

		int a = i + j;

		System.out.println("Parent Class Method!" + "-" + a);
	}
}

class B1 extends A1 {

	public void add(int i, int j, int r) {
		super.add(i, j);

		int b = i + j + r;
		System.out.println("SubClass Method!" + "-" + b);
	}

}

public class MethodOverriding {

	public static void main(String[] args) {

//	B1 b= (B1) new A1();// ClassCastException
//		b.add(2, 4, 5);

		A1 a1 = new A1();
		a1.add(12, 20);

		B1 a = new B1();
		a.add(1, 2, 3);
		
		float f=10/0;
		System.out.println(f);

	}

}
