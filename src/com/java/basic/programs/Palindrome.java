package com.java.basic.programs;

public class Palindrome {

	public static void main(String[] args) {

		int no = 454;
		int rev = 0;
		int r = 0;
		int temp = no;

		while (no != 0) {

			r = no % 10;
			rev = (rev * 10) + r;
			no = no / 10;

		}

		if (temp == rev) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
		
		
		
		String s="Amma";
		
		StringBuilder sb= new StringBuilder();
		
		
		String t=s;
		
		for(int i=s.length()-1;i>=0;i--) {
			
			sb.append(s.charAt(i));
			
			
		}
		
		if(t.equalsIgnoreCase(sb.toString())) {
			
			System.out.println("Palindrome");
		}else {
			System.out.println("No Palindrome");
		}
	}

}
