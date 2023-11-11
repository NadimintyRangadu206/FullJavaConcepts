package com.codingnijas.practice;

import java.util.ArrayList;

public class NextGreaterElement {

	public static ArrayList<Integer> nextGreaterElement(ArrayList<Integer> arr, int n) {
		// Write your code here.

		int ar[] = new int[arr.size()];
		int k = 0;
		for (int pNo : arr) {
			ar[k] = pNo;
			k++;
		}

		ArrayList<Integer> copy = new ArrayList<>();

//		int max=ar[0];
		int next;
		for (int i = 0; i < ar.length; i++) {
//			if (i == ar.length - 1) {
//				copy.add(-1);
//			}
			next = -1;
			for (int j = i + 1; j < ar.length; j++) {

				if (ar[i] < ar[j]) {
					next = ar[j];
//					copy.add(next);
					break;
				}
//				

			}
			copy.add(next);

		}
		return copy;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 1;

		ArrayList<Integer> arr = new ArrayList<>();

		arr.add(10);
		arr.add(9);
		arr.add(10);
//		arr.add(12);
//		arr.add(5);

		System.out.println(nextGreaterElement(arr, n));

	}

}
