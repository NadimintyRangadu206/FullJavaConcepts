package com.codebyte.easy.exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestWord {

	 public static String longestWord(String sen) {
		    // code goes here
		          
		          String str[]=sen.split(" ");
		 
		               Map<Integer,String> map= new HashMap<>();
		               Map.Entry<Integer,String> maxPrice = null;

		          for(String s:str){
		              int count=0;
		                for(int i=0;i<s.length();i++){
		                      if(s.charAt(i)!='!'){
		                          count++;
		                      }     
		                }
		                map.put(count,s);

		          }
		         
		          for(Map.Entry<Integer,String> max: map.entrySet()) {
		        	  
		        	  if(maxPrice==null|| max.getValue().compareTo(maxPrice.getValue())>0) {
		        		  maxPrice=max;
		        		  
		        	  }
		        	  
		          }
		          String t=maxPrice.getValue();

		    return t;
		  }
	
	public static void main(String[] args) {
	
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter a text here");
		    System.out.print(longestWord(scanner.nextLine())); 
		    
		    

	}

}
