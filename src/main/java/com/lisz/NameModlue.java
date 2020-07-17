package com.lisz;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class NameModlue extends AbstractModule {
	@Override
	protected void configure() {
		bind(String.class).annotatedWith(Names.named("name")).toInstance("lisz");
	}
}
