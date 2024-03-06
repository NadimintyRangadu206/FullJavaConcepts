package com.mostly.asked.coding.interview.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triangle {
	
	
	 public static int minPathSum(int[][] grid) {
	        
	        int shell=1;

	        int minR=shell-1;
	        int minC=shell-1;

	        int maxR=grid.length;
	        int maxC=grid[0].length-1;

	        int minimizePath=0;

	        for(int i=minR,j=minC;j<=maxC;j++){
	           minimizePath+=grid[i][j];

	        }
	        minR++;
	        for(int i=minR,j=maxC;i<maxR;i++){
	             minimizePath+=grid[i][j];
	        }


	     return minimizePath;
	    }

	public static int minimumTotal(List<List<Integer>> triangle) {

		
		
		
		
		int miniPath=0;
        for(int i=0;i<triangle.size();i++){

            List<Integer> arr= triangle.get(i);
               
            if(i==0 || i==1.){
            for(int j=0;j<arr.size();j++){
                     
                 miniPath+=arr.get(j);
                 break;
                  

            }
             continue;
            }
              for(int j=0;i<arr.size();j++){
                     
                     if(j==1){
               miniPath+=arr.get(j);
                     }
                
                  

            }   


        }

        return miniPath;
//		int totalMinValues = 0;
//		for (List<Integer> list : triangle) {
//
//			Optional<Integer> min = list.stream().min(Comparator.comparing(i -> i));
//
//			totalMinValues += min.get();
//
//		}
//
//		return totalMinValues;
	}

	public static void main(String[] args) {

//                                                    [[-1],[2,3],[1,-1,-3]]                            [2],[3,4],[6,5,7],[4,1,8,3]
		List<Integer> q1 = Arrays.asList(2);

		List<Integer> q2 = Arrays.asList(3,4);

		List<Integer> q3 = Arrays.asList(6,5,7);

		List<Integer> q4 = Arrays.asList(4, 1, 8, 3);

		List<List<Integer>> triangle = Arrays.asList(q1, q2, q3,q4);

		System.out.println(minimumTotal(triangle));
		
		
		
		int grid[][]= {{1,2,3},{4,5,6}};
		
		System.out.println(minPathSum(grid));

	}

}
