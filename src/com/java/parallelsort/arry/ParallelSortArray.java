package com.java.parallelsort.arry;

import java.util.Arrays;
import java.util.StringJoiner;

public class ParallelSortArray {

	public static void main(String[] args) {

		int arr[] = { 1, 4, 8, 5, 0, 3, 9 };
		

		Arrays.parallelSort(arr, 0, 4); //
//		Arrays.sort(arr);

		StringJoiner joiner = new StringJoiner(",", "[", "]");
		for (Integer i : arr) {
			joiner.add(i.toString());
		}
		System.out.println(joiner);

	}

}
