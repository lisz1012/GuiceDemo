package com.lisz;

import com.google.inject.Inject;
import lombok.Data;

@Data
public class Person {
	private int id;
	private String name;
	private Address address;

	@Inject
	public Person(Address address) { // int id, String name,
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person{" +
				"id=" + id +
				", name='" + name + '\'' +
				", address=" + address +
				'}';
	}
}
