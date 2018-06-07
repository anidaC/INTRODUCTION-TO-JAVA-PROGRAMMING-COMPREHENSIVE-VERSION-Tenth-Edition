import java.util.*;
/*
 * (Sort three integers) Write a program that prompts the user to enter three integers
 * and display the integers in non-decreasing order.
 *
 */

public class Exercise_08_SortThreeIntegers {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		System.out.print("Enter three integers: ");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		
		in.close();

		if ((num1 < num2) && (num2 < num3)) {
			System.out.print("Integers in non-decreasing order are: " + num1 + " " + num2 + " " + num3);
		} else if ((num1 < num3) && (num3 < num2)) {
			System.out.print("Integers in non-decreasing order are: " + num1 + " " + num3 + " " + num2);
		} else if ((num2 < num1) && (num1 < num3)) {
			System.out.print("Integers in non-decreasing order are: " + num2 + " " + num1 + " " + num3);
		} else if ((num2 < num3) && (num3 < num1)) {
			System.out.print("Integers in non-decreasing order are: " + num2 + " " + num3 + " " + num1);
		} else if ((num3 < num1) && (num1 < num2)) {
			System.out.print("Integers in non-decreasing order are: " + num3 + " " + num1 + " " + num2);
		} else {
			System.out.print("Integers in non-decreasing order are: " + num3 + " " + num2 + " " + num1);
		}
	}

}
