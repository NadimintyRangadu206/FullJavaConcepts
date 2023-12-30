package com.java.array;

public class MutiplicationOfMatrixArray {

	public static void main(String[] args) {


		int arr1[][]={{1,1,1},{2,2,2},{3,3,3}}; 
		
	
		
		int arr2[][]= {{1,1,1},{2,2,2},{3,3,3}};
		int arr3[][] = new int[arr1.length][arr2.length];

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {

				arr3[i][j] = 0;

				for (int k = 0; k < arr2.length; k++) {

					arr3[i][j] += arr1[i][k] * arr2[j][k];

				}
			}
			System.out.println();
		}

		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3.length; j++) {

				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}

	}

}
