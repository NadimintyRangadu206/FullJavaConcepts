package com.javatpoint.multiplechoice.questions;

public class CheckCondition {

	public static void main(String[] args) {
		
		int count =1;
		int i=1;int j=1;
		
		CheckCondition c=new CheckCondition();
	          c.getClass();
	          Object b=new Object();
	         
	         
		
		while(count<=15) {
			
			System.out.println(count%2==1?i+"***":j+"++++++"); ;
			count++;
			i++;
			j++;
		}
	}

	
}
