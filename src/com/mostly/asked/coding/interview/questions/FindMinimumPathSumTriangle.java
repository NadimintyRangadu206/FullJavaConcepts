package com.mostly.asked.coding.interview.questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindMinimumPathSumTriangle {

	public static  int minimumTotal(List<List<Integer>> triangle) {

		int n = triangle.size();
		int[] dp = new int[n + 1]; // dp array to store intermediate results

		// Start from the bottom of the triangle
		for (int i = n - 1; i >= 0; i--) {
			List<Integer> row = triangle.get(i);
			for (int j = 0; j < row.size(); j++) {
				// Choose the minimum path sum for each position
				dp[j] = row.get(j) + Math.min(dp[j], dp[j + 1]);
			}
		}

		return 0;
	}

	public static void main(String[] args) {
//		[2],[3,4],[6,5,7],[4,1,8,3]
		List<List<Integer>> triangle = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			List<Integer> l = new ArrayList<>();
			for (int j = 0; j <= i; j++) {

				Scanner sc = new Scanner(System.in);
				System.out.println("Enter a Number i");
				l.add(sc.nextInt());
			}

			triangle.add(l);

		}
		
	   minimumTotal(triangle);

	}

}
