package com.codingnijas.practice;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NinjaValidParenthesis {

	public static boolean isValidParenthesis(String s) {
		// Write your code here.

		Pattern p = Pattern.compile("\\(|\\)|\\[|\\]|\\{|\\}");
		Matcher m = p.matcher(s);
		int count = 0;
		while (m.find()) {

			String str = m.group();

			if (str.equals("{") || str.equals("(") || str.equals("[")) {
				count++;
			} else if (str.equals("}") || str.equals(")") || str.equals("]")) {
				count--;
			}

			if (count < 0) {
				return false;
			}

		}

//		Stack<Character> stack = new Stack<>();
//
//		for (char c : s.toCharArray()) {
//			if (c == '(' || c == '[' || c == '{') {
//				stack.push(c);
//			} else if (c == ')' || c == ']' || c == '}') {
//				if (stack.isEmpty()) {
//					return false;
//				}
//
//				char top = stack.pop();
//
//				if (c == ')' && top != '(') {
//					return false;
//				} else if (c == ']' && top != '[') {
//					return false;
//				} else if (c == '}' && top != '{') {
//					return false;
//				}
//			}
//		}

//	return stack.isEmpty();

		return count == 0;
	}

	public static void main(String[] args) {

		System.out.println(NinjaValidParenthesis.isValidParenthesis("[()]{}{[()()]()}"));
	}
}
