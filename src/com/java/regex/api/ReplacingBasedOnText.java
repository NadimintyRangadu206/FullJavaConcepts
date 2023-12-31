package com.java.regex.api;

public class ReplacingBasedOnText {

	public static void main(String[] args) {
		
		String str="The color of the sky is blue.";
		
		String replacedText=str.replaceAll("blue", "green");
		System.out.println(replacedText);

	}

}
