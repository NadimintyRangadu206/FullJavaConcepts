package com.mostly.asked.coding.interview.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author nadim
 * 
 *         Given two strings s and t, determine if they are isomorphic.
 * 
 *         Two strings s and t are isomorphic if the characters in s can be
 *         replaced to get t.
 * 
 *         All occurrences of a character must be replaced with another
 *         character while preserving the order of characters. No two characters
 *         may map to the same character, but a character may map to itself.
 * 
 * 
 * 
 *         Example 1:
 * 
 *         Input: s = "egg", t = "add" Output: true Example 2:
 * 
 *         Input: s = "foo", t = "bar" Output: false Example 3:
 * 
 *         Input: s = "paper", t = "title" Output: true
 * 
 * 
 *         Constraints:
 * 
 *         1 <= s.length <= 5 * 104 t.length == s.length s and t consist of any
 *         valid ascii character.
 *
 */

public class IsomorphicString {

	public static boolean isIsomorphic(String s, String t) {

		if (s.length() != t.length()) {

			return false;
		}

		if (s.isEmpty() && t.isEmpty()) {
			return true;
		}

		int map1[] = new int[200];
		int map2[] = new int[200];

		if (s.length() != t.length())
			return false;

		for (int i = 0; i < s.length(); i++) {
			if (map1[s.charAt(i)] != map2[t.charAt(i)]) {
				return false;

			}

			map1[s.charAt(i)] = i + 1;
			map2[t.charAt(i)] = i + 1;
		}
		return true;

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

		System.out.println(isIsomorphic(s, t));

	}

}
