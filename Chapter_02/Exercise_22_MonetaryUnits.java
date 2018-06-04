import java.util.Scanner;
/*
 * (Financial application: monetary units) Rewrite Listing 2.10, ComputeChange .java, 
 * to fix the possible loss of accuracy when converting a double value to an int value. 
 * Enter the input as an integer whose last two digits represent the cents. For example, 
 * the input 1156 represents 11 dollars and 56 cents. 
 *
 */

public class Exercise_22_MonetaryUnits {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter an amount as an integer whose last two digits represent the cents, for example 1156: ");
		int amount = in.nextInt();

		int numberOfOneDollars = amount / 100;
		int remainingAmount = amount % 100;

		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;

		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;

		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;

		int numberOfPennies = remainingAmount;

		System.out.println("Your amount " + amount + " consists of");
		System.out.println(numberOfOneDollars + " dollars");
		System.out.println(numberOfQuarters + " quarters ");
		System.out.println(numberOfDimes + " dimes");
		System.out.println(numberOfNickels + " nickels");
		System.out.println(numberOfPennies + " pennies");

		in.close();
	}

}
