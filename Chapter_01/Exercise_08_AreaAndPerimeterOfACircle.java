/*
 * (Area and perimeter of a circle) Write a program that displays the area and perimeter
 * of a circle that has a radius of 5.5 using the following formula:
 * perimeter = 2 * radius * pi
 * area = radius * radius * pi
 *
 */
public class Exercise_08_AreaAndPerimeterOfACircle {

	public static void main(String[] args) {

		double pi, radius, area, perimeter;

		pi = 3.141592653589793;
		radius = 5.5;

		perimeter = 2 * radius * pi;
		area = radius * radius * pi;

		System.out.println("Perimeter of a circle with a radius of " + radius + " is " + perimeter);
		System.out.print("Area of a circle with a radius of " + radius + " is " + area);

	}

}
