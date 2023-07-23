package com.java.basic.programs;

public class MaximumNumber {

	public static void main(String[] args) {
		
		int arr[]= {1, 2, 3, 4, 2, 7, 8, 8, 3};
		
		int a=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>a) {
				a=arr[i];
				
			}
		}
		System.out.println(a);

	}

}
