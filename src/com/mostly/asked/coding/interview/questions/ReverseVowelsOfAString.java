package com.mostly.asked.coding.interview.questions;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

 

Example 1:

Input: s = "hello"
Output: "holle"
Example 2:

Input: s = "leetcode"
Output: "leotcede"
 

Constraints:
 * @author nadim
 *
 */

public class ReverseVowelsOfAString {

	public static String reverseVowels(String s) {

		char ch[] = s.toCharArray();

		List<Character> list = new ArrayList<>();

		for (int i = 0; i < ch.length; i++) {

			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A'
					|| ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
				list.add(ch[i]);
			}

		}
		int end = list.size() - 1;
		for (int i = 0; i < ch.length; i++) {

			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A'
					|| ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {

				ch[i] = list.get(end);
				end--;
			}

		}

		return new String(ch);

	}

	public static void main(String[] args) {

		String s = "hello";

		System.out.println(reverseVowels(s));

	}

}
