package com.lisz;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class IdModule extends AbstractModule {
	private static Integer id = 0;

	@Override
	protected void configure() {
		bind(int.class).annotatedWith(Names.named("id")).toInstance(++id);
	}
}
