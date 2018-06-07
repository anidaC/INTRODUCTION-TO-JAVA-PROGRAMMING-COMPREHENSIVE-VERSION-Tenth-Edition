import java.util.*;
/*
 * (Financial: compare costs) Suppose you shop for rice in two different packages.
 * You would like to write a program to compare the cost. The program prompts the
 * user to enter the weight and price of the each package and displays the one with
 * the better price. Here is a sample run:
 *                     Enter weight and price for package 1: 50 24.59
 *                     Enter weight and price for package 2: 25 11.99
 *                     Package 2 has a better price.
 *                     Enter weight and price for package 1: 50 25
 *                     Enter weight and price for package 2: 25 12.5
 *                     Two packages have the same price.        
 *
 */

public class Exercise_33_FinancialCompareCosts {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the weight and price for package 1: ");
		double weight1 = in.nextDouble();
		double price1 = in.nextDouble();
		
		System.out.print("Enter the weight and price for package 2: ");
		double weight2 = in.nextDouble();
		double price2 = in.nextDouble();
		
		in.close();

		double pricePerUnit1 = price1 / weight1;
		double pricePerUnit2 = price2 / weight2;

		if (pricePerUnit1 < pricePerUnit2) {
			System.out.println("Package 1 has a better price.");
		} else if (pricePerUnit1 > pricePerUnit2) {
			System.out.println("Package 2 has a better price.");
		} else
			System.out.println("Two packages have the same price.");

	}

}
