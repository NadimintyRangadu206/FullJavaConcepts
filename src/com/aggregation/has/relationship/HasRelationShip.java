package com.aggregation.has.relationship;

import java.util.ArrayList;
import java.util.List;

class Address {

	int addressId;
	String country;
	String state;
	String stateOfCapital;

	public Address(int addressId, String country, String state, String stateOfCapital) {

		this.addressId = addressId;
		this.country = country;
		this.state = state;
		this.stateOfCapital = stateOfCapital;
	}

}

class Employee {

	int id;
	String name;
	Double salary;
	String department;
	List<Address> address;

	public Employee(int id, String name, Double salary, String department, List<Address> address) {

		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
		this.address = address;
	}

	public void display() {

		Address d= new Address(id, department, name, department);

			System.out.println(id + "\n" + name + "\n" + salary + "\n" + department + "\n" + d.addressId + "\n"
					+ d.country + "\n" + d.state + "\n" + d.stateOfCapital);
		
	}

}

public class HasRelationShip {

	public static void main(String[] args) {
		Address d = new Address(1, "India", "Telangana", "Hyderabad");
		Address d1 = new Address(1, "India", "Telangana", "Hyderabad");
		List<Address> listOfAddresses = new ArrayList<Address>();
		listOfAddresses.add(d);
		listOfAddresses.add(d1);
		
		

		Employee e = new Employee(1, "Ranga", 20000.00, "Java Developer", listOfAddresses);
		e.display();
	}

}
