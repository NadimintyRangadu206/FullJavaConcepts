package com.object.classs;

public class VariableReference {

	int i;
	int j;
	
	static int k;
	static int s;
	public static void main(String[] args) {
		
		VariableReference vr=new VariableReference();
		
		vr.i=10;
		vr.j=20;
		
//		vr.k=30;
//		vr.s=40;
		
		int m=1;
		System.out.println(m);
		
		k=30;
		s=40;
		
		System.out.println(vr.i);
		System.out.println(vr.j);
		System.out.println(VariableReference.k);
		System.out.println(VariableReference.s);
	}
	
	

}
