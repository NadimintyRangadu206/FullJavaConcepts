package com.codingnijas.practice;

import java.util.ArrayList;
import java.util.List;

public class PascalTrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<ArrayList<Long>> list = new ArrayList<>();

		int arr[] = { 3, 1, 2, 3 };
		int r = 0;
		for (int n : arr) {

			for (int i = 1; i <= n; i++) {
				ArrayList<Long> copy = new ArrayList<>();
				for (int k = n - 1; k >= i; k--) {
					System.out.print(" ");
				}
				int c = 1;
				for (int j = 1; j <= i; j++) {
					if (i == j) {
						System.out.print("1");

						copy.add(Long.valueOf(1));
					} else {
//					System.out.print(j + " ");

						System.out.print(c + " ");
						copy.add(Long.valueOf(c));
						c = c * (i - j) / j;
//		                copy.add(Long.valueOf(c));

					}

				}
				list.add(r, copy);
				r++;
				System.out.println();

			}
		}

		System.out.println(list);

	}

}
