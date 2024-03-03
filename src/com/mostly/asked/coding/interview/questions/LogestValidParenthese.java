package com.mostly.asked.coding.interview.questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LogestValidParenthese {
	public static int longestValidParentheses(String s) {

		char[] ch = s.toCharArray();

		Stack<Character> sk = new Stack<>();
		List<Character> list = new ArrayList<>();

		for (char c : ch) {

			switch (c) {

			case '(':
				sk.push(c);
				break;

			case ')':

				if(sk.isEmpty()) {
					continue;
				}
				 else if(sk.pop() == '(') {
					list.add('(');
					list.add(')');
				}
				break;

			}
		}

		return list.size();
	}

	public static void main(String[] args) {

		String s = "()(()";

		System.out.println(longestValidParentheses(s));

	}

}
