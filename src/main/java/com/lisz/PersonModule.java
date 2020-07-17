package com.lisz;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class PersonModule extends AbstractModule {
	@Override
	protected void configure() {
		bind(Address.class).annotatedWith(Names.named("address")).toInstance(new Address(100, "st"));
		//install(new AddressModule());
		bind(Person.class).toInstance(new Person(1, "shuzheng"));
	}
}
