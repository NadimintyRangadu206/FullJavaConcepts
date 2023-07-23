package com.common;

@FunctionalInterface
  interface SubStraction {
	
	public abstract void sub();
	  
}
public class WithOutLambdaExpresssion implements SubStraction {

	public static void main(String[] args) {
          
		WithOutLambdaExpresssion wle= new WithOutLambdaExpresssion();
		wle.sub();

	}

	@Override
	public void sub() {
		
		System.out.println("Implenenting Without Lambda Expressions");
		
	}

}
