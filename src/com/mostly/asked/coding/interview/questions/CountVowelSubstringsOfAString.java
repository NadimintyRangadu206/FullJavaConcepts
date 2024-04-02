package com.mostly.asked.coding.interview.questions;

import java.util.HashSet;
import java.util.Set;


/**
 * A substring is a contiguous (non-empty) sequence of characters within a string.

A vowel substring is a substring that only consists of vowels ('a', 'e', 'i', 'o', and 'u') and has all five vowels present in it.

Given a string word, return the number of vowel substrings in word.

 

Example 1:

Input: word = "aeiouu"
Output: 2
Explanation: The vowel substrings of word are as follows (underlined):
- "aeiouu"
- "aeiouu"
Example 2:

Input: word = "unicornarihan"
Output: 0
Explanation: Not all 5 vowels are present, so there are no vowel substrings.
Example 3:

Input: word = "cuaieuouac"
Output: 7
Explanation: The vowel substrings of word are as follows (underlined):
- "cuaieuouac"
- "cuaieuouac"
- "cuaieuouac"
- "cuaieuouac"
- "cuaieuouac"
- "cuaieuouac"
- "cuaieuouac"
 

Constraints:

1 <= word.length <= 100
word consists of lowercase English letters only.
 * @author nadim
 *
 */

public class CountVowelSubstringsOfAString {

	public static int countVowelSubstrings(String word) {

		int sum = 0;

		String vowels = "aeiou";

		for (int i = 0; i < word.length(); i++) {

			Set<Character> set = new HashSet<Character>();

			for (int j = i; j < word.length(); j++) {
				char c = word.charAt(j);

				if (vowels.indexOf(c) != -1) {
					set.add(c);
					if (set.size() == 5) {
						sum++;
					}

				}

				else {
					break;
				}

			}
		}

		return sum;
	}

	public static void main(String[] args) {

		String word = "aeiouu";
		System.out.println(countVowelSubstrings(word));

	}

}
