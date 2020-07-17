package com.lisz;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

import javax.inject.Named;

public class MyTest {
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new PersonModule());
		Person person = injector.getInstance(Person.class);
		System.out.println(person);
	}
}
// 打印：Person{id=1, name='shuzheng', address=Address{number=100, street='st'}, company=Company{name='Amazon', companyAddress=Address{number=120, street='Main St.'}}}