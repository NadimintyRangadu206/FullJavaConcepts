package com.codebyte.easy.exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LongestWord {

	private static final int String = 0;

	public static String longestWord(String sen) {

		String str[] = sen.split(" ");

		int length[] = new int[str.length];

		int i = 0;
		
		Map<String, Integer> sh= new  TreeMap<String, Integer>();
		for (String s : str) {

			length[i] = s.length();
			
			sh.put(s,s.length());
			i++;
		}

		int max = length[0];

		for (int m = 0; m < length.length; m++) {

			for (int n = m + 1; n < length.length; n++) {

				if (length[m] > max) {
					max = length[m];
				}
			}
		}
		System.out.println(max);

		for (int r = 0; r < str.length; r++) {

			if (str[r].length() == max) {
				return str[r].toString();
			}
		}

//		    // code goes here
//		          
//		          String str[]=sen.split(" ");
//		 
//		               Map<Integer,String> map= new HashMap<>();
//		               Map.Entry<Integer,String> maxPrice = null;
//
//		          for(String s:str){
//		              int count=0;
//		                for(int i=0;i<s.length();i++){
//		                      if(s.charAt(i)!='!'){
//		                          count++;
//		                      }     
//		                }
//		                map.put(count,s);
//
//		          }
//		         
//		          for(Map.Entry<Integer,String> max: map.entrySet()) {
//		        	  
//		        	  if(maxPrice==null|| max.getValue().compareTo(maxPrice.getValue())>0) {
//		        		  maxPrice=max;
//		        		  
//		        	  }
//		        	  
//		          }
//		          String t=maxPrice.getValue();

		return null;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a text here");
		System.out.print(longestWord(scanner.nextLine()));

		
	}

}
