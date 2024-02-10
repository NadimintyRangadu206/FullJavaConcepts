package com.java.test.book.programs;

import java.util.function.BiFunction;
import java.util.function.Function;

interface Method {

	void sayable();
}

class StaticMethodRefference {

	public static void add() {
		System.out.println("Static Method Refference");
	}

}

class Addition {

	public static int addi(int a, int b) {
		return a + b;

	}
}

public class JavaMethodReference {

	public static void main(String[] args) {

		Method m = StaticMethodRefference::add;

		m.sayable();

		BiFunction<Integer, Integer, Integer> fi = Addition::addi;
		System.out.println(fi.apply(10, 10));

	}

}
