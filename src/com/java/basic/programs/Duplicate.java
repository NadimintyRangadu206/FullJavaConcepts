package com.java.basic.programs;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 8, 3, 2, 2, 2, 5, 1 };
		
		for (int i = 0; i < arr.length; i++) {
		
			for (int j = i + 1; j <arr.length; j++) {

				if (arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
	}

}
