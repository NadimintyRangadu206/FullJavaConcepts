package com.codebyte.easy.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TTTTTT {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(2);

		Object[] arr = list.toArray();

		for (Object i : arr) {
			System.out.println(i);

		}
		
		Collections.sort(list);

		List<Object> list1 = new ArrayList<Object>();

		list1 = Arrays.asList(arr);

		System.out.println(list1);

	}

}
