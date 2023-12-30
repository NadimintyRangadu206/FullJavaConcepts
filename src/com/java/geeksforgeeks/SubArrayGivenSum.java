package com.java.geeksforgeeks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SubArrayGivenSum {

	public static void main(String[] args) {

		int arr[] = { 1,2,3,7,5};

		int s = 0;

		ArrayList<Integer> list = new ArrayList<>();
		list.stream().distinct().collect(Collectors.toList());
		
		List<Integer> copy= new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i; j < arr.length; j++) {

				count += arr[j];

				if (count == s) {

					list.add(i ,j);
				
				
			
				}
			

			}
		
			
		}
		
		copy.add(list.get(0));
		copy.add(list.get(1));
		
		System.out.println(copy);

		System.out.println(list);
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(-1);

	}

}
