package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Products {

	int id;
	String name;
	float price;

	public Products(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class WithStreamConcept {

	public static void main(String[] args) {

		List<Products> productsList = new ArrayList<Products>();
		// Adding Products
		productsList.add(new Products(1, "HP Laptop", 25000f));
		productsList.add(new Products(2, "Dell Laptop", 30000f));
		productsList.add(new Products(3, "Lenevo Laptop", 28000f));
		productsList.add(new Products(4, "Sony Laptop", 28000f));
		productsList.add(new Products(5, "Apple Laptop", 90000f));

		List<Float> productPriceList = new ArrayList<Float>();

		productPriceList = productsList
				.stream()
				.filter(i -> i.price > 20000.00)
				.map(p -> p.price)
				.distinct()
				.sorted()
				.limit(2)
				.collect(Collectors.toList());

		productPriceList.stream().forEach(System.out::println);


		int count = (int) productPriceList.stream().count();

		System.out.println(count);
	}

}
