package com.codingnijas.practice;

import java.util.ArrayList;

public class LinearToInversionMatrix {

	public static ArrayList<Integer> inversionMatrix(ArrayList<ArrayList<Integer>> mat) {
		
		ArrayList<Integer> a= new ArrayList<>();
		
		int arr1[][]=new int [2][2];
		
		for(ArrayList<Integer> con:mat) {
			
		     arr1=(int[][]) con.toArray();
			
		}
		
//		a.toArray();
		
		System.out.println(a);
        
		
		
		

		return null;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][] = new int[2][2];

		arr[0][0] = 1;
		arr[0][1] = 2;

		arr[1][0] = 3;
		arr[1][1] = 4;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j][i] + " ");
//				r1.add(arr[i][j]);
			}
			System.out.println();
		}

		ArrayList<Integer> r1 = new ArrayList<>();

		r1.add(1);
		r1.add(2);

		System.out.println(r1);
		System.out.println();
		
		ArrayList<Integer> r2 = new ArrayList<>();
		
		r2.add(3);
		r2.add(4);

		System.out.println(r2);
		
		System.out.println();
		
		ArrayList<ArrayList<Integer>> comb=new ArrayList<ArrayList<Integer>>();
		
		comb.add(0,r1);
		comb.add(1,r2);
		
		for(ArrayList<Integer> it:comb) {
			
			System.out.println(it);
		}
		
		LinearToInversionMatrix.inversionMatrix(comb);
		
		

	}

}
