package com.lisz;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class NumberModule extends AbstractModule {
	private static Integer number = 0;

	@Override
	protected void configure() {
		bind(int.class).annotatedWith(Names.named("number")).toInstance(++number);
	}
}
