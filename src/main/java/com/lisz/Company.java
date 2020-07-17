package com.lisz;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.name.Named;

@Singleton
public class Company {
	private String name;

	@Inject
	@Named("companyAddress")
	private Address address;

	public Company(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Company{" +
				"name='" + name + '\'' +
				", companyAddress=" + address +
				'}';
	}
}
