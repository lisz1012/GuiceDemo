package com.lisz;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class CompanyModule extends AbstractModule {
	@Override
	protected void configure() {
		bind(Address.class).annotatedWith(Names.named("companyAddress")).toInstance(new Address(120, "Main St."));
	}
}
