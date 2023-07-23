package com.staticblock;

public class StaticMethodReference {

	
	
	static {
		
		System.out.println("dvvvvvvvvvvvvvvvvvvvv");
	}
	
	int i;
	int j;
	static int k;
	
	public void display(int i,int j) {
		
		this.i=i;
		this.j=j;
		
	}
	
	public void show() {
		System.out.println(i+" "+j+" "+k);
	}
	
	
	public static void visit(int i,int j, int k) {
		
		
		StaticBlockVariableReference b=new StaticBlockVariableReference();
	
		b.i=i;
		b.j=j;
		StaticBlockVariableReference.k=k; 
		
		System.out.println(i+","+j+","+k);
	}
	
	public void add(int i,int j,int k) {
		
		display(i,j);
		StaticBlockVariableReference.k=k;
	}
	
	public static void main(String[] args) {
		
//		new StaticMethodReference().show().display(20, 30, 50);
		
        StaticMethodReference sbvr=new StaticMethodReference();	
        sbvr.add(20, 30,70);
        sbvr.show();
        
        StaticMethodReference.visit(60, 70, 90);
       
        StaticMethodReference sbvr1=new StaticMethodReference();	
        sbvr1.show();

	}

}
