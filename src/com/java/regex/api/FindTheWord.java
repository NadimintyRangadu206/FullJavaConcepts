package com.java.regex.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindTheWord {

	public static void main(String[] args) {
	
		String str="The quick brown fox jumps over the lazy dog";
		
		Pattern p=Pattern.compile("e");
		
	Matcher m=	p.matcher(str);
	int count=0;
	while(m.find()) {
		count++;
		System.out.println(m.start()+"-"+m.end()+"="+m.group());
	}
		System.out.println(count);

	}

}
