package com.mostly.asked.coding.interview.questions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author nadim
 *
 *
 *Given an input string (s) and a pattern (p), implement wildcard pattern matching with support for '?' and '*' where:

'?' Matches any single character.
'*' Matches any sequence of characters (including the empty sequence).
The matching should cover the entire input string (not partial).

 

Example 1:

Input: s = "aa", p = "a"
Output: false
Explanation: "a" does not match the entire string "aa".
Example 2:

Input: s = "aa", p = "*"
Output: true
Explanation: '*' matches any sequence.
Example 3:

Input: s = "cb", p = "?a"
Output: false
Explanation: '?' matches 'c', but the second letter is 'a', which does not match 'b'.
 

Constraints:

0 <= s.length, p.length <= 2000
s contains only lowercase English letters.
p contains only lowercase English letters, '?' or '*'.
 */

public class FindWildCardMatching {

	public static void main(String[] args) {
		
		String s="acc";
		
		String p1="";
		
		Pattern p=Pattern.compile(".?.*");

				Matcher m=p.matcher(s);
		
		if(m.matches()) {
			System.out.println("Matching");
		}else {
			System.out.println("not");
		}
	}

}
