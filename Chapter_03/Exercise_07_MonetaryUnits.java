import java.util.Scanner;
/*
 * (Financial application: monetary units) Modify Listing 2.10, ComputeChange .java, to display the nonzero 
 * denominations only, using singular words for single units such as 1 dollar and 1 penny, and plural words 
 * for more than one unit such as 2 dollars and 3 pennies.
 *
 */

public class Exercise_07_MonetaryUnits {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter amount: (For example 11.56): ");
		double amount = in.nextDouble() * 100;

		in.close();

		int dollars = (int) amount / 100;
		int pennies = (int) amount % 100;

		if (amount <= 0) {
			System.out.print("Wrong input!");
		}
		if (dollars == 1 && pennies == 1) {
			System.out.print(dollars + " dollar and " + pennies + " penny.");
		}

		if (dollars == 1 && pennies > 1) {
			System.out.print(dollars + " dollar and " + pennies + " pennies.");
		}

		if (dollars > 1 && pennies == 1) {
			System.out.print(dollars + " dollars and " + pennies + " penny.");
		}
		if (dollars > 1 && pennies > 1) {
			System.out.print(dollars + " dollars and " + pennies + " pennies.");
		}
		if (dollars == 0 && pennies == 1) {
			System.out.print(pennies + " penny.");
		}
		if (dollars == 0 && pennies > 1) {
			System.out.print(pennies + " pennies.");
		}
		if (dollars == 1 && pennies == 0) {
			System.out.print(dollars + " dollar.");
		}
		if (dollars > 1 && pennies == 0) {
			System.out.print(dollars + " dollars.");
		}

	}

}
