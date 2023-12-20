package com.stream.io.concepts;

import java.io.Console;

public class ConsoleEx1 {

	public static void main(String[] args) {

		Console c = System.console();
		System.out.println("Enter a String here");
		String str = c.readLine("nfjehreyrteyqtreqgy");

		System.out.println();
		System.out.println(str);
		System.out.println("System.out.println");
	}

}
