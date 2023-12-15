package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<Integer>();

		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(6);

		System.out.println(arr);

		int size = arr.size();
		System.out.println(size);

		if (arr.contains(2)) {
			System.out.println("Value is Present");
		} else {
			System.out.println("Value is Not Present");
		}

		if (arr.isEmpty()) {
			System.out.println("ArrayList Empty");
		} else {
			System.out.println("ArrayList is Not Empty!");
		}

		arr.remove(3); // Give the position thats remove the position of the Element!
		System.out.println(arr);

		Collections.sort(arr);
		;
		System.out.println(arr);

		int i = arr.indexOf(6);
		System.out.println(i);

		List<Integer> list = arr.subList(1, 4);
		System.out.println(list);

		arr.set(4, 7);
		System.out.println(arr);

		// Iterations

		for (int j = 0; j < arr.size(); j++) {
			System.out.println(arr.get(j));
		}

		for (Integer i2 : arr) {
			System.out.print(i2);

		}
		System.out.print("\n");
		Iterator<Integer> it = arr.iterator();
		while (it.hasNext()) {
			System.out.print(it.next());
		}

		System.out.print("\n");

		ListIterator<Integer> listIt = arr.listIterator();
		System.out.println("ListIterator");
		while (listIt.hasNext()) {
			System.out.println(listIt.next());
		}

		arr.stream().forEach(System.out::println);

		System.out.print("\n");

		Object copy = arr.clone();
		System.out.println(copy);

		arr.ensureCapacity(i);
		System.out.print("\n");
		System.out.println("USing Spliterator Concept");
		Spliterator<Integer> split = arr.spliterator();
		split.tryAdvance(System.out::println);

		split.forEachRemaining(System.out::print);

	}

}
