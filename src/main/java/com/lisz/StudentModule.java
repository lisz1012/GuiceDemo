package com.lisz;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;


public class StudentModule extends AbstractModule {
	@Override
	protected void configure() {
		install(new AddressModule());
		// School对象只有一个单例，且存在默认构造方法，全部默认无歧义注入，无需SchoolModule
		// install(new SchoolModule());
		install(new IntegerModule());
		install(new StringModule());
		bind(Student.class); //所有属性均无歧义，只有一种可能，这时不写
	}
}
