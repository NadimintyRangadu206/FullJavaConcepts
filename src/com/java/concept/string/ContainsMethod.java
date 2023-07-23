package com.java.concept.string;

public class ContainsMethod {

	public static void main(String[] args) {

		String s = "what do you know about me";

		boolean flag = false;

		String[] arr = s.split(" ");

		for (String s1 : arr) {

			if (s1.contains("you")) {

				flag = true;

			}
		}
		System.out.println(flag);
		
		
		String s4="Sachinee";
		
		int  i=s4.indexOf('e');
		System.out.println(i);

	}

}
