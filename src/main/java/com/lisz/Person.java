package com.lisz;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.name.Named;

@Singleton
public class Person {
	private int id;

	private String name;

	@Inject
	@Named("address")
	private Address address;

	@Inject
	private Company company;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void printAddress() {
		System.out.println(address);
	}

	public void printCompany() {
		System.out.println(company);
	}

	//	public Person() {
//		id = 2;
//		name = "aaa";
//		address = new Address(200, "st1");
//	}


	@Override
	public String toString() {
		return "Person{" +
				"id=" + id +
				", name='" + name + '\'' +
				", address=" + address +
				", company=" + company +
				'}';
	}
}
