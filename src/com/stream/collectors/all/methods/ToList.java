package com.stream.collectors.all.methods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ToList {

	public static void main(String[] args) {

		List<String> cities = new ArrayList<>();

		cities.add("Hyderabad");
		cities.add("Bangalore");
		cities.add("Vizag");
		cities.add("Pune");
		cities.add("Chennai");
		cities.add("Mumbai");
		cities.add("Delhi");

//		List<String> copy= new ArrayList<String>();
//		
//		

		System.out.println("ToList");

		cities.stream().sorted().distinct().collect(Collectors.toList()).forEach(System.out::println);

		System.out.println("Set Interface");

		cities.stream().collect(Collectors.toSet()).forEach(System.out::println);

		System.out.println("ToCollecton");

		cities.stream().collect(Collectors.toCollection(HashSet::new)).forEach(System.out::println);

		System.out.println("ToCountingElements");

		Long count = cities.stream().collect(Collectors.counting());
		System.out.println(count);

		System.out.println("Max && Min Order Based On index");

		Optional<String> value = cities.stream().collect(Collectors.minBy(Comparator.comparing(x->x.length())));

		if (value.isPresent()) {
			String v = value.get();
			System.out.println(v);
		} else {
			System.out.println("Not Matching");
		}

		System.out.println("JOining");

		String join = cities.stream().collect(Collectors.joining(",", "{", "}"));
		System.out.print(join);

		System.out.println("Converting List to Map");

		Map<String, Integer> map = new HashMap<>();

		map = cities.stream().collect(Collectors.toMap(Function.identity(), String::length));

		System.out.println("\n" + map);
		
		
		System.out.println("Using SummingInt");

		int length = cities.stream().collect(Collectors.summingInt(String::length));

		System.out.println(length);
	}

}
