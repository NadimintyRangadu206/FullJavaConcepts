package com.java.superkeyword;

class A1{
	

	int no=20;
	

}

class B1 extends A1{
	
	
	int no=10;
	
	B1(){
		System.out.println(super.no);
	}
	
}
public class SuperKeyword {

	public static void main(String[] args) {
	
		B1 b= new B1();
		System.out.println(b.no);
		
		A1 a= new A1();
		System.out.println(a.no);
		
		A1 a1=(A1)new B1();
		System.out.println(a1.no);
		
		B1 b2= (B1) new A1(); // ClassCastException
		
		System.out.println(b2.no);
		

	}

}
