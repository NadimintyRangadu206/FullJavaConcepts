package com.common;

import java.io.IOException;

public class Array {

	public static void main(String[] args) throws NumberFormatException, IOException {

		/*
		 * System.out.println("Enter a Size Of Array");
		 * 
		 * int arr_size=sc.nextInt();
		 * 
		 * int arr[]=new int[arr_size];
		 * 
		 * for(int i=0;i<arr_size;i++) {
		 * 
		 * arr[i]=sc.nextInt(); }
		 * 
		 * int total=0; for(int i=0;i<arr.length;i++) { System.out.println(arr[i]);
		 * total+=arr[i];
		 * 
		 * } System.out.println(total);
		 * 
		 * float per=total/arr_size; System.out.println(per);
		 */

		/*
		 * BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		 * 
		 * System.out.println("Enter a many Subjects");
		 * 
		 * int sub_list=Integer.parseInt(br.readLine());
		 * 
		 * int student_arr[]=new int[sub_list];
		 * 
		 * System.out.println("Enter subject Marks"); for(int i=0;i<sub_list;i++) {
		 * 
		 * student_arr[i]=Integer.parseInt(br.readLine()); }
		 * 
		 * 
		 * int tol_marks=0; String sub_name=null;
		 * 
		 * Arrays.sort(student_arr);
		 * 
		 * for(int i=0;i<student_arr.length;i++) {
		 * 
		 * sub_name=br.readLine(); System.out.println(sub_name+" "+student_arr[i]);
		 * tol_marks+=student_arr[i]; } System.out.println(tol_marks);
		 * 
		 * float percentage=(float)tol_marks/sub_list;
		 * 
		 * System.out.println(percentage);
		 */

		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 6, 7, 8 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}

		System.out.println("Transpose Matrix");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[j][i] + " ");

			}
			System.out.println();
		}
	}

}
