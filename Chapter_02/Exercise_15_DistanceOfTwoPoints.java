import java.util.*;
/*
 * (Geometry: distance of two points) Write a program that prompts the user to enter
 * two points (x1, y1) and (x2, y2) and displays their distance between them.
 * The formula for computing the distance is root ((x2 - x1)^2 + (y2 - y1)^2). Note that
 * you can use Math.pow(a, 0.5) to compute 2a. Here is a sample run:
 *                 Enter x1 and y1: 1.5 -3.4
 *                 Enter x2 and y2: 4 5
 *                 The distance between the two points is 8.764131445842194
 *
 *formula divided
 *a = (x2 - x1)^2
 *b = (y2 - y1)^2
 *distance = root (a + b)
 */

public class Exercise_15_DistanceOfTwoPoints {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter x1 and y1: ");
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();

		System.out.println("Enter x2 and y2: ");
		double x2 = in.nextDouble();
		double y2 = in.nextDouble();

		double a = Math.pow((x2 - x1), 2);
		double b = Math.pow((y2 - y1), 2);
		double distance = Math.pow((a + b), 0.5);

		System.out.print("The distance between the two points is: " + distance);

		in.close();
	}

}
