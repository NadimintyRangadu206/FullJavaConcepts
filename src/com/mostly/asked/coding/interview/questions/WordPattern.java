package com.mostly.asked.coding.interview.questions;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

 

Example 1:

Input: pattern = "abba", s = "dog cat cat dog"
Output: true
Example 2:

Input: pattern = "abba", s = "dog cat cat fish"
Output: false
Example 3:

Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false
 

Constraints:

1 <= pattern.length <= 300
pattern contains only lower-case English letters.
1 <= s.length <= 3000
s contains only lowercase English letters and spaces ' '.
s does not contain any leading or trailing spaces.
All the words in s are separated by a single space.
 * @author nadim
 *
 */

public class WordPattern {

	public static boolean wordPattern(String pattern, String s) {

		char ch[] = pattern.toCharArray();

		String[] str = s.split(" ");

		if (ch.length != str.length) {
			return false;
		}

		Map<Character, String> map = new HashMap<>();

		for (int i = 0; i < str.length; i++) {

			if (map.containsKey(ch[i])) {

				if (!map.get(ch[i]).equals(str[i])) {
					return false;

				}
			} else {

				if (map.containsValue(str[i])) {
					return false;
				}

				map.put(ch[i], str[i]);

			}

		}

		return true;

	}

	public static void main(String[] args) {

		String pattern = "abba";

		String s = "dog cat cat dog";

		System.out.println(wordPattern(pattern, s));
	}

}
