import java.util.Scanner;
/*
 *  (Geometry: area of a regular polygon) A regular polygon is an n-sided polygon in which all 
 *  sides are of the same length and all angles have the same degree (i.e., the polygon is both 
 *  equilateral and equiangular). The formula for computing the area of a regular polygon is
 *  Area = (n * s^2) / (4 * tan(p/n)
 *  Here, s is the length of a side. Write a program that prompts the user to enter the number 
 *  of sides and their length of a regular polygon and displays its area. Here is a sample run:
 *  Enter the number of sides: 5 
 *  Enter the side: 6.5 
 *  The area of the polygon is 74.69017017488385
 *
 */

public class Exercise_05_GeometryAreaOfARegularPolygon {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		final double pi = Math.PI;

		System.out.print("Enter the number of sides: ");
		int n = in.nextInt();

		System.out.print("Enter the lenght of sides: ");
		double s = in.nextDouble();

		in.close();

		double area = (n * Math.pow(s, 2)) / (4 * (Math.tan(pi / n)));
		System.out.print("The area of the polygon is " + area);

	}

}
