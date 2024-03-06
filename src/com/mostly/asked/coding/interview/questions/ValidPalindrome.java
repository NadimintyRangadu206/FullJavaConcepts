package com.mostly.asked.coding.interview.questions;


/**
 * 
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 

Constraints:

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.
 * @author nadim
 *
 */

public class ValidPalindrome {

	public static boolean isPalindrome(String s) {

		StringBuffer sb = new StringBuffer();

		String str = new String();

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {

				sb.append((char) (s.charAt(i) + 32));

			} else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				sb.append(s.charAt(i));
			}

		}

		str = sb.toString();
		System.out.println(str);

		StringBuffer sb2 = new StringBuffer();

		String reverse = new String();

		for (int i = str.length() - 1; i >= 0; i--) {

			sb2.append(str.charAt(i));
		}

		reverse = sb2.toString();
		System.out.println(reverse);

		if (str.equals(reverse)) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		String s = "A man, a plan, a canal: Panama";

		System.out.println(isPalindrome(s));

	}

}
