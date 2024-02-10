package com.java.geeksforgeeks;

import java.util.Scanner;

/**
 * 
 * @author nadim
 * There are times when your answer is a floating point that contains the undesired amount of digits after the decimal.
 *  Here, we'll learn how to get a precise answer out of a floating number. 
 *  You are given two floating numbers a and b.
 *   You need to output a/b and decimal precision of a/b up to 3 places after the decimal point.
    Note: You may use System.out.format()
 *
 */
public class PreciseFormat {
	
	
	public static void printInFormat(float a,float b) {
		
		float result=a/b;
		
		System.out.format(result+" "+"%.3f", result);
		System.out.println();
		System.out.println(result+" "+String.format("%.3f", result));
		
	}

	public static void main(String[] args) {
		
		
		printInFormat(5.43f, 2.653f);
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a String :");
		
		String s=sc.nextLine();
		System.out.println(s);
		

	}

}
