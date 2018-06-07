import java.util.Scanner;
/*
 * (Science: wind-chill temperature) Programming Exercise 2.17 gives a formula to compute the wind-chill temperature. 
 * The formula is valid for temperatures in the range between -58F and 41F and wind speed greater than or equal to 2. 
 * Write a program that prompts the user to enter a temperature and a wind speed. The program displays the wind-chill 
 * temperature if the input is valid; otherwise, it displays a message indicating whether the temperature and/or wind 
 * speed is invalid.
 *
 */
public class Exercise_20_ScienceWindChillTemperature {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter the temperature in Fahrenheit between -58F and 41F: ");
		double ta = in.nextDouble();

		System.out.print("Enter the wind speed (>=2) in miles per hour: ");
		double v = in.nextDouble();

		in.close();

		if (((ta > 41) || (ta < -58)) && (v < 2)) {
			System.out.print("Temperature and wind speed are invalid!");
		} else if (v < 2) {
			System.out.print("Wind speed is invalid!");
		} else if ((ta > 41) || (ta < -58)) {
			System.out.print("Temperature is invalid!");
		} else {
			
			double twc = 35.74 + (0.6215 * ta) - (35.75 * Math.pow(v, 0.16)) + 0.4275 * ta * (Math.pow(v, 0.16));
			System.out.printf("The wind chill index is: %4.5f ", twc);
		}

	}

}
