import java.util.*;
/*
 * (Financial application: calculate interest) If you know the balance and the
 * annual percentage interest rate, you can compute the interest on the next
 * monthly payment using the following formula: interest = balance *
 * (annualInterestRate/1200) Write a program that reads the balance and the
 * annual percentage interest rate and displays the interest for the next month.
 * Here is a sample run: Enter balance and interest rate (e.g., 3 for 3%): 1000
 * 3.5 The interest is 2.91667
 *
 */

public class Exercise_20_CalculateInterest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the balance: ");
		double balance = in.nextDouble();

		System.out.print("Enter the interest rate in percentage: ");
		double annualRate = in.nextDouble();

		in.close();

		double rate = annualRate / 1200;
		double interest = balance * rate;

		System.out.print("The interest is " + interest);

	}

}
