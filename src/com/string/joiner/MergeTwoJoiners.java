package com.string.joiner;

import java.util.StringJoiner;

public class MergeTwoJoiners {

	public static void main(String[] args) {
		
StringJoiner sj= new StringJoiner(",","[","]");
		
		sj.add("Hyderabad");
		sj.add("Bangalore");
		sj.add("Chennai");
		sj.add("Pune");
		
		StringJoiner sj2= new StringJoiner(",","[", "]");
		
		sj2.add("Delhi");
		sj2.add("Mumbai");
		sj2.add("Goa");
		
		System.out.println(sj2);
		
		StringJoiner s=sj.merge(sj2);
		
		System.out.println(s);

	}

}
