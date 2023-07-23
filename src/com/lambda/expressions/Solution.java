package com.lambda.expressions;

@FunctionalInterface
interface BookStore{
	
	int sell();
	
	
}


interface Library extends BookStore{
	
	int collect();

	int buy();
	int choice();
	
}

public class Solution  implements Library{

	public static void main(String[] args) {
		
		

	}

	@Override
	public int sell() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int collect() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int buy() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int choice() {
		// TODO Auto-generated method stub
		return 0;
	}

}
