package com.lisz;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import lombok.Data;

// Student类用来测试 @Inject 写在构造方法上的情况
@Data
public class Student {
	private int id;
	private String name;
	private Address address;
	private School school;

	@Inject
	public Student(@Named("studentId") int id,
	               @Named("studentName") String name,
	               @Named("studentAddress") Address address,
	               School school) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.school = school;
	}

	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", name='" + name + '\'' +
				", address=" + address +
				", school=" + school +
				'}';
	}
}
