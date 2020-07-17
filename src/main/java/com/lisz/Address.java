package com.lisz;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.name.Named;

@Singleton
public class Address {
	private Integer number;

	private String street;

	public Address(){
		number = 10;
		street = "st";
	}

	public Address(int number, String street) {
		this.number = number;
		this.street = street;
	}

	@Override
	public String toString() {
		return "Address{" +
				"number=" + number +
				", street='" + street + '\'' +
				'}';
	}
}
