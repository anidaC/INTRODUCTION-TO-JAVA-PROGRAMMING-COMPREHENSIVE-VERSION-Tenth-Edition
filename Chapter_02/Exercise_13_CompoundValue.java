import java.util.Scanner;
/*
 * (Financial application: compound value) Suppose you save $100 each month
 * into a savings account with the annual interest rate 5%. Thus, the monthly interest
 * rate is 0.05/12 = 0.00417. After the first month, the value in the account becomes
 *      100 * (1 + 0.00417) = 100.417
 * After the second month, the value in the account becomes
 *      (100 + 100.417) * (1 + 0.00417) = 201.252
 * After the third month, the value in the account becomes
 *      (100 + 201.252) * (1 + 0.00417) = 302.507 and so on.
 * Write a program that prompts the user to enter a monthly saving amount and
 * displays the account value after the sixth month. (In Exercise 5.30, you will use a
 * loop to simplify the code and display the account value for any month.)
 *                Enter the monthly saving amount: 100
 *                After the sixth month, the account value is $608.81
 *
 */

public class Exercise_13_CompoundValue {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the monthly saving amount: ");
		double amount = in.nextDouble();

		final double rate = 0.00417;

		double month1 = amount * (1 + rate);
		double month2 = (amount + month1) * (1 + rate);
		double month3 = (amount + month2) * (1 + rate);
		double month4 = (amount + month3) * (1 + rate);
		double month5 = (amount + month4) * (1 + rate);
		double month6 = (amount + month5) * (1 + rate);

		System.out.print("After the sixth month, the account value is $" + (int) (month6 * 100) / 100.0);

		in.close();
	}

}
