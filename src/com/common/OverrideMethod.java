package com.common;

class Test3 {

	public void method1() {
		System.out.println("Method1");
	}
}

class Test2 extends Test3 {

	@Override
	public void method1() {

		System.out.println("Method2");
		super.method1();

	}

}

class Test4 extends Test3 {

	@Override
	public void method1() {
		System.out.println("Method3");
	}
}

public class OverrideMethod {

	public static void main(String[] args) {

		Test2 t = new Test2();
		t.method1();
		Test4 t1 = new Test4();
		t1.method1();

	}

}
