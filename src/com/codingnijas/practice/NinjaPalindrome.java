package com.codingnijas.practice;

public class NinjaPalindrome {

	public static boolean checkPalindrome(String str) {

		// WRITE YOUR CODE HERE

		StringBuilder removeSpecChar = new StringBuilder();

		String lCaseChar = str.toLowerCase();
		String temp = new String (); //c1odeedo1c

		for (int i =0; i <lCaseChar.length(); i++) {

			if ((lCaseChar.charAt(i) >= 'a' && lCaseChar.charAt(i) <= 'z')
					|| (lCaseChar.charAt(i) >= '0' && lCaseChar.charAt(i) <= '9')) {

				removeSpecChar.append(lCaseChar.charAt(i));

			}
		}
		temp= removeSpecChar.toString();
		String copy=removeSpecChar.toString();
		
		StringBuilder reverse = new StringBuilder();//c1odeedo1c
		
		for (int i = copy.length() - 1; i >= 0; i--) {

			if ((copy.charAt(i) >= 'a' && copy.charAt(i) <= 'z')
					|| (copy.charAt(i) >= '0' && copy.charAt(i) <= '9')) {

				reverse.append(copy.charAt(i));

			}
		}
		boolean flag = false;
		if (temp.equals(reverse.toString())) {
			flag = true;
		} else {
			flag = false;
		}

		return flag;
	}

	public static void main(String[] args) {
		
		NinjaPalindrome ninjaPalindrome= new NinjaPalindrome();
 
		String arr[] = { "c1 O$d@eeD o1c", "N2 i&nJA?a& jnI2n", "A1b22Ba", "codingninjassajNiNgNidoc", "5?36@6?35",
				"aaBBa@" };
		
		
		for(String s:arr) {
			
			System.out.println(NinjaPalindrome.checkPalindrome(s));
		}
		
		
	}

}
