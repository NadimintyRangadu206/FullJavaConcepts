package com.mostly.asked.coding.interview.questions;

import java.util.HashSet;
import java.util.Set;

public class UniqueLength_3_PalindromicSubsequences {

	public static int countPalindromicSubsequence(String s) {

		Set<String> set = new HashSet<String>();

		char ch[] = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			StringBuilder sb = new StringBuilder();
			sb.append(ch[i]);

			for (int j = i + 1; j < ch.length; j++) {
				sb.append(ch[j]);
				for (int k = j + 1; k < ch.length; k++) {

					sb.append(ch[k]);

					String str = sb.toString();
					StringBuilder sr = new StringBuilder();

					for (int r = str.length() - 1; r >= 0; r--) {

						sr.append(str.charAt(r));
					}

					String rev = sr.toString();

					if (str.equals(rev)) {
						set.add(rev);
					}
					sb.delete(2, 3);

				}
				sb.delete(1, 2);

			}
		}
		return set.size();
	}

	public static void main(String[] args) {
		String s = "";

		System.out.println(countPalindromicSubsequence(s));
	}
}
