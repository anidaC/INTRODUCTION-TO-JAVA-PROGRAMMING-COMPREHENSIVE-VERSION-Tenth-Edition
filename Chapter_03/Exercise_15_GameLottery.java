import java.util.*;
/*
 * (Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a
 * three-digit number. The program prompts the user to enter a three-digit number
 * and determines whether the user wins according to the following rules:
 * 1. If the user input matches the lottery number in the exact order, the award is $10,000. 
 * 2. If all digits in the user input match all digits in the lottery number, the award is $3,000. 
 * 3. If one digit in the user input matches a digit in the lottery number, the award is $1,000.
 *
 */

public class Exercise_15_GameLottery {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		// generate number between 100 and 999
		int lottery = 532;

		System.out.println("Enter a three digit number: ");
		int number = in.nextInt();

		in.close();

		// check user's number, is it a three-digit number
		int length = (int) (Math.log10(number));

		if (length < 2 || length > 2) {
			System.out.print("Wrong input! You must enter three-digit number!");
		}

		else {

			int num1 = number / 100;
			int num2 = number / 10 % 10;
			int num3 = number % 10;

			int lott1 = lottery / 100;
			int lott2 = lottery / 10 % 10;
			int lott3 = lottery % 10;

			if (number == lottery) {
				System.out.println("Lottery number is " + lottery + ". Congrats! You won $10,000!");
			} else if ((num1 == lott1 || num1 == lott2 || num1 == lott3)
					&& (num2 == lott1 || num2 == lott2 || num2 == lott3)
					&& (num3 == lott1 || num3 == lott2 || num3 == lott3)) {
				System.out.println(
						"Lottery number is " + lottery + ". Your number matches all digits. Congrats! You won $3,000!");
			} else if ((num1 == lott1) || (num1 == lott2) || (num1 == lott3) || (num2 == lott1) || (num2 == lott2)
					|| (num2 == lott3) || (num3 == lott1) || (num3 == lott2) || (num3 == lott3)) {
				System.out.println("Lottery number is " + lottery
						+ ". Your number matches one or two digits. Congrats! You won $1,000!");
			} else
				System.out.println("Lottery number is " + lottery + ". Sorry, you haven't guess any of numbers! :(");

		}
	}

}
