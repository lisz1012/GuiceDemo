package com.lisz.provides;

public class Dog {
	private double height;
	private String breed;

	public Dog(double height, String breed) {
		this.height = height;
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Dog{" +
				"height=" + height +
				", breed='" + breed + '\'' +
				'}';
	}
}
