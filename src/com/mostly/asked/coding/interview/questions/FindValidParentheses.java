package com.mostly.asked.coding.interview.questions;

import java.util.Stack;

/**
 * 
 * Valid Parentheses
Solved
Easy
Topics
Companies
Hint
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
 

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
 * @author nadim
 *
 */

public class FindValidParentheses {

	public static boolean isValid(String s) {

		char ch[] = s.toCharArray();

		Stack<Character> stack = new Stack<>();

		for (char c : ch) {

			switch (c) {
			case '(':
			case '{':
			case '[':
				stack.push(c);
				break;

			case ')':

				if (stack.isEmpty() || stack.pop() != '(') {
					return false;
				}
				break;

			case '}':

				if (stack.isEmpty() || stack.pop() != '{') {
					return false;
				}
				break;

			case ']':

				if (stack.isEmpty() || stack.pop() != '[') {
					return false;
				}
				break;

			}
		}
		return stack.empty();
	}

	public static void main(String[] args) {

		String s = "[()}";

		System.out.println(isValid(s));

	}

}
