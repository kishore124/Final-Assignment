package in.ineuron.main;

import java.util.Scanner;

import in.ineuron.Circle;
import in.ineuron.Triangle;

public class TestApp {

	public static void main(String[] args) {

		Scanner scanner = null;
		Double circleArea = null;
		Double circlePerimeter = null;
		Double triangelPerimeter = null;
		Double triangleArea = null;

		try {
			scanner = new Scanner(System.in);
			Circle circle = new Circle();
			Triangle triangle = new Triangle();

			System.out.println("Enter circle radius");
			double radius = scanner.nextDouble();

			circleArea = circle.area(radius);
			circlePerimeter = circle.perimeter(radius);

			// Printing Circle Details
			System.out.println("Area of circle :: " + circleArea);
			System.out.println("Perimeter of circle :: " + circlePerimeter);
			System.out.println();

			System.out.println("Enter Triangle Base ");
			double base = scanner.nextDouble();
			System.out.println("Enter Triangle Height ");
			double height = scanner.nextDouble();

			triangleArea = triangle.area(base, height);

			// Printing Area of Triangle
			System.out.println("Area of Triangle :: " + triangleArea);
			System.out.println();

			System.out.println("Enter Triangle Side 1 length");
			double side1 = scanner.nextDouble();
			System.out.println("Enter Triangle Side 2 length");
			double side2 = scanner.nextDouble();
			System.out.println("Enter Triangle Side 3 length");
			double side3 = scanner.nextDouble();

			triangelPerimeter = triangle.perimeter(side1, side2, side3);

			// Printing Perimeter of Triangle
			System.out.println("Perimeter of Triangle :: " + triangelPerimeter);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			scanner.close();
		}

	}

}
