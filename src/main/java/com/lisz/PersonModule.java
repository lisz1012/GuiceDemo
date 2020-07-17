package com.lisz;

import com.google.inject.AbstractModule;
import com.google.inject.name.Named;
import com.google.inject.name.Names;

public class PersonModule extends AbstractModule {
	@Override
	protected void configure() {
		install(new AddressModule());
		install(new CompanyModule());
		bind(Company.class).toInstance(new Company("Amazon"));
		bind(Person.class).toInstance(new Person(1, "shuzheng"));
	}
}
