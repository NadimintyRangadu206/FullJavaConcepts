package com.mostly.asked.coding.interview.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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
	
	public static List<List<String>> groupAnagram(String[] strs) { // google approach

		Map<String, List<String>> map = new HashMap<>();

		for (String word : strs) {

			char ch[] = word.toCharArray();

			Arrays.sort(ch);

			String srtString = new String(ch);

			if (!map.containsKey(srtString)) {
				map.put(srtString, new ArrayList<>());
			}

			List<String> copy = map.get(srtString);
			copy.add(word);
		}

		return new ArrayList<>(map.values());
	}

	public static List<List<String>> groupAnagrams(String[] strs) { // this is my approach 

		List<List<String>> list = new ArrayList<List<String>>();

		for (int i = 0; i < strs.length; i++) {

			if (strs[i] != "0") {

				List<String> inside = new ArrayList<>();

				inside.add(strs[i]);

				char ch1[] = strs[i].toCharArray();

				Arrays.sort(ch1);

				String s1 = new String(ch1);

				for (int j = i + 1; j < strs.length; j++) {

					char ch2[] = strs[j].toCharArray();

					Arrays.sort(ch2);

					String s2 = new String(ch2);

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
		
		System.out.println(groupAnagram(strs));

		System.out.println(groupAnagrams(strs));

	}

}
