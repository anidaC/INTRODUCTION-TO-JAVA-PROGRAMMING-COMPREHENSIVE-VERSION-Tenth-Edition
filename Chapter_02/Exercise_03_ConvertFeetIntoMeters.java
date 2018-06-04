import java.util.*;
/*
 * (Convert feet into meters) Write a program that reads a number in feet, converts it
 * to meters, and displays the result. One foot is 0.305 meter. Here is a sample run:
 *                  Enter a value for feet: 16.5
 *                  16.5 feet is 5.0325 meters
 *
 */

public class Exercise_03_ConvertFeetIntoMeters {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a value for feet: ");
		double feet = in.nextDouble();
		in.close();

		double meters = feet * 0.305;

		System.out.print(feet + " feet is " + meters + " meters");

	}

}
