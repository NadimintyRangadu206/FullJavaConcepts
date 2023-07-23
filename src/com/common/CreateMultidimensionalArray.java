package com.common;

public class CreateMultidimensionalArray {

	public static void main(String[] args) {

		int arr[][] = new int[3][3];

		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;

		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;

		arr[2][0] = 70;
		arr[2][1] = 80;
		arr[2][2] = 90;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int arr1[][]= {{10,20,30},{40,50,60},{70,80,90}};
		
	
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
}
