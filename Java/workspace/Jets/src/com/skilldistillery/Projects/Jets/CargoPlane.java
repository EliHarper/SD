package com.skilldistillery.Projects.Jets;

import java.util.ArrayList;

public class CargoPlane extends Jet implements CargoCarrier {
	
	public CargoPlane(String model, double speed, long price, int range) {
		super(model, speed, price, range);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void loadCargo() {
		System.out.println(this.getModel() + " loaded and ready to go.");
	}
	
	public void fly() {
	}
	
}
