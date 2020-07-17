package com.lisz;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.lisz.provides.Child;
import com.lisz.provides.ChildModule;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ChildTest {

	private static Child child;

	@BeforeAll
	public static void setup() {
		Injector injector = Guice.createInjector(new ChildModule());
		child = injector.getInstance(Child.class);
	}

	@Test
	public void testChild() {
		System.out.println(child);
	}
}
