package com.mostly.asked.coding.interview.questions;

public class LongestSubstringWithoutRepeatingCharacters {

	public  static int lengthOfLongestSubstring(String s) {

		int maxLength = 0;

		for (int i = 0; i < s.length(); i++) {
			StringBuilder sb = new StringBuilder();

			for (int j = i; j < s.length(); j++) {

				if (sb.indexOf(String.valueOf(s.charAt(j))) != -1) {

					break;

				}
				sb.append(s.charAt(j));

				maxLength = Math.max(maxLength, sb.length());

			}
		}
		return maxLength;

	}

	public static void main(String[] args) {
		
		String s="abcabcab";
	
		System.out.println(lengthOfLongestSubstring(s));

	}

}
