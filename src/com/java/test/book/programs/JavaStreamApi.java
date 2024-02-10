package com.java.test.book.programs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class JavaStreamApi {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);

		List<Integer> copyList = list.stream().map(i -> i * 5).limit(3).collect(Collectors.toList());

		list.stream().map(i -> i * 5).forEach(System.out::print);// Map

		System.out.println(copyList);

		copyList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList()).forEach(System.out::print); // filter

		long count = copyList.stream().count();
		System.out.println("\n" + count); // count
		

		List<Integer> sort = copyList.stream().sorted().collect(Collectors.toList()); // sort
		System.out.println(sort);

		List<Integer> reverse = copyList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());//ReverseOrder
		System.out.println(reverse);

		List<Integer> distinct = copyList.stream().distinct().collect(Collectors.toList());// distinct

		System.out.println(distinct);

		Optional<Integer> max = copyList.stream().max(Integer::compare);// max
		System.out.println(max.get());
		
		Optional<Integer> min= copyList.stream().min(Integer::compare);// min
		
		System.out.println(min.get());
		
		
		Integer [] arr =copyList.stream().toArray(Integer[]::new);
		
//		Stream().of(arr).forEach(System.out::println);
		
		for(int i:arr) {
			System.out.println(i);
		}
		
		
		Object[] arr1=(Object[]) list.toArray();
		
		
		for(Object i:arr1) {
			System.out.println(i);
		}
		
		
		List<String> str= new ArrayList<>();
		
		str.add("Ranga");
		str.add("Venu");
		str.add("Idrus");
		str.add("KowlutlaRanga");
		
		
		Optional<Integer> s=str.stream().map(i->i.length()).min(Integer::compare);
		System.out.println(s.get());
		
		
		StringJoiner sj= new StringJoiner(",","{","}");
		sj.add("Ranga");
		sj.add("Venu");
	
		System.out.println(sj);
		
		StringJoiner sj1= new StringJoiner(",","{","}");
		
		sj1.add("Idrus");
		sj1.add("KowlutlaRanga");
		
		System.out.println(
		sj.merge(sj1));
		
	}

}
