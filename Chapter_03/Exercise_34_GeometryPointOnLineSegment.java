import java.util.Scanner;
/*
 * (Geometry: point on line segment) Programming Exercise 3.32 shows how to test whether a point is on 
 * an unbounded line. Revise Programming Exercise 3.32 to test whether a point is on a line segment. 
 * Write a program that prompts the user to enter the three points for p0, p1, and p2 and displays 
 * whether p2 is on the line segment from p0 to p1. 
 *            Here are some sample runs:
 *            Enter three points for p0, p1, and p2: 1 1 2.5 2.5 1.5 1.5 
 *            (1.5, 1.5) is on the line segment from (1.0, 1.0) to (2.5, 2.5)
 *            
 *            Enter three points for p0, p1, and p2: 1 1 2 2 3.5 3.5 
 *            (3.5, 3.5) is not on the line segment from (1.0, 1.0) to (2.0, 2.0) 
 *
 */

public class Exercise_34_GeometryPointOnLineSegment {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter three points for p0, p1, and p2: ");
		double x0 = in.nextDouble();
		double y0 = in.nextDouble();
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		double x2 = in.nextDouble();
		double y2 = in.nextDouble();

		in.close();

		boolean onLine = !(((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) > 0
				|| ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) < 0 || (x2 < x0) || (y2 < y0) || (x2 > x1)
				|| (y2 > y1));

		System.out.print("(" + x2 + ", " + y2 + ") is ");

		if (!onLine) {
			System.out.print("not ");
		}

		System.out.println("on the line segment from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");

	}

}
