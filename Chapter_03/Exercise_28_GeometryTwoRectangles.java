import java.util.Scanner;
/*
 * (Geometry: two rectangles) Write a program that prompts the user to enter the center x-, y-coordinates, 
 * width, and height of two rectangles and determines whether the second rectangle is inside the first or 
 * overlaps with the first, as shown in Figure 3.9. Test your program to cover all cases.
 * 
 * Enter r1's center x-, y-coordinates, width, and height: 2.5 4 2.5 43 
 * Enter r2's center x-, y-coordinates, width, and height: 1.5 5 0.5 3 
 * r2 is inside r1 
 * 
 * Enter r1's center x-, y-coordinates, width, and height: 1 2 3 5.5 
 * Enter r2's center x-, y-coordinates, width, and height: 3 4 4.5 5 
 * r2 overlaps r1
 * 
 * Enter r1's center x-, y-coordinates, width, and height: 1 2 3 3 
 * Enter r2's center x-, y-coordinates, width, and height: 40 45 3 2 
 * r2 does not overlap r1
 *
 */
public class Exercise_28_GeometryTwoRectangles {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		double width1 = in.nextDouble();
		double height1 = in.nextDouble();

		System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
		double x2 = in.nextDouble();
		double y2 = in.nextDouble();
		double width2 = in.nextDouble();
		double height2 = in.nextDouble();

		in.close();

		double distanceX, distanceY;

		if (x1 > x2) {
			distanceX = x1 - x2;
		} else {
			distanceX = x2 - x1;
		}

		if (y1 > y1) {
			distanceY = y1 - y2;
		} else {
			distanceY = y2 - y1;
		}

		if ((distanceX <= (width1 - width2) / 2) && (distanceY <= (height1 - height2) / 2)) {
			System.out.print("r2 is inside r1.");
		} else if ((distanceX <= (width1 + width2) / 2) && (distanceY <= (height1 + height2) / 2)) {
			System.out.print("r2 overlaps r1.");
		} else {
			System.out.print("r2 does not overlap r1");
		}
	}

}
