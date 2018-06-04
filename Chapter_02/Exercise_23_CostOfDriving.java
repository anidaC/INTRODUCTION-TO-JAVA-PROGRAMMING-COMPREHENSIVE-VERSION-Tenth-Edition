import java.util.*;
/*
 * (Cost of driving) Write a program that prompts the user to enter the distance to
 * drive, the fuel efficiency of the car in miles per gallon, and the price per gallon,
 * and displays the cost of the trip. Here is a sample run:
 *                    Enter the driving distance: 900.5
 *                    Enter miles per gallon: 25.5
 *                    Enter price per gallon: 3.55
 *                    The cost of driving is $125.36
 *
 */

public class Exercise_23_CostOfDriving {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter the driving distance: ");
		double distance = in.nextDouble();

		System.out.print("Enter miles per gallon: ");
		double miles = in.nextDouble();

		System.out.print("Enter price per gallon: ");
		double price = in.nextDouble();

		in.close();

		double distancePerGallon = distance / miles;
		double cost = distancePerGallon * price;

		System.out.print("The cost of driving is $" + (int) (cost * 100) / 100.0);

	}

}
