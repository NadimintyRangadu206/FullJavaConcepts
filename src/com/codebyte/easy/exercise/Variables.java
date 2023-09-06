package com.codebyte.easy.exercise;

import java.util.Random;

public class Variables {

	static int i = 10;

	
	int a = 2000;
	
	long l=a;
	int c=(int)l;
	byte b=(byte) a;
	
	byte a1=20;
	byte b1=30;
	
	byte c1=(byte)(a1+b1);

	public static void main(String[] args) {

		int r = 10;
		System.out.println(Variables.i);
		Variables v = new Variables();
		System.out.println(v.b);
		
		System.out.println(v.c1);

		System.out.println(r);
		
		
		int t=1;
		
		switch(t) {
		
		case 1: 
			System.out.println("value available");
		break;
		default:System.out.println("Value is  not Present Here");
		}
		
		int y=0; // print  1 to 10 odd numbers
		while(y<=10) {
			if(y%2!=0) {
			System.out.println(y);
			}
			y++;
			
		}
		
		
		
		int f1=0;// fabonacci
		int f2=1;
		int f3=0;
		System.out.println("f1:"+f1);
		System.out.println("f2:"+f2);
		for(int i=0;i<4;i++) {
			
			f3=f1+f2;
			System.out.println("f3:"+f3);
			f1=f2;
			f2=f3;
			
		}
		
	
//		prime no's
		int no=10;
		int count ;
		for(int i=1;i<no;i++) {
			count=0;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					count++;
					break;
				}
			}
			
			
			if(count==0) {
				System.out.println(i);
			}
		}
		
		
	// palindrome
		
		int pa=987654; int rev=0;
		int rem=0; int temp=pa;
		
		while(pa!=0) {
			
			rem=pa%10;
			
			rev=(rev*10)+rem;
			pa=pa/10;
		}
		
		if(temp==rev) {
			System.out.println("Palidrome");
		}
		else {
			System.out.println("No");
		}
		
		System.out.println("Reverse Number:" +rev);
		
		
		// factorial
		
		int f=5;int fact=1;
		
		while(f!=0) {
			
			fact=f*fact;
			f--;
		}
		System.out.println(fact);
		
		
		// Amrstrong Number:
		
		int ar=134;int remi=0;int sum=0; int acutal=ar;
		
		while(ar!=0) {
			
		remi=ar%10;
		sum+=remi*remi*remi;
		ar=ar/10;
		
		}
		
		if(acutal==sum) {
			
			System.out.println("arms");
		}else {
			System.out.println("No");
		}
		
		// How to generate Randome
		
		Random randam= new Random();
		
		int an=randam.nextInt(6);
	 System.out.println(an);
	 
	 boolean b=randam.nextBoolean();
	System.out.println(b);
		
		//(2)
                int ran=(int)(Math.random()*(6-1+1)+1); //formaula(Maths.random()*(max-min+1)+min);
                 System.out.println("RAndam:"+" "+ran);
		
		
                // A-z
                 
                 for(int i=65;i<=90;i++) {
                	 
                	 char ch=(char)i;
//                	 System.out.println((char)((ch+32)-32));
                	 
                 }
                 
                 
                 char ch='a';
                 
                 System.out.println((int)ch);
                 
                 int x=10;
                 double d=x;
                 int z=(int)d;
                 System.out.println(d);
                 System.out.println(z);
                 
                 
                 // sqrroot  Answer
                 
                 int sqr=9;
                 
                 int sqrt=(int )(Math.sqrt(sqr));
                 System.out.println(sqrt);
                 
                 double u;
                 double sqroot=sqr/2;
                 do {
                	 u=sqroot;
                	 sqroot=(u+(sqr/u))/2;  
                 }
                 while((u-sqroot)!=0);
                 System.out.println(sqroot);
                 
                 
                 int a=100; // Biggest number
                 int m=200;
                 int c=10;
                 
                 int big=0;
                 int copy=0;
                 
                 copy=a>m?a:m;
                 
                 big=c>copy?c:copy;
                 
                 System.out.println(big);
                 
                 // Natural Numbers
                 
                  int k=1;int q=0;
                 while(k<=10) {
                	q+= k++;
                 }
                 System.out.println(q);
                 
                 
                 String imu="Rangadu";
                 
                 String fr=imu.concat("Nadiminty");
                 
                 System.out.println(imu);
                 System.out.println(fr);
                 
                 String contains=" wjhwjhe sjdjshj jkjkej rangd";
                 
                 if(contains.contains("")) {
                	 
                	 System.out.println("Present");
                 }else {
                	 System.out.println("Not Present ");
                 }
                 
		
	}

}
