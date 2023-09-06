package com.codebyte.easy.exercise;

public class OppsConcept {

	int i;
	String str;

	int j;
	int k;

	OppsConcept(int j, int k) {
		this.j = j;
		this.k = k;
		System.out.println(j);
		System.out.println(k);
	}

	public void display(int j, int k) {

		this.j = j;
		this.k = k;
		System.out.println(j);
		System.out.println(k);
	}

	public static void main(String[] args) {

		OppsConcept concept = new OppsConcept(30, 60);

		concept.display(2, 5);

		concept.i = 10;
		concept.str = "Oppps";

		System.out.println(concept.i);
		System.out.println(concept.str);

	}

}
