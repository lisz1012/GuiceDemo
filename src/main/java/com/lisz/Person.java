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

	// 注意：构造方法这里，要把需要Inject的成员变量排除出去。IntelliJ代码生成的时候不会有Inject属性的生成提示
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
