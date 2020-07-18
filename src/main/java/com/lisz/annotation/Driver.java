package com.lisz.annotation;

import com.google.inject.Inject;

public class Driver {

	private Vehicle vehicle;

	@Inject
	public Driver(@VehicleType Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void drive() {
		vehicle.run();
	}
}
