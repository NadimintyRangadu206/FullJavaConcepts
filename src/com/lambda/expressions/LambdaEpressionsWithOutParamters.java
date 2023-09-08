package com.lambda.expressions;

@FunctionalInterface
interface WithOutParameters{
	
	public abstract String add();
	
	default int sum() {
		return 0;
		
	}
	
	static int mul() {
		return 0;
	}
		
	
}

public class LambdaEpressionsWithOutParamters  {

	public static void main(String[] args) {
 
		WithOutParameters wp=()-> {return "dmdnnejre";};
		System.out.println(wp.add());
 
	}

	

}
