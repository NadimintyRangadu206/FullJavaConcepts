package com.lambda.expressions;

@FunctionalInterface
interface WithParameters{
	
	public abstract String add(int a,int b); 
		
	
}
public class LambdaEpressionsWithParamters {

	public static void main(String[] args) {
		
	
      WithParameters wp=(a,b)->{ return Integer.toString(a)+Integer.toString(b);};
		
     System.out.println( wp.add(20, 30));
	}

}
