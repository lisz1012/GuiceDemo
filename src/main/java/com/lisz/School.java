package com.lisz;

import com.google.inject.Singleton;

@Singleton
public class School {
	private int number;
	private String name;

	public School() {
		number = 1;
		name = "中学";
	}

	@Override
	public String toString() {
		return "School{" +
				"number=" + number +
				", name='" + name + '\'' +
				'}';
	}
}
