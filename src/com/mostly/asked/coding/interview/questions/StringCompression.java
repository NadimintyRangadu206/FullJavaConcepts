package com.mostly.asked.coding.interview.questions;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Given an array of characters chars, compress it using the following algorithm:

Begin with an empty string s. For each group of consecutive repeating characters in chars:

If the group's length is 1, append the character to s.
Otherwise, append the character followed by the group's length.
The compressed string s should not be returned separately, but instead, be stored in the input character array chars. Note that group lengths that are 10 or longer will be split into multiple characters in chars.

After you are done modifying the input array, return the new length of the array.

You must write an algorithm that uses only constant extra space.

 

Example 1:

Input: chars = ["a","a","b","b","c","c","c"]
Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
Example 2:

Input: chars = ["a"]
Output: Return 1, and the first character of the input array should be: ["a"]
Explanation: The only group is "a", which remains uncompressed since it's a single character.
Example 3:

Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
Output: Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
Explanation: The groups are "a" and "bbbbbbbbbbbb". This compresses to "ab12".
 

Constraints:

1 <= chars.length <= 2000
chars[i] is a lowercase English letter, uppercase English letter, digit, or symbol.
 * @author nadim
 *
 */

public class StringCompression {

	public static int compress(char[] chars) {

		if (chars.length <= 1) {
			return 1;
		}

		List<Integer> no = new ArrayList<>();

		List<Character> ch = new ArrayList<>();

		for (int i = 0; i < chars.length; i++) {
			int count = 1;
			if (chars[i] != '!') {
				for (int j = i + 1; j < chars.length; j++) {

					if (chars[i] == chars[j]) {

						count++;
						chars[j] = '!';
					} else {
						break;
					}
				}

				no.add(count);
				ch.add(chars[i]);

			}

		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < no.size(); i++) {

			sb.append(ch.get(i));
			if (no.get(i) > 1)
				sb.append(no.get(i));

		}

		String str = sb.toString();

		for (int i = 0; i < str.length(); i++) {

			chars[i] = str.charAt(i);
		}

		return str.length();
	}

	public static void main(String[] args) {

		char chars[] = {'a'};

		System.out.println(compress(chars));
	}

}
