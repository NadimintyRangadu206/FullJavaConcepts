package com.java.hacker.regex;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
//		ArrayList<String> list= new ArrayList<>();
//		
//		
		Scanner sc=  new Scanner(System.in);
//		System.out.println("Enter a noOfSentences");
//		int noOfSentences=sc.nextInt();
//		
//		System.out.println("Enter a Sentences");
//		for(int i=1;i<=noOfSentences;i++) {
//			
//			String s=sc.nextLine();
//			
//			list.add(s);
//		}
//		
//		Set<String> set= new HashSet<>();
//
//		for(String f:list) {
//			
////			Pattern p= Pattern.compile("[a-zA-z0-9]");
////			
////			Matcher m= p.matcher(f);
////			
////			while(m.find()) {
////				
////				
////			}
//			
////			System.out.println(f);
//			
//			String s1[]=f.split(" ");
//			
//			for(String h:s1) {
//				
//				set.add(h);
//			}
//		
//	          	
//		}
//		
//		
//		for(String t:set) {
//			System.out.println(t.toString());
//		}
//		
//		
		System.out.println("enter a Size");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			arr[i]=a;
		}
		
		for(int i:arr) {
			System.out.println(i);
		}

	}

}
