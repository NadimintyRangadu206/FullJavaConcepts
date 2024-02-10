package com.general.purpose;

public class InterviewPurpose {

	public static void main(String[] args) {

		System.out.println("1");
		for (int i = 1; i <= 6; i++) {

			for (int k = 5; k >= i; k--) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("2");
		for (int i = 1; i < 6; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();

		}

		System.out.println("3");

		int k = 1;
		for (int i = 1; i < 5; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(k + " ");
				k++;
			}
			System.out.println();

		}

		System.out.println("4");
		for (int i = 1; i <= 5; i++) {

			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("5");

		int temp = 1;
		for (int i = 1; i <= 6; i++) {

			for (int r = 5; r >= i; r--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {

				if (j == 1 || j == i) {
					System.out.print(temp + " ");
				} else {
					System.out.print(j + " ");

//					temp = temp * (i - j + 1) / j;
//					System.out.print(temp);

				}
			}
			System.out.println();
		}

		System.out.println("6");

		for (int i = 1; i <= 6; i++) {

			for (int r = 1; r <= i; r++) {
				System.out.print(" ");
			}

			for (int j = 6; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("7");
		for (int i = 6; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println("8");

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {

				
				if (j == 1 || j == 10 || i == 1 || i == 10) {
					System.out.print("1");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		System.out.println("9");

		int c = 65;
		char ch = 'A';
		for (int i = 1; i <= 5; i++, ch++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(ch + " ");
//				System.out.print((char)c+" ");

			}
//			c++;
			System.out.println();
		}

		System.out.println("10");

		int rows = 9; // Number of rows in the pyramid

		for (int i = 0; i <= rows; i++) {
			// Spaces before the numbers
			for (int j = rows - i; j > 0; j--) {
				System.out.print(" ");
			}

			// Numbers in ascending order
			for (int j = 0; j <= i; j++) {
				System.out.print(j);
			}

			// Numbers in descending order
			for (int j = i - 1; j >= 0; j--) {
				System.out.print(j);
			}

			System.out.println(); // Move to the next line for the next row
		}

		
		for(int i=1;i<=4;i++) {
			int s=4;
			for(int j=1;j<=8;j++) {
				
				if(j==5) {
					System.out.print(j--);
				}else {
					
				}
				
			}
		}
	}

}
