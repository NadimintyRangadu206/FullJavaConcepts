package com.java.recursiontopic;

/**
 * The Recursion is a process of Method Calling it self continuously is Known as
 * a Recursion
 * 
 * @author nadim
 */
public class Recursion1 {
	static int count = 0;

	public static void firstProgram() {

		if (count < 5) {
			System.out.println("Exist");
			count++;
			firstProgram();

		}

	}

	int f1 = 0;
	int f2 = 1;
	int f3 = 0;

	int count1 = 0;

	public void fibnocci() {

		if (count1 < 5) {

			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
			System.out.println(f3);
			count1++;
			fibnocci();

		}

	}

	int fact = 1;

	int no = 5;

	int d = 0;

	public void factorial() {

		if (d < 5) {
			fact = fact * no;
			no--;
			d++;
			factorial();

		}

	}

	public static void main(String[] args) {

		firstProgram();

		Recursion1 rc = new Recursion1();
		System.out.println(rc.f1);
		System.out.println(rc.f2);
		rc.fibnocci();
		rc.factorial();
		System.out.println(rc.fact);
	}

}
