package com.lisz.annotation;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class DriverTest {
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new DriverModlue());
		Driver driver = injector.getInstance(Driver.class);
		driver.drive();
	}
}
