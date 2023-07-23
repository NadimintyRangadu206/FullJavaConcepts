package com.object.classs;

public class ConstructorReference {

	int i;
	int j;
	int k;

	public ConstructorReference(int i, int j) {

		this.i = i;
		this.j = j;

	}

	public ConstructorReference(int i, int j, int k) {

	    this(i,j);
	    
		this.i = i;
		this.j = j;
		this.k = k;

	}

	public static void main(String[] args) {

		ConstructorReference cr = new ConstructorReference(30, 20, 40);

		System.out.println(cr.i + "-" + cr.j );
		System.out.println(cr.i + "-" + cr.j + "-" + cr.k);

	}

}
