package com.mostly.asked.coding.interview.questions;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

 

Example 1:

Input: s = "leetcode"
Output: 0
Example 2:

Input: s = "loveleetcode"
Output: 2
Example 3:

Input: s = "aabb"
Output: -1
 

Constraints:

1 <= s.length <= 105
s consists of only lowercase English letters.
 * @author nadim
 *
 */

public class FirstUniqueCharacterInAString {

	public static int firstUniqChar(String s) {

		char ch[] = s.toCharArray();

		Map<Character, Integer> map = new LinkedHashMap();

		for (int i = 0; i < ch.length; i++) {
			int count = 1;
			if (ch[i] != '-') {

				for (int j = i + 1; j < ch.length; j++) {

					if (ch[i] == ch[j]) {
						count++;
						ch[j] = '-';
					}
				}
				map.put(ch[i], count);
			}
		}

		char c = ' ';

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {

			if (entry.getValue() == 1) {

				c = entry.getKey();

				break;
			}
		}

		for (int i = 0; i < ch.length; i++) {

			if (ch[i] == c) {
				return i;
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		String s = "leetcode";
		System.out.println(firstUniqChar(s));
	}

}
