package com.lisz;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class AddressModule extends AbstractModule {
	@Override
	protected void configure() {
		bind(Address.class).annotatedWith(Names.named("address")).toInstance(new Address(100, "st"));
	}
}
