package com.mostly.asked.coding.interview.questions;

import java.util.List;

public class SubstringWithConcatenationOfAllWords {
	
	
	
	public static void generatePermutations(String [] words ,int startIndex,int endIndex ) {
		
		if(startIndex==endIndex-1) {
			
			System.out.println(words[0]);
		}
		else {
			
			for(int i=startIndex;i<endIndex;i++) {
				
				words=swap(words,startIndex,i);
				generatePermutations(words, startIndex+1, endIndex);
				words=swap(words,startIndex,i);
				
				
			}
		}
		
		
	}

	public static String[] swap(String[] words, int startIndex, int i) {
	
		String str;
		
		str=words[startIndex];
		
		words[startIndex]=words[i];
		
		words[i]=str;
		
		
				
		return words;
	}

	public List<Integer> findSubstring(String s, String[] words) {

		return null;
	}

	public static void main(String[] args) {

		String words[] = { "foo", "bar" };

		
		generatePermutations(words, 0, words.length);
		
	}

}
