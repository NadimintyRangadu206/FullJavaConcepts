package com.java.finalkeyword;

class A1 {
	public void m1(final int f1) {

		System.out.println("Parent Class Method");
	}

}

class B1 extends A1 {

	public void m1(int f2) { // final methods Cont throws the ComplieTime Error
          m1(20);
		System.out.println("ChildClasss Method");
	}
}

public class FinalKeyword {

	final int no; // blank final variable or uninitialized final Variable, only declare in
					// Constructor

	public FinalKeyword() {

		no = 20;
	}

	static final int n; // static final blank or uninitialized final Variable ,only declare in static
						// block

	static {
		n = 30;
	}

	public static void main(String[] args) {

		B1 b = new B1();
		System.out.println();

	}

}
