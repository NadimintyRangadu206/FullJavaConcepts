package com.mostly.asked.coding.interview.questions;

public class EditDistance {

	public static int minDistance(String word1, String word2) {

		int count = 0;

		StringBuilder sb1 = new StringBuilder();
		sb1.append(word1);

		StringBuilder sb2 = new StringBuilder();
		sb2.append(word2);
		
		
		  
          
		return count;

	}

	public static void main(String[] args) {

		String word1 = "horse";

		String word2 = "ros";

		System.out.println(minDistance(word1, word2));

	}

}
