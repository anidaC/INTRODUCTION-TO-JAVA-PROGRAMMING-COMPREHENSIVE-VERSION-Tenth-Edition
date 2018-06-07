import java.util.*;
/*
 * Find the number of days in a month) Write a program that prompts the user
 * to enter the month and year and displays the number of days in the month. For
 * example, if the user entered month 2 and year 2012, the program should display
 * that February 2012 had 29 days. If the user entered month 3 and year 2015, the
 * program should display that March 2015 had 31 days.
 *
 */

public class Exercise_11_FindTheNumberOfdaysInAMonth {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Enter the month (number between 1 and 12): ");
		int month = in.nextInt();

		System.out.println("Enter the year: ");
		int year = in.nextInt();

		in.close();

		//if user enters incorrect numbers
		if (month < 1 || month > 12 || year < 0) {
			System.out.println(
					"Wrong input! Number for months must be between 1 and 12 and year must be positive number! ");
		} else {

			switch (month) {
			case 1:
				System.out.print("January " + year + " had/has 31 days."); //had - for years under current year
				break;                                                     //has - for years above current year
			case 2:
				if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
					System.out.print("February " + year + " had/has 29 days.");
					break;
				} else
					System.out.print("February " + year + " had/has 28 days.");
				break;
			case 3:
				System.out.print("March " + year + " had/has 31 days.");
				break;
			case 4:
				System.out.print("April " + year + " had/has 30 days.");
				break;
			case 5:
				System.out.print("May " + year + " had/has 31 days.");
				break;
			case 6:
				System.out.print("June " + year + " had/has 30 days.");
				break;
			case 7:
				System.out.print("July " + year + " had/has 31 days.");
				break;
			case 8:
				System.out.print("August " + year + " had/has 31 days.");
				break;
			case 9:
				System.out.print("Septmber " + year + " had/has 30 days.");
				break;
			case 10:
				System.out.print("October " + year + " had/has 31 days.");
				break;
			case 11:
				System.out.print("November " + year + " had/has 30 days.");
				break;
			case 12:
				System.out.print("December " + year + " had/has 31 days.");
				break;

			}
		}
	}
}