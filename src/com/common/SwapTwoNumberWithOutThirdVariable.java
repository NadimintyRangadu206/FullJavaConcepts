package com.common;

public class SwapTwoNumberWithOutThirdVariable {

	 public static void swap(int c,int d) {
		 
		 c=c+d;
		 d=c-d;
		 c=c-d;
		 
		 System.out.println("After Swaping:"+c);
		 System.out.println("After Swaping:"+d);
	 }
	public static void main(String[] args) {

		int a=10;
		int b=20;
		
		System.out.println("ValueOf A"+a);
		System.out.println("ValueOf B"+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swaping the A Value:"+a);

		System.out.println("After Swaping the B Value:"+b);
		
		SwapTwoNumberWithOutThirdVariable.swap(40, 70);
	}

}
