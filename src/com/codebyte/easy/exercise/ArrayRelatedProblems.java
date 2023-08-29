package com.codebyte.easy.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayRelatedProblems {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 2, 7, 8, 8, 3 };

		int copy[] = new int[arr.length];
		
	
		int length=arr.length;
		System.out.println(length);
		int j = 0;
		for (int i : arr) {

			copy[j] = i;
			j++;
			System.out.print(i);
		}
		System.out.println();
		
		for(int k:copy) {
			System.out.print(k);
		}
		
		System.out.println(); int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int t=i+1;t<arr.length;t++) {
				
				if(arr[i]>arr[t]) {
					temp=arr[i];
					arr[i]=arr[j];
				   arr[t]=temp;
					
				}
			}
		}
		
	
		int fre[]= new int[arr.length];
		int visited=-1;
		
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int t=i+1;t<arr.length;t++) {
				
				if(arr[i]==arr[j]) {
					count++;
					fre[j]=visited;
					
				}
			}
			
			if(fre[i]!=visited) {
				fre[i]=count;
			}
		}
		
		  for(int i = 0; i < fre.length; i++){  
	            if(fre[i] != visited)  
	                System.out.println("    " + arr[i] + "    |    " + fre[i]);  
	        } 
		
		
		
		
	Arrays.sort(arr);
//		 System.out.println("Elements of array sorted in ascending order: ");    
//	        for (int i = 0; i < arr.length; i++) {     
//	            System.out.print(arr[i] + " ");    
//	        }  

		System.out.println();
		int count=0;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
			count++;
		}
		System.out.println();
		System.out.println("Count"+":"+count);
		
		System.out.println();
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
			System.out.print(arr[i]+" ");
			}
			
			
		}
		
		System.out.println(); // smallest Value in the Array
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<max) {
			max=arr[i];
			}
		}
		System.out.println(max);
		
		
		System.out.println();
		int sum=0;
		
		for(int i=arr.length-1;i>=0;i--) {
		        sum+=arr[i];
		}
		System.out.println(sum);
		
		System.out.println();
		ArrayList<Integer> list= new ArrayList<>();
		
		for(int i=arr.length-1;i>=0;i--) {
		list.add(arr[i]);
		}
		
		Collections.reverse(list);
		
		for(int i:list) {
			System.out.print(i);
		}
		
		
		
		
		
	}

}
