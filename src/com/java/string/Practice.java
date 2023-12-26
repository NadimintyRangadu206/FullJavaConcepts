package com.java.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Practice {

	public static void main(String[] args) {

//		for (int i = 0; i <= 20; i++) {
//
//			int count = 0;
//			for (int j = 2; j <= i / 2; j++) {
//
//				if (i % j == 0) {
//					count++;
//
//				}
//
//			}
//			if (count == 0) {
//				System.out.println(i);
//			}
//
//		}
//
//		int no = 10;
//		int count = 0;
//		for (int i = 1; i <= no; i++) {
//
//			if (no % i == 0) {
//				count++;
//			}
//
//		}
//		if (count == 2) {
//			System.out.println("Prime No ");
//		} else {
//			System.out.println("Not Prime No");
//		}

//		int no = 153;
//		int rev = 0;
//		int r = 0;
//		int temp = no;
//
//		while (no != 0) {
//
//			r = no % 10;
//			rev = rev + r * r * r;
//			no = no / 10;
//
//		}
//		if (rev == temp) {
//			System.out.println("Armstrong Number");
//		} else {
//			System.out.println("Not");
//		}

//		int no = 5;
//		int fact = 1;
//
//		while (no != 0) {
//
//			fact = fact * (no);
//			no--;
//		}
//		System.out.println(fact);

//		int random = (int) (Math.random() * (6 - 1 + 1) + 1);
//
//		System.out.println(random);
//
//		Random r = new Random();
//
//		int i = r.nextInt(6);
//		System.out.println(i);
//
//		double l = r.nextInt(6);
//		System.out.println(l);
//
//		boolean b = r.nextBoolean();
//		System.out.println(b);
//
//		int tlr = ThreadLocalRandom.current().nextInt(6);
//		System.out.println(tlr);

//		for (int i = 1; i <= 5; i++) {
//			for (int k = 4; k >= i; k--) {
//				System.out.print(" ");
//			}
//			for (int j = 1; j <= i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//
//		}
//
//		for (int i = 1; i <= 5; i++) {
//			for (int k = 2; k <= i; k++) {
//				System.out.print(" ");
//			}
//			for (int j = 5; j >= i; j--) {
//				System.out.print(" *");
//			}
//			System.out.println();
//		}
//
//		for (int i = 1; i <= 10; i++) {
//			for (int j = 1; j <= 5; j++) {
//
//				if (j == 1 || j == 5 || i == 1 || i == 10) {
//					System.out.print("*");
//				} else if (i == 5) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//
//		for (int i = 1; i < 10; i++) {
//
//			for (int k = 9; k >= i; k--) {
//				System.out.print(" ");
//			}
//
//			for (int j = 1; j <= i; j++) {
//
//				if (j == 1 || j == i) {
//					System.out.print("* ");
//				}
////				
//				else if (i == 9) {
//					System.out.print("* ");
//				} else {
//					System.out.print("  ");
//				}
//
////				System.out.print("* ");
//			}
//			System.out.println();
//		}
//
//		int h = 1;
//		for (int i = 1; i <= 5; i++) {
//			for (int k = 4; k >= i; k--) {
//				System.out.print(" ");
//			}
//
//			for (int j = 1; j <= i; j++) {
//
//				if (j == 1 || j == i) {
//					System.out.print(h + " ");
//
//				} else {
//					h = h * (i - j) / j + 1;
//					System.out.print(h * 1 + 1 + " ");
//				}
//
//			}
//
//			System.out.println();
//		}
//
//		for (int i = 1; i <= 10; i++) {
//
//			for (int j = 1; j <= 10; j++) {
//
//				if (j % 2 == 0) {
//					System.out.print("0");
//				} else {
//					System.out.print("1");
//				}
//			}
//			System.out.println();
//		}
//
//		for (int i = 0; i <= 5; i++) {
//			char ch = 'A';
//			for (int j = 0; j <= i; j++) {
//
//				System.out.print(ch + " ");
//				ch++;
//			}
//
//			System.out.println();
//		}
//
//		for (int i = 65; i <= 90; i++) {
//
//			System.out.println((char) (i + 32));
//		}
//
//		/// WithOut Sqrt Method
//		double number = 16;
//		System.out.println(number);
//		double t;
//
//		double sqrt = number / 2;
//
//		do {
//			t = sqrt;
//			sqrt = (t + (number / t)) / 2;
//
//		} while ((t - sqrt) != 0);
//		System.out.println(sqrt);
//
//		double d = Math.sqrt(16);
//		System.out.println(d);
//
//		double s = Math.pow(4, 2);
//		System.out.println(s);
//
//		int f1 = 12;
//		int f2 = 8;
//		int gcd = 1;
//
//		for (int i = 1; i <= f1 && i <= f2; i++) {
//
//			if (f1 % i == 0 && f2 % i == 0) {
//				gcd = i;
//			}
//
//		}
//		System.out.println(gcd);
//
//		int n1 = 12;
//		int n2 = -40;
//		int n3 = 10;
//
//		int temp = (n1 < n2) ? n1 : n2;
//
//		int largest = (n3 < temp) ? n3 : temp;
//		System.out.println(largest);
//
//		if (n2 >= 0) {
//			System.out.println("Positive");
//		} else {
//			System.out.println("Not Negative");
//		}
//
//		int arr[] = { 1, 4, 5, 1, 2, 4 };
//
//		int fre[] = new int[arr.length];
//
//		int visited = -1;
//		for (int i = 0; i < arr.length; i++) {
//			int count = 1;
//
//			for (int j = i + 1; j < arr.length; j++) {
//
//				if (arr[i] == arr[j]) {
//
////					System.out.println(arr[i]);
//					count++;
//					fre[j] = visited;
//
//				}
//
//			}
//
//			if (fre[i] != visited) {
//
//				fre[i] = count;
//			}
//		}
//
//		for (int i = 0; i < fre.length; i++) {
//
//			if (fre[i] != visited) {
//				System.out.println(arr[i] + "-" + fre[i]);
//			}
//		}
//
//		List<Integer> list = new ArrayList<>();
//
//		for (int i : list) {
//			list.add(i);
//
//		}
//
////		Optional<Integer> r=list.stream().collect(Comparator.comparing(s->s)));
////		System.out.println(r);
//
//		String str = "abbaccbeebad";
//
//		List<String> list1= new ArrayList<>();
//		
//		for(int i=0;i<str.length();i++) {
//		
//			
//		}
//		String s1 = str.substring(0, 2);
//		System.out.println(s1);
//
//		String s2 = str.substring(0, 4);
//		System.out.println(s2);
//		String s3 = str.substring(4, 6);
//		System.out.println(s3);
//		
//		list1.add(s1);
//		list1.add(s2);
//		list1.add(s3);
//		System.out.println(list1);
//		
//		
//		

		int arr[] = { 3, 2, 4, 6, 5 };
		
		int[] arr1=new int[arr.length];
		
          Arrays.sort(arr);

			for (int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++)
					for (int k = j + 1; k < arr.length; k++) {

						if ((arr[i] * arr[i]) + (arr[j] * arr[j]) == arr[k] * arr[k]) {
							System.out.println("{" + arr[i] + "," + arr[j] + "," + arr[k] + "}");
						}
					}
			}

		}

	}
