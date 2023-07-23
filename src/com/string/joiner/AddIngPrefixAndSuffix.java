package com.string.joiner;

import java.util.StringJoiner;

public class AddIngPrefixAndSuffix {

	public static void main(String[] args) {
		
StringJoiner sj= new StringJoiner("," ,"[", "]");
		
		sj.add("Hyderabad");
		sj.add("Bangalore");
		sj.add("Chennai");
		sj.add("Pune");
		
		System.out.println(sj);

	}

}
