package in.ineuron;

public class Triangle implements IShape {

	@Override
	public Double area(Double... args) {

		return 0.5 * args[0] * args[1];
	}

	@Override
	public Double perimeter(Double... args) {
		return args[0] + args[1] + args[2];
	}

}
