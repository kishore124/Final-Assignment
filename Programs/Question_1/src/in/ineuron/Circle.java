package in.ineuron;

public class Circle implements IShape {

	private Double pi = 3.1415926;

	@Override
	public Double area(Double... radius) {

		return pi * radius[0] * radius[0];
	}

	@Override
	public Double perimeter(Double... radius) {
		return 2 * pi * radius[0];
	}

}
