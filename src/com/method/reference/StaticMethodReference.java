package com.method.reference;

@FunctionalInterface
interface Addition{
	
	public abstract int add(int a,int b);
}
public class StaticMethodReference {

	public static int somthing(int a,int b) {
		
//		System.out.println("Static method refference"+ "="+ a+b);
		return a+b;
		
	}
	
	public static void main(String[] args) {
     
		Addition a1=StaticMethodReference::somthing;
	
		Addition b2=(a,b)->{return a+b;};
	
		System.out.println(	b2.add(50,60));
	System.out.println(	b2.add(50,60));

	}

}
