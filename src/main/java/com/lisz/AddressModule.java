package com.lisz;

import com.google.inject.AbstractModule;

public class AddressModule extends AbstractModule {
	@Override
	protected void configure() {
		//super.configure();
		bind(int.class).toInstance(100);
		bind(String.class).toInstance("st");
	}
}
