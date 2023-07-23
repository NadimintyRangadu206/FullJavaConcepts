package com.java.basic.programs;

public class Pattern1 {

	public static void main(String[] args) {

		for (int i = 1, p = 'A'; i <= 8; i++, p++) {

			for (int k = 7; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {

				System.out.print((char) p + " ");
			}
			System.out.println();
		}

		String s="RANGA";
		
		for (int i = 1; i <= 8; i++) {

			for (int k = 2; k <= i; k++) {
				System.out.print(" ");
			}
			for (int j = 8, p=0; j >= i; j--,p++) {

				System.out.print(s.charAt(p)+ " ");
			}
			System.out.println();
		}

	}

}
