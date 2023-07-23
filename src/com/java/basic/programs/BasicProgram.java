package com.java.basic.programs;

import java.util.ArrayList;

public class BasicProgram {
	
	int n1=0;
	int n2=1;
	int n3;
	
	public void fab1(int i) {
		System.out.println("..................");
		System.out.println(n1);
		System.out.println(n2);
		
		if(i>0) {
		n3=n1+n2;
		System.out.println(n3);
		n1=n2;
		n2=n3;
		fab1(i-1);
		}
	}

	public ArrayList<Integer> fab(int r1,int r2) {
		
		int r3;
		
		ArrayList<Integer> al= new ArrayList<>();
		
		al.add(r1);
		al.add(r2);
		
		for(int i=0;i<=5;i++) {
			
		
			r3=r1+r2;
			al.add(r3);
			r1=r2;
			r2=r3;
			
			
		}
		
		
		
		return al;
	
	}
	public static void main(String[] args) {

		int f1 = 0;

		int f2 = 1;

		int f3;

		System.out.println(f1);
		System.out.println(f2);
		for (int i = 0; i <= 5; i++) {

			f3 = f1 + f2;
			System.out.println(f3);
			f1 = f2;
			f2 = f3;

		}
		
		System.out.println(new BasicProgram().fab(0, 1));
	 BasicProgram b= new BasicProgram();
	 int i=10;
	 b.fab1(i-2);
	 

	}

}
