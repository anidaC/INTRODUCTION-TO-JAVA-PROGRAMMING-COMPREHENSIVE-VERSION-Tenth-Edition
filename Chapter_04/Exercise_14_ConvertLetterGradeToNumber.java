import java.util.*;
/*
 * (Convert letter grade to number) Write a program that prompts the user to enter a letter grade
 * A, B, C, D, or F and displays its corresponding numeric value 4, 3, 2, 1, or 0.
 * Here is a sample run:
 * Enter a letter grade: B
 * The numeric value for grade B is 3
 * Enter a letter grade: T
 * T is an invalid grade
 *
 */

public class Exercise_14_ConvertLetterGradeToNumber {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter a letter grade: ");
		char grade = in.nextLine().toUpperCase().charAt(0);

		in.close();

		switch (grade) {
		case 'A':
			System.out.print("The numeric value for grade A is 4");
			break;
		case 'B':
			System.out.print("The numeric value for grade B is 3");
			break;
		case 'C':
			System.out.print("The numeric value for grade C is 2");
			break;
		case 'D':
			System.out.print("The numeric value for grade D is 1");
			break;
		case 'F':
			System.out.print("The numeric value for grade F is 0");
			break;

		default:
			System.out.print(grade + " is an invalid grade.");
		}
	}

}
