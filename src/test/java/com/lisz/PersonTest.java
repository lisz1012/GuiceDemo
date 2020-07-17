package com.lisz;


import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PersonTest {
	private static Person person;

	@BeforeAll
	public static void setup() {
		Injector injector = Guice.createInjector(new PersonModule());
		person = injector.getInstance(Person.class);
	}

	@Test
	public void testPrintAddress() {
		person.printAddress();
	}
}
