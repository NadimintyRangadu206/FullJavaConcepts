package com.mostly.asked.coding.interview.questions;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author nadim
 * 
 * Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

 

Example 1:

Input: s = "egg", t = "add"
Output: true
Example 2:

Input: s = "foo", t = "bar"
Output: false
Example 3:

Input: s = "paper", t = "title"
Output: true
 

Constraints:

1 <= s.length <= 5 * 104
t.length == s.length
s and t consist of any valid ascii character.
 *
 */

public class IsomorphicString {

	static boolean isomorphic(String s, String t) {

		if (s.length() != t.length()) {
			return false;
		}

		if (s.length() == 0 && t.length() == 0) {
			return true;
		}

		HashMap<Character, Character> map = new HashMap<Character, Character>();

		for (int i = 0; i < s.length(); i++) {

			char c1 = s.charAt(i);
			char c2 = t.charAt(i);

			Character ch = getKey(map, c2);

			if (ch != null && ch != c1) {
				return false;
			} else if (map.containsKey(c1)) {
				if (c2 != map.get(c1)) {
					return false;
				} else {
					map.put(c1, c2);
				}
			}
		}
		return true;

	}

	public static Character getKey(HashMap<Character, Character> map, Character target) {

		for (Map.Entry entry : map.entrySet()) {

			if (entry.getValue().equals(target)) {
				return (Character) entry.getKey();
			}
		}

		return null;
	}

	public static void main(String[] args) {

		String s = "foo";
		String t = "bar";

		if (s.length() != t.length() || s == null || t == null) {
			System.out.println("Not Isomorphic");
		}

		HashMap<Character, Character> map = new HashMap<>();

		boolean flag = false;
		for (int i = 0; i < s.length(); i++) {

			if (map.containsKey(s.charAt(i)) && map.containsValue(t.charAt(i))) {
				map.put(s.charAt(i), t.charAt(i));
				flag = true;

			} else {
				map.put(s.charAt(i), t.charAt(i));
			}

		}

		if (flag == true) {
			System.out.println("Isomorphic");
		} else {
			System.out.println("Not Isomorphic");
		}

		System.out.println(isomorphic(s, t));

	}

}
