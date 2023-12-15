package com.java.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {

	public static void main(String[] args) {
		
		List<Integer> linkedList=new LinkedList<>();
	
		linkedList.add(100);
		linkedList.add(400);
		linkedList.add(600);
		linkedList.add(200);
		linkedList.add(150);
		linkedList.add(300);

		int index=linkedList.indexOf(300);
		System.out.println(index);
		
		int lastIndex=linkedList.lastIndexOf(linkedList.size()-1);
		System.out.println(lastIndex);
	}

}
