package com.lisz.provides;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

import java.util.Random;

public class ChildModule extends AbstractModule {
	@Provides
	public int provideId() {
		// ID 返回一个100以内的随机数
		return new Random().nextInt(100);
	}

	@Provides
	public String provideName() {
		return "I'm a child";
	}

	@Provides
	public Cat provideCat(){
		return new Cat("Tom", "yellow");
	}

	@Provides
	public Dog provideDog() {
		return new Dog(2.3, "Big");
	}
}