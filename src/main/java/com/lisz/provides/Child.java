package com.lisz.provides;

import com.google.inject.Inject;

public class Child {
	@Inject
	private int id;
	@Inject
	private String name;
	@Inject
	private Cat cat;
	@Inject
	private Dog dog;

	@Override
	public String toString() {
		return "Child{" +
				"id=" + id +
				", name='" + name + '\'' +
				", cat=" + cat +
				", dog=" + dog +
				'}';
	}
}
