package com.mostly.asked.coding.interview.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Example 2:

Input: strs = [""]
Output: [[""]]
Example 3:

Input: strs = ["a"]
Output: [["a"]]
 

Constraints:

1 <= strs.length <= 104
0 <= strs[i].length <= 100
strs[i] consists of lowercase English letters.
 * @author nadim
 *
 */
public class GroupAnagrams {

	public static List<List<String>> groupAnagrams(String[] strs) {

		List<List<String>> list = new ArrayList<List<String>>();

		for (int i = 0; i < strs.length; i++) {

			if (strs[i] != "0") {

				List<String> inside = new ArrayList<>();

				inside.add(strs[i]);

				char ch1[] = strs[i].toCharArray();

				Arrays.sort(ch1);

				StringBuilder sb1 = new StringBuilder();

				for (char c1 : ch1) {
					sb1.append(c1);
				}

				String s1 = sb1.toString();

				for (int j = i + 1; j < strs.length; j++) {

					char ch2[] = strs[j].toCharArray();

					Arrays.sort(ch2);

					StringBuilder sb2 = new StringBuilder();

					for (char c2 : ch2) {
						sb2.append(c2);
					}

					String s2 = sb2.toString();

					if (s2.equals(s1)) {

						inside.add(strs[j]);

						strs[j] = "0";
					}

				}
				list.add(inside);

			}
		}

		return list;
	}

	public static void main(String[] args) {

		String strs[] = { "eat", "tea", "tan", "ate", "nat", "bat" };

		System.out.println(groupAnagrams(strs));

	}

}
