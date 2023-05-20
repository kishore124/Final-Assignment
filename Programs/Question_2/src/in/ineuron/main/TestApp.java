package in.ineuron.main;

import in.ineuron.CargoPlane;

public class TestApp {

	public static void main(String[] args) {

		CargoPlane cargePlane = new CargoPlane("Airbus", "Cargo", 80000.05, 750000.22);
		System.out.println(cargePlane);
	}
}
