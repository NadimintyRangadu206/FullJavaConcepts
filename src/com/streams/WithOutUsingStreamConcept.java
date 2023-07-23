package com.streams;

import java.util.ArrayList;
import java.util.List;

class Product{
	
	String name;
	int id;
	double price;
	
	public Product(String name,int id,double price) {
		
		this.name=name;
		this.id=id;
		this.price=price;
	}
	
}
public class WithOutUsingStreamConcept {

	public static void main(String[] args) {

		 Product p1= new Product("Laptop", 1, 50000.00);
		 
		Product p2= new Product("Tv", 2, 30000.00);
		
		List<Product> listOfProducts=new ArrayList<>();
		
		listOfProducts.add(p1);
		listOfProducts.add(p2);
		
		List<Double> rate= new ArrayList<Double>();
		
		for(Product p:listOfProducts) {
			
			if(p.price>40000.00) {
				rate.add(p.price);
			}
		}
		
System.out.println(rate);
	}

}
