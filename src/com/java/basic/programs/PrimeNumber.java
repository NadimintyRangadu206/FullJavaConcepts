package com.java.basic.programs;

public class PrimeNumber {

	public String prime(int number) {
		
	
		int count=0;
		for(int i=1;i<=number;i++) {
			
			if(number%i==0) {
				count++;
			}
		}
		
		if(count==2) {
			return "PrimeNo"; 
			
		}
		
		else {
			return "Not Prime";
		}
		
	}
	
	public static void main(String[] args) {

		int no = 10;
		int count = 0;
		for (int i = 1; i <= no; i++) {

			if (no % i == 0) {

				count++;

			}

		}

		if (count == 2) {
			System.out.println("PrimeNumber");
		} else {
			System.out.println("Not");
		}

		System.out.println(new PrimeNumber().prime(11));
		
		
		System.out.println("PrimeNos");
		for(int i=1;i<=20;i++) {
			int coun=0;
			for(int j=2;j<=i/2;j++) {
				
				if(i%j==0) {
					coun++;
				}
				
			}
			if(coun==0) {
				System.out.println(i);
			}
		}
	}

}
