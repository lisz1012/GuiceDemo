package com.lisz;

import com.google.inject.AbstractModule;

public class PersonModule extends AbstractModule {
	@Override
	protected void configure() {
		bind(Address.class).toInstance(new Address(100, "st"));
	}
}
