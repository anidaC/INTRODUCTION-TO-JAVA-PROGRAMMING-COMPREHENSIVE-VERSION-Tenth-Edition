import java.util.Scanner;
/*
 *  (Geometry: area of a triangle) Write a program that prompts the user to enter 
 *  three points (x1, y1), (x2, y2), (x3, y3) of a triangle and displays its area. 
 *  The formula for computing the area of a triangle is
       s = (side1 + side2 + side3)/2; 
       area =root(s - side1)(s - side2)(s - side3)
 * Here is a sample run:
 *      Enter three points for a triangle: 1.5 -3.4 4.6 5 9.5 -3.4 
 *      The area of the triangle is 33.6 
 *
 */

public class Exercise_19_AreaOfATriangle {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Enter three points of a triangle: ");
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		double x2 = in.nextDouble();
		double y2 = in.nextDouble();
		double x3 = in.nextDouble();
		double y3 = in.nextDouble();

		in.close();

		double side1 = Math.pow(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2), 0.5);
		double side2 = Math.pow(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2), 0.5);
		double side3 = Math.pow(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2), 0.5);

		double s = (side1 + side2 + side3) / 2;

		double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);

		System.out.print("The area of a triangle is " + area);
	}

}
