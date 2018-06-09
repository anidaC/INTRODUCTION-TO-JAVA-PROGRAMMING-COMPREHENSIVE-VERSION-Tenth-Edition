import java.util.*;
/*
 *  (Check SSN) Write a program that prompts the user to enter a Social Security number in the
 *  format DDD-DD-DDDD, where D is a digit. Your program should check whether the input is valid.
 *  Here are sample runs:
 *  Enter a SSN: 232-23-5435
 *  232-23-5435 is a valid social security number
 *  Enter a SSN: 23-23-5435
 *  23-23-5435 is an invalid social security number
 *
 */

public class Exercise_21_CheckSSN {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a SSN: ");
		String ssn = in.nextLine();
		
		in.close();

		if ((ssn.length() == 11)
				&& ((ssn.charAt(3) == '-' && ssn.charAt(6) == '-') && ((Character.isDigit(ssn.charAt(0)))
						&& (Character.isDigit(ssn.charAt(1))) && (Character.isDigit(ssn.charAt(2)))
						&& (Character.isDigit(ssn.charAt(4))) && (Character.isDigit(ssn.charAt(5)))
						&& (Character.isDigit(ssn.charAt(7))) && (Character.isDigit(ssn.charAt(8)))
						&& (Character.isDigit(ssn.charAt(9))) && (Character.isDigit(ssn.charAt(10)))))) {
			System.out.print(ssn + " is a valid social security number.");
		} else
			System.out.print(ssn + " is an invalid social security number.");

	}

}
