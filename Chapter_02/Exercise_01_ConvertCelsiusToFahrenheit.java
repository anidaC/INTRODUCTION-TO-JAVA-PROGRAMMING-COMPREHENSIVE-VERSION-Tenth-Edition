import java.util.*;
/*
 * (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in
 * a double value from the console, then converts it to Fahrenheit and displays the
 * result. The formula for the conversion is as follows:
 * fahrenheit = (9 / 5) * celsius + 32
 * Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8.
 * Here is a sample run:
 *                         Enter a degree in Celsius: 43
 *                         43 Celsius is 109.4 Fahrenheit
 *
 */

public class Exercise_01_ConvertCelsiusToFahrenheit {

	public static void main(String[] args) {

		// create Scanner
		Scanner in = new Scanner(System.in);

		// ask user for input
		System.out.print("Enter a degree in Celsius: ");
		double celsius = in.nextDouble();

		// convert Celsius to Fajrenheit
		double Fahrenheit = (9.0 / 5) * celsius + 32;

		// display result
		System.out.print(celsius + " Celsius is " + Fahrenheit + " Fahrenheit");

		// close Scanner
		in.close();
	}

}
