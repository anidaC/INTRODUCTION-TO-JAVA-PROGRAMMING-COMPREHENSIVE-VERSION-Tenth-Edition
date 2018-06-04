import java.util.*;
/*
 * (Geometry: area of a hexagon) Write a program that prompts the user to enter the
 * side of a hexagon and displays its area. The formula for computing the area of a
 * hexagon is
 * Area = ((3 * root 3) / 2) * s^2
 * where s is the length of a side. Here is a sample run:
 *               Enter the side: 5.5
 *               The area of the hexagon is 78.5895
 *
 */

public class Exercise_16_AreaOfAHexagon {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the side of a hexagon: ");
		double side = in.nextDouble();

		double area = (3 * (Math.pow(3, 0.5)) / 2) * (Math.pow(side, 2));

		System.out.print("The area of the hexagon is " + area);

		in.close();
	}

}
