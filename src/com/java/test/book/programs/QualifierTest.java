package com.java.test.book.programs;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

final class A {
	int i;

}

class B  {

	int j;

	
}

public class QualifierTest {
	int results = 0;

	int add(int n) {

		if (n == 1) {

			return 1;
		}

		results = results * add(n - 1);
		return results;

	}

	public static void main(String[] args) throws Exception {

		QualifierTest obj = new QualifierTest();
		System.out.println(obj.add(5));

		if (args.length > 0) {
			System.out.println(args.length);
		}

		URL url = new URL("https://www.sanfoundry.com/javamcq");

		URLConnection urlConnection = url.openConnection();
		int length = urlConnection.getContentLength();
		System.out.println(length);
		System.out.println(url.toExternalForm());

		String s = "Hello i love java";

		boolean flag;
		flag = s.startsWith("Hello");
		System.out.println(flag);

		char ch[] = { 'a', 'b', 'c' };

		String str = new String(ch);
		System.out.println(str);

		double a, b, c;
		a = 3.00 / 0;
		b = 0 / 2.00;
		c = 0 / 0.00;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		byte x = 64;

		byte d = 50;
		byte f = 20;

		int t = (int) 50 + 20;
		System.out.println(t);

		int i;
		byte y;

		i = x << 2;
		y = (byte) (x << 2);
		System.out.println(i + " " + y);
		
		
	     float f1=5.43f;
	     float f2=2.653f;
	     
	     float results=f1/f2;
	     
	    
	     System.out.format("%.3f", results);
	     
	     

	}

}
