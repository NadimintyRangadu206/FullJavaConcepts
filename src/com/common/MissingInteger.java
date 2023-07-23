package com.common;

public class MissingInteger {

	public static int firstMissingPositive(int[] a) {
	    int n = a.length;
	    
	    // 1. mark numbers (num < 0) and (num > n) with a special marker number (n+1) 
	    // (we can ignore those because if all number are > n then we'll simply return 1)
	    for (int i = 0; i < n; i++) {
	        if (a[i] <= 0 || a[i] > n) {
	            a[i] = n + 1;
	        }
	    }
	    // note: all number in the array are now positive, and on the range 1..n+1
	    
	    // 2. mark each cell appearing in the array, by converting the index for that number to negative
	    for (int i = 0; i < n; i++) {
	        int num = Math.abs(a[i]);
	        if (num > n) {
	            continue;
	        }
	        num--; // -1 for zero index based array (so the number 1 will be at pos 0)
	        if (a[num] > 0) { // prevents double negative operations
	            a[num] = -1 * a[num];
	        }
	    }
	    
	    // 3. find the first cell which isn't negative (doesn't appear in the array)
	    for (int i = 0; i < n; i++) {
	        if (a[i] >= 0) {
	            return i + 1;
	        }
	    }
	    
	    // 4. no positive numbers were found, which means the array contains all numbers 1..n
	    return n + 1;
	}
	
	public static void main(String[] args) {
		
		int arr[] = new int[] {1,2,0};

		System.out
				.println(MissingInteger.firstMissingPositive(arr) + "is the first Positive Lost Integer");
	}

}
