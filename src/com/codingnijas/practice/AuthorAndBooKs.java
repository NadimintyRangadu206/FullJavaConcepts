package com.codingnijas.practice;

public class AuthorAndBooKs {

	
	public static String [] arrangesAuthors(String [][] s) {
		
		
		
		return null;
		
	}
	public static void main(String[] args) {
	
      
	String [][] str=new String[3][3];  // 1. ChetanBhagat
//	    A. TwoStates
//	    B. Revolution
//	    C. HalfGirlfriend
//	    D. OneIndianGirl 
//	2. JKRowling
//	    A. HarryPotter
//	    B. FantasticBeasts
//	1. JeffreyArcher
//	    A. OldLove 
//	    B. FalseImpression
		
		str[0][0]="ChetanBhagat";		
		str[0][1]="TwoStates";
		str[0][2]="Revolution";
		
		str[1][0]="JKRowling";
		str[1][1]="HarryPotter";
		str[1][2]="FantasticBeasts";
		
		str[2][0]="JeffreyArcher";
		str[2][1]="OldLove";
		str[2][2]="FalseImpression";
		
		System.out.println(AuthorAndBooKs.arrangesAuthors(str));
		
	}

}
