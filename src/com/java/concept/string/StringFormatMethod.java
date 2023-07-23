package com.java.concept.string;

public class StringFormatMethod {

	public static void main(String[] args) {
		
		
		String s1="Characters";
		
		String f1=String.format("name:%5s", s1);
		System.out.println(f1);

		 int i=10;
		 
		 String f2=String.format("Heigth:%10d", i);
		 System.out.println(f2);
		 
		 char ch='c';
		 
		 String f3=String.format("Characters:%5c", ch);
		 System.out.println(f3);
		 
		 String f4=String.format("Characters:%-5c", ch);
		 System.out.println(f4);
		 

		 String f5=String.format(null, ch); // NullFormatException
		 System.out.println(f5);
	}

}
