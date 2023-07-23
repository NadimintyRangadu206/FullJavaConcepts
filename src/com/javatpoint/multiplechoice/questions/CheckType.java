package com.javatpoint.multiplechoice.questions;

public class CheckType {

	static int a=10;
	static int n;
	 int b=20;
	 int c;
	
	 
	 
	public CheckType(int m) {
		
		System.out.println(a+","+b+","+c+","+n+","+m);
	}
	
	{
		b=40;
		n=60;
		
	}
	
	static {
		a=80;
	}
	public static void main(String[] args) {

		
		CheckType ct= new CheckType(n);
		int s=ct.hashCode();
		System.out.println(s);
		
		float f=35/0; // infinity time---> (long.double ,float) 
		System.out.println(f);

	}

}
