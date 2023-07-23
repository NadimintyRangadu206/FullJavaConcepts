package com.object.classs;

public class MethodReference {

	int i;
	int j;
	int k;

	public void add(int i, int j) {

		this.i = i;
		this.j = j;

	}

	public String add(int i, int j, int k) {
		
		this.add(i, j);
		
		this.k=k;
		
		String s1 = Integer.toString(i);
		String s2 = Integer.toString(j);
		String s3 = Integer.toString(k);
		
		return s1 + " " + s2 + " " + s3 + " ";

	}

	public void display() {
		System.out.println(i + " " + j);
	}

	public static void main(String[] args) {

		MethodReference mr = new MethodReference();
		
	    System.out.println(new MethodReference().add(0, 0,0)); // Direct Calling methods

		int i = 20;
		int j = 30;
		int k = 40;

//		mr.add(i, j);
		
		System.out.println(mr.add(i, j, k));
		mr.display();
		System.out.println();

	}

}
