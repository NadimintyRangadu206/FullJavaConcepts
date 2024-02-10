package com.java.test.book.programs;

interface A1 {

	void show();
}

//class F implements A1 {
//
//	@Override
//	public void show() {
//
//		System.out.println("Show () Method");
//
//	}

//}

public class JavaLambdaExpressions {

	public static void main(String[] args) {

		A1 a = () -> {
			System.out.println("Show Method is Display");
		};

		a.show();

//		A1 a = new F();
//		
//		F f = new F();
//		f.show();
//
//		a.show();

	}

}
