package com.mostly.asked.coding.interview.questions;

public class RotatedArray {
	
	
	static void reverse( int arr [] ,int startIndex, int endIndex) {
		
		while(startIndex<endIndex) {
		
			int temp=arr[startIndex];
			arr[startIndex]=arr[endIndex];
			arr[endIndex]=temp;
			
			startIndex++;
			endIndex--;
			
		}
		
	
		
	}

	public static void main(String[] args) {
	
		int arr []= {1,2,3,4,5,6};   int noOfRotates=2;
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		reverse(arr, 0, arr.length-1-noOfRotates);
		
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		reverse(arr, arr.length-noOfRotates, arr.length-1);
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		reverse(arr, 0, arr.length-1);
		
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}

}
