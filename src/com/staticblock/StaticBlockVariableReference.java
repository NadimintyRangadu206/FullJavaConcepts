package com.staticblock;

public class StaticBlockVariableReference {

	int i;
	int j;
	static int k;

	public static void main(String[] args) {

		int i = new StaticBlockVariableReference().i = 0;
		int j = new StaticBlockVariableReference().j = 3;
		
		System.out.println(i);
	
		System.out.println(j);

		System.out.println(k=5);

	}

}
