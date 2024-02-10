package com.java.test.book.programs;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

class C{
	
	int area() {
		return 1;
	}
}
class D extends C {
	
	int area() {
		return 3;
	}
}

public class CertificationTest1 {

	public final static void main(String[] args) throws Exception {
	
		
		  C a= new C();
		
		D b= new D();
		
		a=b;
		
		System.out.println(a.area());
		
		
		String str="TRUE";
		
		boolean dt=Boolean.valueOf(str);
		System.out.println(dt);
		
		URL url= new URL("https://test.sanfoundry.com/");
		
		System.out.println(url.getProtocol());
		int x=0;
		x++;
		x=x+1;
		x+=1;
		x=+1;
		
		Double d= new Double(456.578123456789);
		
		Random random= new Random();
		
		int r= random.nextInt(15)+1;
		System.out.println(r);
		float f=d.floatValue();
		System.out.println(f);
		try {
			
			int arr[]= {1,2,3,4,5};
			
			for(int i=0;i<7;++i) {
				
				System.out.print(arr[i]);
			}
			
		}catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("0");
		}

	}

}
