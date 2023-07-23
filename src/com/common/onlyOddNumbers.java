package com.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class onlyOddNumbers {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		List<Integer> list1 = Arrays.asList(2, 4, 5, 8, 7, 9, 11, 31);

		for (Integer i : list1) {

			if (i % 2 != 0) {
				System.out.print(i);
			}
		}

	}

}
