package com.common;

public class SortingArray {

	public static void main(String[] args) {
		
		int arr[]= {10,40,2,50,1,25};
		
	int index=-1;
		
	for(int i=0;i<arr.length;i++) {
	index=i;
		for(int j=i;j<arr.length;j++) {
			
			if(arr[j]<arr[index]) {
			index=j;
			}
		}
		
		int temp=arr[i];
		arr[i]=arr[index];
		arr[index]=temp;
	}

	for(Integer i:arr) {
		System.out.println(i+" ");
	}
	
	
	
	
	// Another way Of Approach
	
	for(int i=0;i<arr.length;i++) {
		
		for(int j=i+1;j<arr.length;j++) {
			
			int temp=0;
			if(arr[i]>arr[j]) {
				
				temp=arr[i];		
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
			
		}
	}
	
	System.out.println("Bubble Sort");
	for(Integer y:arr) {
		System.out.print(y+" ");
	}
	
	}

}
