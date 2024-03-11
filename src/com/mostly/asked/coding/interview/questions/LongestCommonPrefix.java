package com.mostly.asked.coding.interview.questions;

import java.util.Arrays;


/**
 * Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.
 * @author nadim
 *
 */

public class LongestCommonPrefix {

	public static String longestCommonPrefix(String[] strs) {

		Arrays.sort(strs);

		char ch1[] = strs[0].toCharArray();

		char ch2[] = strs[strs.length - 1].toCharArray();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < ch1.length; i++) {

			if (ch1[i] != ch2[i]) {

				break;
			}
			sb.append(ch1[i]);

		}

		return sb.toString();
	}

	public static void main(String[] args) {

		
		String strs[]= {"flower","flow","flight"};
		
		System.out.println(longestCommonPrefix(strs));
	}

}
