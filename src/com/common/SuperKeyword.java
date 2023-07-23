package com.common;

class Test1 {

	int a ;

	int b;
	int c;
	public Test1(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println("Test1");
	}
	
	
	void eat(int m, String str) {
		System.out.println("Eat");
	}
}

class Result extends Test1 {

	int a = 20;

	public Result(int a,int b,int c) {
		super(a,b);
		this.c=c;
		System.out.println("Not use");
	
	}
	public void test() {
		System.out.println(super.a);
		System.out.println(a);

	} 
	
	public void eat(int m,String str, double d) {
		super.eat(m,str);
		System.out.println("Mat");
		System.out.println(m+str+d);
	}

}

public class SuperKeyword {

	public static void main(String[] args) {

//		Result r = new Result();

		
		Result r= new Result(10,20,30);
		System.out.println(r.a+""+r.b+""+r.c);
		r.test();
       r.eat(10,"jghdgd",200.00);
	}

}
