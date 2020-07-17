package com.lisz;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class MyTest {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new PersonModule());
		Person person = injector.getInstance(Person.class);
		System.out.println(person);
	}
}
