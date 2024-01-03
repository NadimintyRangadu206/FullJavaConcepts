package com.java.geeksforgeeks;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatching {

	public static void leftRotation(int r, int arr[], int n) {

		for (int i = 0; i < r; i++) {
			array(arr, n);
		}
	}

	public static void array(int arr[], int n) {

		
		int i,temp;
		temp = arr[0];

		for ( i = 0; i < n - 1; i++) {

			arr[i] = arr[i + 1];
			arr[i] = temp;
		}
	}

	public static void main(String[] args) {
		
		
		if(args.length>0) {
			System.out.println("dsndsdhsh"+args.length);
		}
		

		String p = "^coal";
		String s = "coaltar";
		Pattern pattern = Pattern.compile(p);
		Matcher m = pattern.matcher(s);

		if (m.find()) {
			System.out.println("1");
		} else {
			System.out.println("0");
			;
		}

		Stack<Integer> sta = new Stack<>();
		sta.add(1);
		sta.add(2);
		sta.add(3);

		Stack<Integer> st1 = new Stack<>();
		st1.add(1);
		st1.add(2);
		st1.add(3);

		System.out.println(sta);

//        sta.pop();
//        System.out.println(sta);

		for (int i = 0; i < sta.size(); i++) {
			sta.pop();
			System.out.println(sta);
			st1.pop();
			System.out.println(st1);

		}

		System.out.println(sta);

		int arr[] = { 1, 2, 3 };

		int n = arr.length;

		int r = 1;

		leftRotation(r, arr, n);

		for (int i : arr) {
			System.out.print(i);
		}
		
		
		byte b=64;
		byte y =(byte)(b<<2);
		System.out.println(y);
		
		
		Integer i=new Integer(257);
		byte t=i.byteValue();
		System.out.println(b);
		
		

        LinkedList list = new LinkedList();
        list.add(new Integer(2));
        list.add(new Integer(8));
        list.add(new Integer(5));
        list.add(new Integer(1));
        Iterator iterator = list.iterator();
        Collections.reverse(list);
    Collections.sort(list);
        while(iterator.hasNext())
        System.out.print(iterator.next() + " ");
    
		

	}

}
