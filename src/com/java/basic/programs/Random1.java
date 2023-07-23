package com.java.basic.programs;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;  
public class Random1 {


	public static void main(String[] args) {
		
		
		int d=(int)(Math.random()*(6-1+1)+1);   // Math.random() * (max - min + 1) + min  
		
		System.out.println(d);

		Random rd= new Random();
		int i=rd.nextInt(6);
		System.out.println(i);
		
		
	int s=ThreadLocalRandom.current().nextInt(10);
	
	System.err.println(s);
		
	}

}
