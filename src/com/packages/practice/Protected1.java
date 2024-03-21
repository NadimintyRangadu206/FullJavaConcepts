package com.packages.practice;

abstract class  dkjfkd {
abstract  void m(); 
	 
	protected void a() {

		System.out.println(",sfm,d,fdfdkd");
	}

}

class AAA extends dkjfkd {

	protected void a() {

		System.out.println("sm,fkfk");
		super.a();
	}

	@Override
	void m() {
		// TODO Auto-generated method stub
		
	}
}

public class Protected1 {

	void name() {
		System.out.println("It Can accessed!");
	}

	public static void main(String[] args) {

		Protected1 p = new Protected1();
		p.name();

		dkjfkd s = new AAA();
		s.a();

	}

}
