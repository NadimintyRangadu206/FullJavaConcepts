package com.mostly.asked.coding.interview.questions;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Hard
Topics
Companies
Hint
You are given a 0-indexed array of unique strings words.

A palindrome pair is a pair of integers (i, j) such that:

0 <= i, j < words.length,
i != j, and
words[i] + words[j] (the concatenation of the two strings) is a 
palindrome
.
Return an array of all the palindrome pairs of words.

You must write an algorithm with O(sum of words[i].length) runtime complexity.

 

Example 1:

Input: words = ["abcd","dcba","lls","s","sssll"]
Output: [[0,1],[1,0],[3,2],[2,4]]
Explanation: The palindromes are ["abcddcba","dcbaabcd","slls","llssssll"]
Example 2:

Input: words = ["bat","tab","cat"]
Output: [[0,1],[1,0]]
Explanation: The palindromes are ["battab","tabbat"]
Example 3:

Input: words = ["a",""]
Output: [[0,1],[1,0]]
Explanation: The palindromes are ["a","a"]
 

Constraints:

1 <= words.length <= 5000
0 <= words[i].length <= 300
words[i] consists of lowercase English letters.
 * @author nadim
 *
 */

public class PalindromePairs {

	public static List<List<Integer>> palindromePairs(String[] words) {

		List<List<Integer>> list = new ArrayList<>();

		int i = 0;

		while (i < words.length) {

			String s1 = words[i];
			int j = 0;

			while (j < words.length) {
				List<Integer> inside = new ArrayList<>();

				if (i != j) {

					StringBuilder sb = new StringBuilder();
					sb.append(s1).append(words[j]);

					String s2 = sb.toString();

					StringBuilder sR = new StringBuilder();

					int k = s2.length() - 1;

					while (k >= 0) {

						sR.append(s2.charAt(k));
						k--;

					}
					String rev = sR.toString();

					if (s2.equals(rev)) {

						inside.add(i);
						inside.add(j);
						list.add(inside);
					}
				}
				j++;

			}
			i++;

		}

		return list;
	}

	public static void main(String[] args) {

		String words[] = { "abcd", "dcba", "lls", "s", "sssll" };

		System.out.println(palindromePairs(words));
	}

}
