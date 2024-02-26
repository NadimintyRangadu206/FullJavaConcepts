package com.mostly.asked.coding.interview.questions;

import java.util.Stack;

/**
 * 
 * @author nadim
 * 
 *         You are given an array of strings tokens that represents an
 *         arithmetic expression in a Reverse Polish Notation.
 * 
 *         Evaluate the expression. Return an integer that represents the value
 *         of the expression.
 * 
 *         Note that:
 * 
 *         The valid operators are '+', '-', '*', and '/'. Each operand may be
 *         an integer or another expression. The division between two integers
 *         always truncates toward zero. There will not be any division by zero.
 *         The input represents a valid arithmetic expression in a reverse
 *         polish notation. The answer and all the intermediate calculations can
 *         be represented in a 32-bit integer.
 * 
 * 
 *         Example 1:
 * 
 *         Input: tokens = ["2","1","+","3","*"] Output: 9 Explanation: ((2 + 1)
 *         * 3) = 9 Example 2:
 * 
 *         Input: tokens = ["4","13","5","/","+"] Output: 6 Explanation: (4 +
 *         (13 / 5)) = 6 Example 3:
 * 
 *         Input: tokens =
 *         ["10","6","9","3","+","-11","*","/","*","17","+","5","+"] Output: 22
 *         Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5 = ((10 * (6 /
 *         (12 * -11))) + 17) + 5 = ((10 * (6 / -132)) + 17) + 5 = ((10 * 0) +
 *         17) + 5 = (0 + 17) + 5 = 17 + 5 = 22
 * 
 * 
 *         Constraints:
 * 
 *         1 <= tokens.length <= 104 tokens[i] is either an operator: "+", "-",
 *         "*", or "/", or an integer in the range [-200, 200].
 *
 */

public class EvaluateReversePolishNotation {

	static int evalRPN(String[] tokens) {

		String operators = "+-*/";

		Stack<String> stack = new Stack<>();

		for (String t : tokens) {

			if (!operators.contains(t)) {
				stack.push(t);

			} else {

				int a = Integer.parseInt(stack.pop());
				int b = Integer.parseInt(stack.pop());

				switch (t) {

				case "+":

					stack.push(String.valueOf(a + b));
					break;

				case "-":
					stack.push(String.valueOf(b - a));
					break;
				case "*":
					stack.push(String.valueOf(a * b));
					break;
				case "/":

					try {

						stack.push(String.valueOf(b / a));
						break;
					} catch (Exception e) {
						stack.push("0");
					}
				}

			}

		}
		int finalValue = Integer.parseInt(stack.pop());

		return finalValue;

	}

	public static void main(String[] args) {

		String arr[] = { "-78", "-33", "196", "+", "-19", "-", "115", "+", "-", "-99", "/", "-18", "8", "*", "-86", "-",
				"-", "16", "/", "26", "-14", "-", "-", "47", "-", "101", "-", "163", "*", "143", "-", "0", "-", "171",
				"+", "120", "*", "-60", "+", "156", "/", "173", "/", "-24", "11", "+", "21", "/", "*", "44", "*", "180",
				"70", "-40", "-", "*", "86", "132", "-84", "+", "*", "-", "38", "/", "/", "21", "28", "/", "+", "83",
				"/", "-31", "156", "-", "+", "28", "/", "95", "-", "120", "+", "8", "*", "90", "-", "-94", "*", "-73",
				"/", "-62", "/", "93", "*", "196", "-", "-59", "+", "187", "-", "143", "/", "-79", "-89", "+", "-" };

		int a = 30;
		int b = 20;

		int max = a > b ? a : b;
		int min = a < b ? a : b;
		System.out.println(max);
		System.out.println(min);

		System.out.println(evalRPN(arr));

	}

}
