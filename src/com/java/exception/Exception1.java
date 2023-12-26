package com.java.exception;

public class Exception1 {

	public static void main(String[] args) {

		int i=10;
		int j=0;
	
		
		try {
 
			System.out.println(i/j);
			
		}catch (Exception e) {
			try {
                 System.out.println(i/(j)) ;
                 
			}catch (Exception e1) {
				System.out.println(e1);
			}
                
		}finally {
			System.exit(0);
			System.out.println("jirerjer");
		}

	}

}
