package com.common;

class Test {

	String str;
	int i;
	double d;

	Test(String str, int i) {
		this.str = str;
		this.i = i;
	}

	public Test(String str, int i, double d) { // constructor invoke current class Constructor

		this(str, i); // this constructor is call the first statement
		this.d = d;

	}

	public void add(int num1, int num2) {

		System.out.println(num1 + num2);
	}

	public void sum() {

		System.out.println("adding is perform");
		add(10, 20);
//	  	System.exit(0);
	}

	public int sub(int a, int b) {

		return a * b;
	}
}

public class ThisKeyword {

	public static void main(String[] args) {

		Test t = new Test("tiurytur", 8, 300000.00);
		System.out.println(t.i + " " + t.str + " " + t.d);

		t.sum();
		System.out.println(t.sub(2, 4));
		
		
		String str="shivani";
		
		char ch[]= str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					System.out.print(ch[j]);
				}
			}
			System.out.println();
		
		}
	}

}
