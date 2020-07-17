package com.lisz;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class StringModule extends AbstractModule {
	@Override
	protected void configure() {
		bind(String.class).annotatedWith(Names.named("name")).toInstance("lisz");
		bind(String.class).annotatedWith(Names.named("studentName")).toInstance("s1");
	}
}
