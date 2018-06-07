import java.util.*;
/*
 * (Compute the perimeter of a triangle) Write a program that reads three edges for
 * a triangle and computes the perimeter if the input is valid. Otherwise, display that
 * the input is invalid. The input is valid if the sum of every pair of two edges is
 * greater than the remaining edge.
 *
 */

public class Exercise_19_ComputeThePerimeterOfATriangle {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter the first edge: ");
		double a = in.nextDouble();
		System.out.print("Enter the second edge: ");
		double b = in.nextDouble();
		System.out.print("Enter the third edge: ");
		double c = in.nextDouble();
		
		in.close();

		double sum = a + b + c;

		if (((a + b) > c) && ((a + c) > b) && ((b + c) > a)) {
			System.out.print("The perimeter of a triangle is " + sum);
		} else
			System.out.print("The input is invalid!");

	}

}
