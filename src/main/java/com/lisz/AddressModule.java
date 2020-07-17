package com.lisz;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class AddressModule extends AbstractModule {
	@Override
	protected void configure() {
		// Person的address
		bind(Address.class).annotatedWith(Names.named("address")).toInstance(new Address(100, "st"));
		// Student的address
		bind(Address.class).annotatedWith(Names.named("studentAddress")).toInstance(new Address(300, "Pike St."));
	}
}
