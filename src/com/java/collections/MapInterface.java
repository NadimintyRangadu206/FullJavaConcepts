package com.java.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class MapInterface {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Hyderabad");
		map.put(2, "Vizag");
		map.put(3, "Bangalore");
		map.put(4, "Chennai");
		map.put(5, "Kochi");

		System.out.println(map);
		System.out.println(map.size());

		map.remove(4);
		System.out.println(map);

		if (map.containsKey(3)) {
			System.out.println(map.keySet() + "," + map.values());
		} else {
			System.out.println("Key is not present in the map!");
		}

		if (map.containsValue("Hyderabad")) {
			System.out.println(map.values());
		} else {
			System.out.println("Value is not Present!");
		}

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		Set<Integer> set = map.keySet();
		List<Integer> copy = set.stream().collect(Collectors.toList());
		if (list.equals(copy)) {
			System.out.println("Key is Equal");
		} else {
			System.out.println("Not Key is Present");
		}

		map.replace(5, "pune");
		System.out.println(map);

		map.replace(5, "pune", "Kochin");
		System.out.println(map);

		System.out.println("\n");
		for (int i = 0; i <= map.size(); i++) {
			System.out.println(map.getOrDefault(i, null));
		}

		Set s = map.entrySet();

		Iterator it = s.iterator();

		while (it.hasNext()) {
			Map.Entry<Integer, String> entry = (Entry<Integer, String>) it.next();
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}

		System.out.println("\n");

		for (Map.Entry entry : map.entrySet()) {

			System.out.println(entry.getKey() + "--" + entry.getValue());
		}
		System.out.println("Stream Concept:" + "\n");

		// ASC Order--> Comparing Key

		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println("\n");

		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

		System.out.println("\n");

		// DESC Order --> Comparing Key

		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
				.forEach(System.out::println);

		System.out.println("\n");

		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.forEach(System.out::println);
		System.out.println("\n");

	}

}
