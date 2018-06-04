import java.util.*;
/*
 * (Physics: acceleration) Average acceleration is defined as the change of velocity
 * divided by the time taken to make the change, as shown in the following formula:
 * a = (v1 - v0) / t
 * Write a program that prompts the user to enter the starting velocity v0 in meters/
 * second, the ending velocity v1 in meters/second, and the time span t in seconds,
 * and displays the average acceleration. Here is a sample run:
 *             Enter v0, v1, and t: 5.5 50.9 4.5
 *             The average acceleration is 10.0889
 *
 */

public class Exercise_09_Acceleration {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the starting velocity in meters/seconds: ");
		double v0 = in.nextDouble();

		System.out.print("Enter the ending velocity in meters/seconds: ");
		double v1 = in.nextDouble();

		System.out.print("Enter the time in seconds: ");
		double t = in.nextDouble();

		double acceleration = (v1 - v0) / t;

		System.out.print("The average acceleration is: " + acceleration);

		in.close();
	}

}
