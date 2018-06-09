import java.util.*;
/*
 * (Days of a month) Write a program that prompts the user to enter a year and the first three
 *  letters of a month name (with the first letter in uppercase) and displays the number of days
 *  in the month. Here is a sample run:
 *  Enter a year: 2001
 *  Enter a month: Jan
 *  Jan 2001 has 31 days
 *  Enter a year: 2016
 *  Enter a month: Feb
 *  Jan 2016 has 29 days
 *
 */

public class Exercise_17_DaysOfAMonth {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter a year: ");
		int year = in.nextInt();

		System.out.println("Enter the first three letters of a month (with the first letter in uppercase): ");
		String month = in.next();

		in.close();
			
				switch (month) {
				case "Jan":
					System.out.print("January " + year + " had/has 31 days.");
					break;
				case "Feb":
					if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
						System.out.print("February " + year + " had/has 29 days.");
					} else
						System.out.print("February " + year + " had/has 28 days.");
					break;
				case "Mar":
					System.out.print("March " + year + " had/has 31 days.");
					break;
				case "Apr":
					System.out.print("April " + year + " had/has 30 days.");
					break;
				case "May":
					System.out.print("May " + year + " had/has 31 days.");
					break;
				case "Jun":
					System.out.print("June " + year + " had/has 30 days.");
					break;
				case "Jul":
					System.out.print("July " + year + " had/has 31 days.");
					break;
				case "Aug":
					System.out.print("August " + year + " had/has 31 days.");
					break;
				case "Sep":
					System.out.print("Septmber " + year + " had/has 30 days.");
					break;
				case "Oct":
					System.out.print("October " + year + " had/has 31 days.");
					break;
				case "Nov":
					System.out.print("November " + year + " had/has 30 days.");
					break;
				case "Dec":
					System.out.print("December " + year + " had/has 31 days.");
					break;
					
					default: 
						System.out.print("Wrong input! "
								+ "\nYou must enter the first three letters of a month (with the first letter in uppercase)! ");
		}
			  
	}

}
