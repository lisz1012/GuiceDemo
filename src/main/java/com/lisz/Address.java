package com.lisz;

import com.google.inject.Inject;
import lombok.Data;

@Data
public class Address {
	private int number;
	private String street;

	@Inject
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
