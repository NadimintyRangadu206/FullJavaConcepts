package com.common;

import java.util.HashSet;

public class IndexSubstractionArray {

	public static String findSpecialPair(int[] a, int t) {

		int arr[] = new int[a.length];

		String str = new String();
		HashSet<String> set= new HashSet<>();
		int temp=0;
		for (int i = 0; i < a.length; i++) {

			for (int j = i; j < a.length; j++) {
            
				if (a[i] != a[j]) {
					
				arr[i]=a[j]-	a[i];
				
			}
		}
		}
		for(int i=0;i<arr.length;i++) {
//			str=(arr[i]==t||(str=="yes"|| str=="No") || i>=-1)?"yes":"No";
			while(i==t) {
				return "yes";
			}
			return "no";
		}

		return str;

	}

	public static void main(String[] args) {

		int a[] = new int[] { 1, 3, 5 };
		int t = 2;
		System.out.println(IndexSubstractionArray.findSpecialPair(a, t));

	}

}
