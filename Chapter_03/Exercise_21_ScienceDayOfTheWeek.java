import java.util.*;
/*
 * (Science: day of the week) Zeller’s congruence is an algorithm developed by
 * Christian Zeller to calculate the day of the week. The formula is
 * h = (q + 26(m + 1)/10 + k + k/4 + j/4 + 5j) % 7
 * where
 * - h is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4:
 *   Wednesday, 5: Thursday, 6: Friday).
 * - q is the day of the month.
 * - m is the month (3: March, 4: April, …, 12: December). January and February
 *   are counted as months 13 and 14 of the previous year.
 * - j is the century (i.e.,year % 100).
 * - k is the year of the century (i.e., year % 100).
 * Note that the division in the formula performs an integer division. Write a program
 * that prompts the user to enter a year, month, and day of the month, and
 * displays the name of the day of the week. Here are some sample runs:
 *            Enter year: (e.g., 2012): 2015
 *            Enter month: 1-12: 1
 *            Enter the day of the month: 1-31: 25
 *            Day of the week is Sunday
 *            Enter year: (e.g., 2012): 2012
 *            Enter month: 1-12: 5
 *            Enter the day of the month: 1-31: 12
 *            Day of the week is Saturday 
 * (Hint: January and February are counted as 13 and 14 in the formula, so you need
 * to convert the user input 1 to 13 and 2 to 14 for the month and change the year to
 * the previous year.)    
 *
 */

public class Exercise_21_ScienceDayOfTheWeek {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		System.out.print("Enter year: (e.g., 2012): ");
		int year = in.nextInt();
		System.out.print("Enter month: 1-12: ");
		int m = in.nextInt();
		System.out.print("Enter the day of the month: 1-31: ");
		int q = in.nextInt();
		
		in.close();

		if (year < 0 || m < 1 || m > 12 || q < 1 || q > 31) {
			System.out.print("Wrong input!");
		}
		
		else {
		int h;

		
		if (m == 1) {
			int j = (year - 1) / 100;
			int k = (year - 1) % 100;
			h = (q + ((26 * 14) / 10) + k + k / 4 + j / 4 + (5 * j)) % 7;
		} else if (m == 2) {
			int j = (year - 1) / 100;
			int k = (year - 1) % 100;
			h = (q + ((26 * 15) / 10) + k + k / 4 + j / 4 + (5 * j)) % 7;
		} else {
			int j = year / 100;
			int k = year % 100;
			h = (q + (26 * (m + 1)) / 10 + k + k / 4 + j / 4 + (5 * j)) % 7;
		}

		switch (h) {
		case 0:
			System.out.print("Day of the week is Saturday");
			break;
		case 1:
			System.out.print("Day of the week is Sunday");
			break;
		case 2:
			System.out.print("Day of the week is Monday");
			break;
		case 3:
			System.out.print("Day of the week is Tuesday");
			break;
		case 4:
			System.out.print("Day of the week is Wednesday");
			break;
		case 5:
			System.out.print("Day of the week is Thursday");
			break;
		case 6:
			System.out.print("Day of the week is Friday");
			break;
		}

	}
	}
}
