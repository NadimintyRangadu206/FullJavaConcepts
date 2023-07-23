package com.java.polymorphism;

public class MethodOverloading {

	public void add(int a, int b) {
		System.out.println("adding two numbers!");
	}

	public void add(int a, int b, int c) {


		System.out.println("Adding three Numbers!");

		this.add(a, b);
	}

	public static int sum(int i, int j) {
		int t = i + j;
		return t;
	}

	public static int sum(int i, int j, int l) {

		System.out.println(sum(i, j));

		int k = i + j + l;
		System.out.println("Summing three numbers");
		return k;
	}
	
	
	public static int show (int m,int n) {
		System.out.println("fnjddfskie");
		int q=m+n;
		System.out.println(q);
		return q;
		
	}
	
	public static double show(int m,int n,int o) {
		
		show(m,n);
		
		System.out.println("--------------------");
		double r=m+n+o;
		return r;
		
	}

	public static void main(String[] args) {

		MethodOverloading mo = new MethodOverloading();

		mo.add(2, 3, 4);

		System.out.println(MethodOverloading.sum(1, 2, 3));
		
		System.out.println(MethodOverloading.show(1, 2,4));

	}

}
