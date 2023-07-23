package com.inheritance;

class Animal {

	public void eat() {
		System.out.println("It is an Animal.....");
	}

}

class Dog extends Animal {

	public void eat() {
		
		System.out.println("Dog is Eated....!");
		super.eat();
	}
}

public class SingleInheritance {

	public static void main(String[] args) {

		
		
		Animal dog= new  Dog();
		dog.eat();
		
		int count;
		for(int i=0;i<=10;i++) {
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
		
		int no=13;
		int cou=0;
		for(int i=1;i<=no;i++) {
			
			if(no%i==0) {
				cou+=1;
			}
		}
		
		if(cou==2) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}
		
		
		
		int i=10;
		
		System.out.println();
	}

}
