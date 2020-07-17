package com.lisz;

import com.google.inject.AbstractModule;
import com.google.inject.name.Named;
import com.google.inject.name.Names;

public class PersonModule extends AbstractModule {
	@Override
	protected void configure() {
		/*
		 成员变量分成两部分：1. 带有@Inject标识的 2. 没有@Inject标识的
		 */

		// 有@Inject标识的属性，由Guice注入. install就是把参数对象中的bind()封装一下导入到这里来,
		// 各个install展开之后就是一堆bind，所以bind的位置可以比较灵活
		install(new AddressModule());
		install(new CompanyModule());

		// 成员变量如果不全是被 @Inject 标识的，无@Inject的属性要写一个构造方法，
		// 然后传参数初始化非@Inject属性，而把@Inject属性留给Guice注入
		bind(Person.class).toInstance(new Person(1, "shuzheng"));
	}
}
