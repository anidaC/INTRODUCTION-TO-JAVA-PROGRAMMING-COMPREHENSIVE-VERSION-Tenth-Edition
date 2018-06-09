import java.util.*;
/*
 *  (Order three cities) Write a program that prompts the user to enter three cities and displays
 *  them in ascending order. Here is a sample run:
 *  Enter the first city: Chicago
 *  Enter the second city: Los Angeles
 *  Enter the third city: Atlanta
 *  The three cities in alphabetical order are: Atlanta Chicago Los Angeles
 *
 */

public class Exercise_24_OrderThreeCities {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the first city: ");
		String s1 = in.nextLine();
		System.out.print("Enter the second city: ");
		String s2 = in.nextLine();
		System.out.print("Enter the third city: ");
		String s3 = in.nextLine();
		in.close();

		if ((s3.compareTo(s1) > 0) && (s3.compareTo(s2) > 0) && (s2.compareTo(s1) > 0)) {
			System.out.println("The three cities in alphabetical order are: " + s1 + ", " + s2 + ", " + s3 + ".");
		} else if ((s3.compareTo(s1) > 0) && (s2.compareTo(s1) > 0) && (s1.compareTo(s2) > 0)) {
			System.out.println("The three cities in alphabetical order are: " + s2 + ", " + s1 + ", " + s3 + ".");
		} else if ((s2.compareTo(s1) > 0) && (s2.compareTo(s3) > 0) && (s3.compareTo(s1) > 0)) {
			System.out.println("The three cities in alphabetical order are: " + s1 + ", " + s3 + ", " + s2 + ".");
		} else if ((s2.compareTo(s1) > 0) && (s2.compareTo(s3) > 0) && (s1.compareTo(s3) > 0)) {
			System.out.println("The three cities in alphabetical order are: " + s3 + ", " + s1 + ", " + s2 + ".");
		} else if ((s1.compareTo(s2) > 0) && (s1.compareTo(s3) > 0) && (s3.compareTo(s2) > 0)) {
			System.out.println("The three cities in alphabetical order are: " + s2 + ", " + s3 + ", " + s1 + ".");
		} else {
			System.out.println("The three cities in alphabetical order are: " + s3 + ", " + s2 + ", " + s1 + ".");
		}

	}

}
