import java.util.*;
/*
 * (Find the number of years) Write a program that prompts the user to enter the
 * minutes (e.g., 1 billion), and displays the number of years and days for the minutes.
 * For simplicity, assume a year has 365 days. Here is a sample run:
 *               Enter the number of minutes: 1000000000
 *               1000000000 minutes is approximately 1902 years and 214 days
 *
 */

public class Exercise_07_FindTheNumberOfYears {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the number of minutes: ");
		long minutes = in.nextLong();

		int years = (int) minutes / 60 / 24 / 365;
		int days = (int) minutes / 60 / 24 % 365;

		System.out.print(minutes + " minutes is approximately " + years + " years and " + days + " days.");

		in.close();
	}

}
