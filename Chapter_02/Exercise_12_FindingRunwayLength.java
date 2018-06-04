import java.util.*;
/*
 * (Physics: finding runway length) Given an airplane’s acceleration a and take-off
 * speed v, you can compute the minimum runway length needed for an airplane to
 * take off using the following formula:
 * length = (v^2) / 2a
 * Write a program that prompts the user to enter v in meters/second (m/s) and the
 * acceleration a in meters/second squared (m/s2), and displays the minimum runway
 * length. Here is a sample run:
 *               Enter speed and acceleration: 60 3.5
 *               The minimum runway length for this airplane is 514.286
 *
 */

public class Exercise_12_FindingRunwayLength {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the speed in meters/seconds: ");
		double v = in.nextDouble();

		System.out.print("Enter the acceleration in meters/seconds^2: ");
		double a = in.nextDouble();

		double length = (v * v) / (2 * a);

		System.out.print("The minimum runway lenght for this airplane is: " + (int) (length * 1000) / 1000.0);

		in.close();

	}

}
