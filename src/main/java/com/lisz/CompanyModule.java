package com.lisz;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class CompanyModule extends AbstractModule {
	@Override
	protected void configure() {
		// 有@Inject标识的，给Guice注入
		bind(Address.class).annotatedWith(Names.named("companyAddress")).toInstance(new Address(120, "Main St."));
		// 没有@Inject标识的，自己通过构造方法传入一个参数
		bind(Company.class).toInstance(new Company("Amazon"));
	}
}
