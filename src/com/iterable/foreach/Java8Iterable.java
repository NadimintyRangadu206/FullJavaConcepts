package com.iterable.foreach;

import java.util.ArrayList;
import java.util.List;

public class Java8Iterable {

	public static void main(String[] args) {

		List<String> gamesList = new ArrayList<String>();

		gamesList.add("Football");
		gamesList.add("Cricket");
		gamesList.add("Chess");
		gamesList.add("Hocky");

		gamesList.forEach(p -> System.out.println(p)); // lambda Expression

		gamesList.forEach(System.out::println); // method reference

		gamesList.stream().forEach(d -> System.out.println(d)); // with stream

		gamesList.stream().forEach(System.out::println); // 2 method reference

	}

}
