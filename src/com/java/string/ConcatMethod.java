package com.java.string;

import java.util.StringJoiner;

public class ConcatMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Key";
		String s2="Board";
		
		s2.concat("sjfsjsf");
		System.out.println(s2);
		
////		String copy=s1.concat(s2);
//		s1=s1.concat(s2);
//		System.out.println(s1);// 1
		
		String f=String.format("%s%s",s1,s2);
		System.out.println(f);// 2
		
		String j=String.join("", s1,s2);
		System.out.println(j);
		
		
		StringJoiner sj= new StringJoiner(",");
		
		sj.add("hello");
		sj.add("World");
		
		System.out.println(sj.toString());
		
		
		

	}

}
