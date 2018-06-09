import java.util.Scanner;
/*
 *  (Geometry: area of a hexagon) The area of a hexagon can be computed using the following formula 
 *  (s is the length of a side): 
 *  Area = (6 * s^2)/ ( 4 * tan(pi/6) 
 *  Write a program that prompts the user to enter the side of a hexagon and displays its area. 
 *  Here is a sample run:
 *  Enter the side: 5.5 
 *  The area of the hexagon is 78.59
 *
 */

public class Exercise_04_GeometryAreaOfAHexagon {

	public static void main(String[] args) {

		final double pi = Math.PI;

		Scanner in = new Scanner(System.in);

		System.out.print("Enter the side: ");
		double s = in.nextDouble();

		in.close();

		double area = (6 * Math.pow(s, 2)) / (4 * (Math.tan(pi / 6)));

		System.out.printf("The area of the hexagon is %4.2f", area);

	}

}
