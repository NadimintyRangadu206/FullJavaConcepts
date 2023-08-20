package com.java.concept.string;

public class GetCharsMethod {

	public static void main(String[] args) {
	 
		String s="sdsdshdgsdshdhwehwbehw";
		
		char [] ch=new char[5];
		
		s.getChars(4, 9, ch, 0);
		
		System.out.println(ch); // throw the StringOutOfBoundes Exception

	}

}
