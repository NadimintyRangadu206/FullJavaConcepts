package com.java.array;

public class FindMaxAndMinNumber {

	public static int[] printArray(int[] copy) {

		for (int i : copy) {
			System.out.println(i);
		}
		
		return new int[] {10,20,30,40,50};

	}

	public static void main(String[] args) {

		int arr[] = { 2, 10, 1, 3, 5, 200 };

		System.out.println(FindMaxAndMinNumber.printArray(new int[] { 2, 4, 6, 7, 8 }));
		
		int arr1[]=printArray(arr);
		
		for(int i:arr1) {
			System.out.println(i);
		}

//		for (int i : arr) {
//			System.out.println(i);
//		}
//
//		int max = arr[0];
//
//		for (int i = 0; i < arr.length; i++) {
//
//			if (arr[i] > max) {
//				max = arr[i];
//			}
//		}
//		System.out.println(max);
		
	}

}
