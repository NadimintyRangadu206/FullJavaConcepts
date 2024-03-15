package com.mostly.asked.coding.interview.questions;

import java.util.Arrays;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
 

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
 * @author nadim
 *
 */

public class ValidAnagram {

	public static boolean isAnagram(String s, String t) {

		char ch1[] = s.toCharArray();

		Arrays.sort(ch1);

		String s1 = new String(ch1);

		char ch2[] = t.toCharArray();

		Arrays.sort(ch2);

		String s2 = new String(ch2);

		if (s2.equals(s1)) {

			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		String s = "rat";
		String t = "car";

		System.out.println(isAnagram(s, t));

	}

}
