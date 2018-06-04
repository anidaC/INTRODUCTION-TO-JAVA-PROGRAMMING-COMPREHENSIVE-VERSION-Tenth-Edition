import java.util.*;
/*
 * (Financial application: calculate future investment value) Write a program that
 * reads in investment amount, annual interest rate, and number of years, and displays
 * the future investment value using the following formula:
 * futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)^numberOfYears*12
 * For example, if you enter amount 1000, annual interest rate 3.25%, and number
 * of years 1, the future investment value is 1032.98.
 * Here is a sample run:
 *                      Enter investment amount: 1000.56
 *                      Enter annual interest rate in percentage: 4.25
 *                      Enter number of years: 1
 *                      Accumulated value is $1043.92
 *
 */

public class Exercise_21_CalculateFutureInvestmentValue {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter investment amount: ");
		double investmentAmount = in.nextDouble();
		
		System.out.print("Enter annual ineterst rate in percentage: ");
		double monthlyInterestRate = in.nextDouble();
		
		System.out.print("Enter number of years: ");
		int numberOfYears = in.nextInt();
		
		in.close();

		double rate = monthlyInterestRate / 1200;
		double futureInvestmentValue = investmentAmount * (Math.pow((1 + rate), numberOfYears * 12));

		System.out.print("Accumulated value is $" + (int) (futureInvestmentValue * 100) / 100.0);

	}

}
