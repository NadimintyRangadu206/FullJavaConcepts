package com.java.geeksforgeeks;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class FindDuplicatesArray {

	public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        
        ArrayList<Integer> copy= new ArrayList<>();
        Integer [] a=(Integer[]) copy.toArray();
        
        ArrayList<Integer> negative= new ArrayList<>();
        negative.add(-1);
        
        for(int i=0;i<arr.length;i++){
            
            for(int j=i+1;j<arr.length;j++){
                
                if(arr[i]==arr[j]){
                    copy.add(arr[j]);
                }
            }
        }
        if(copy.size()!=0){
            return (ArrayList<Integer>) copy.stream().distinct().collect(Collectors.toList());
            
        }else{
            return negative;
        }
	}
            
	public static void main(String[] args) {
		
		int a1[]= {3, 4, 12, 3, 12, 3, 4 ,4, 12, 7, 11 ,6, 5};
		
		System.out.println(duplicates(a1, a1.length));
	}

}
