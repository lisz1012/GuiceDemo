package com.lisz.annotation;

import com.google.inject.AbstractModule;

public class DriverModlue extends AbstractModule {
	@Override
	protected void configure() {
		bind(Vehicle.class).annotatedWith(VehicleType.class).to(Plane.class);
	}
}
