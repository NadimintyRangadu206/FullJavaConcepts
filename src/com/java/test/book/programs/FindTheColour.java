package com.java.test.book.programs;

import java.util.Scanner;

/**
 * 
 * @author nadim
 * 
 *         Find the Color Using the Switch Statement;
 *
 */
public class FindTheColour {

	public static void main(String[] args) {
		
		int i=1;
		
		if(i==1) {
		return;
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Color here!");

		String color = sc.next();

		switch (color) {

		case "Green":
			System.out.println("This Color is " + ":" + color);
			break;
		case "Pink":
			System.out.println("This Color is " + ":" + color);
			break;

		case "Brown":
			System.out.println("This Color is " + ":" + color);
			break;
		case "Black":
			System.out.println("This Color is " + ":" + color);
			break;

		case "White":
			System.out.println("This Color is " + ":" + color);
			break;

		case "Blue":
			System.out.println("This Color is " + ":" + color);
			break;

		case "Yellow":
			System.out.println("This Color is " + ":" + color);
			break;
			
		case "Red":
			System.out.println("This Color is " + ":" + color);
			break;

		default:
			System.out.println("No Color is Match");
		}

		sc.close();

	}
}
