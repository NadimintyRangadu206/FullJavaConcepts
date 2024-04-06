package com.mostly.asked.coding.interview.questions;

public class MaximumNestingDepthOfTheParentheses {

	public static int maxDepth(String s) {

		int max = 0;

		int countOpen = 0;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '(') {
				countOpen++;
			} else if (s.charAt(i) == ')') {
				countOpen--;
			}
			max = Math.max(max, countOpen);

		}

		return max;
	}

	public static void main(String[] args) {

		String s = "(1+(2*3)+((8)/4))+1";

		System.out.println(maxDepth(s));

	}

}
