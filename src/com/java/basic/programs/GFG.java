package com.java.basic.programs;

/*package whatever //do not write package name here */
import java.io.*; 

class GFG { 
static int countRotations(int arr[], int n) 
{ 

	// Check is array is rotated 
	if (arr[0] > arr[n - 1]) { 

	// Traverse the array 
	for (int i = 0; i < n; i++) { 

		// Index where element is greater 
		// than the next element 
		if (arr[i] > arr[i + 1]) 
		return i + 1; 
	} 
	} 

	// Array is not rotated 
	return 0; 
} 

public static void main(String[] args) 
{ 
	int arr[] = {10,11,12,13,14,15,7,8,15 }; 
	int n = arr.length; 
	System.out.println(countRotations(arr, n)); 
} 
} 

// This code is contributed by dhanshriborse561

