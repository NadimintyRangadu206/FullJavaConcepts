package com.java.array;

public class JaggedArray {

	public static void main(String[] args) {

		int arr[][] = new int[3][2];

		arr[0][0] = 1;
		arr[0][1] = 2;

		arr[1][0] = 4;
		arr[1][1] = 5;

		arr[2][0] = 6;
		arr[2][1] = 7;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		int ar1r[][] = new int[2][3];

		arr[0][0] = 1;
		arr[0][1] = 2;
        arr[0][2]=3;
        
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2]=6;

//		arr[2][0] = 6;
//		arr[2][1] = 7;

		for (int i = 0; i < ar1r.length; i++) {
			for (int j = 0; j < ar1r.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
