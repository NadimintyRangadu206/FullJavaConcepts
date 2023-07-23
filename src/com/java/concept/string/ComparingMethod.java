package com.java.concept.string;

public class ComparingMethod {

	public static void main(String[] args) {
	
		String s1="Sachine";
		String s2="Sachine";
		String s3="Dhoni";
		
		//Using CompareTo() Method:
		
	   int s= s1.compareTo(s2);
	   System.out.println(s);
	   
	   int  j=s2.compareTo(s3);
	   System.out.println(j);
	   
	   int k=s3.compareTo(s2);
	   System.out.println(k);

	}

}
