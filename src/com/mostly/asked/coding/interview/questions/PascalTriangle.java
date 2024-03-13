package com.mostly.asked.coding.interview.questions;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

	public static int[] e(int arr[]) {
		return new int[] { -1, -1 };

	}

	public static List<List<Integer>> generate(int numRows) {

		List<List<Integer>> list = new ArrayList<>();

		List<Integer> ar = new ArrayList<>();
		for (int i = 1; i <= numRows; i++) {
			List<Integer> arr = new ArrayList<>();

			for (int k = numRows - 1; k >= i; k--) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {

				if (j == 1 || j == i) {

					System.out.print(1 + " ");

					arr.add(1);
				} else {

					System.out.print(j + " ");
					arr.add(j);
				}
			}

			list.add(arr);

			System.out.println();
		}

		return list;
	}

	public static void main(String[] args) {
		int numsRows = 5;

		System.out.println(generate(numsRows));

		System.out.println(new int[] {10,10});
	}

}
