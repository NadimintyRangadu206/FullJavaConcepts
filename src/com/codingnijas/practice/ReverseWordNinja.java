package com.codingnijas.practice;

import java.util.StringJoiner;

public class ReverseWordNinja {

	public static String reverseString(String str) {
		// Write your code here

		String arr[] = str.split(" ");

		StringJoiner s = new StringJoiner(" ");

		for (int i = arr.length - 1; i >= 0; i--) {
			s.add(arr[i]);
		}
		return s.toString();
	}

	public static void main(String[] args) {
             String str="I am a star";
            System.out.println( ReverseWordNinja.reverseString(str));
	}

}
