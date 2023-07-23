package com.common;

import java.util.Arrays;

public class LostPostiveNaturalNumber {

	public static int findPositiveLostInteger(int[] a) {
	
		int j=0;
		
		int arr[]= new int [a.length]; // 1,2,3,4
		
		for(int i=0;i<a.length;i++) {	
			
            if(a[i]>0) {
            	j++;
            	arr[i]=j;
            }
            else {
            	j++;
            	arr[i]=j;
            }
		
		}
		
	    Arrays.sort(a);
		int k=0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i] == a[i] && (a[i]>0 &&arr[i]>0)) {
				k=arr[i];
			}
			
			if(k==0) {
				k=1;
			}
			
		}

		
		return k;

	}

	public static void main(String[] args) {

		int arr[] = new int[] {3,4,5,1};

		System.out
				.println(LostPostiveNaturalNumber.findPositiveLostInteger(arr) + "is the first Positive Lost Integer");

	}

}
