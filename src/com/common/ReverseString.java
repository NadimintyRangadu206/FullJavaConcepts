package com.common;

public class ReverseString {

	public void reverse(String s) {

		for (int i = s.length() - 1; i >= 0; i--) {

			System.out.print(s.charAt(i));
		}

	}

	public static void main(String[] args) {

		ReverseString d = new ReverseString();

		d.reverse("Raju");
		System.out.println();
		String str = "Ranga";

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

		System.out.println();

		StringBuilder sb = new StringBuilder();

		sb.append(str);

		System.out.println(sb.reverse());

	}

}
