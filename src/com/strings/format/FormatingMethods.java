package com.strings.format;

public class FormatingMethods {

	public static void main(String[] args) {
	
		int no=10;
		String name="hsjsdjsdsdgsh";
		
		char ch[]=new char[5];
		name.getChars(4, 8, ch, 0);
		System.out.println(ch);
		
		String f1=String.format("number %10d", no);
		
		System.out.println(f1);
		
		String f2=String.format("name%s", name);
		System.out.println(f2);

	}

}
