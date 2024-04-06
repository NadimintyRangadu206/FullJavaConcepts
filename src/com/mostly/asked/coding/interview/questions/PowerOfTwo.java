package com.mostly.asked.coding.interview.questions;

/**
 * Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two, if there exists an integer x such that n == 2x.

 

Example 1:

Input: n = 1
Output: true
Explanation: 20 = 1
Example 2:

Input: n = 16
Output: true
Explanation: 24 = 16
Example 3:

Input: n = 3
Output: false
 

Constraints:

-231 <= n <= 231 - 1
 

Follow up: Could you solve it without loops/recursion?
 * @author nadim
 *
 */
public class PowerOfTwo {

	public static boolean isPowerOfTwo(int n) {

		if (n == 1) {
			return true;
		}

		if (n < 1) {
			return false;
		}

		while (n > 1) {

			if (n % 2 != 0) {
				return false;
			}
			n = n / 2;
		}
		return true;
	}

//		int sqrtNo = (int) Math.sqrt(n);
//
//		int no = (int) Math.pow(2, sqrtNo);
//
//		System.out.println(no);
//
//		if (n == (int) Math.pow(2, sqrtNo)) {
//			return true;
//		} else {
//			return false;
//		}

	public static void main(String[] args) {

		int n = 3;

		System.out.println(isPowerOfTwo(n));

	}

}
