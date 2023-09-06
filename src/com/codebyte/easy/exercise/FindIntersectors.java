package com.codebyte.easy.exercise;

import java.util.ArrayList;

/**
 * 
 * @author nadim
 * 
 * Have the function
 *  FindIntersection(strArr) read the array of strings stored in strArr which will contain 2 elements:
 *   the first element will represent a list of comma-separated numbers sorted in ascending order,
 *    the second element will represent a second list of comma-separated numbers (also sorted).
 *     Your goal is to return a comma-separated string containing the numbers that occur in elements of strArr in sorted order. 
 *     If there is no intersection, return the string false.
 *
 */
public class FindIntersectors {

	/**
	 * Input: new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"} Output: 1,4,13
	 * 
	 * @param strArr
	 * @return
	 */
	public static String findIntersectors(String[] strArr) {

		ArrayList<String> list1 = new ArrayList<>();

		String s1 = strArr[0];

		String s2 = strArr[1];

		String sp1[] = s1.split(",");

		String sp2[] = s2.split(",");

		for (int i = 0; i < sp2.length; i++) {

			list1.add(sp2[i]);

		}

		ArrayList<String> list = new ArrayList<>();
		String s = new String();
		for (String i : sp1) {

			if (list1.contains(i)) {
				list.add(i);
			}

		}

//		boolean flag=false;
		if (list.isEmpty()) {
			return "false";
		}

		return list.toString().toString();

	}

	public static void main(String[] args) {

		String arr[] ={"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};

		System.out.println(FindIntersectors.findIntersectors(arr));

	}

}
