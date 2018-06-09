import java.util.Scanner;
/*
 *  (Corner point coordinates) Suppose a pentagon is centered at (0, 0) with one point at the 0 o’clock 
 *  position, as shown in Figure 4.7c. Write a program that prompts the user to enter the radius of the 
 *  bounding circle of a pentagon and displays the coordinates of the five corner points on the pentagon. 
 *  Here is a sample run:
 *  Enter the radius of the bounding circle: 100 
 *  The coordinates of five points on the pentagon are 
 *  (95.1057, 30.9017) 
 *  (0.000132679, 100) 
 *  (-95.1056, 30.9019) 
 *  (-58.7788, -80.9015) 
 *  (58.7782, -80.902)
 *
 */

public class Exercise_07_CornerPointCoordinates {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the radius of the bounding circle: ");
		double radius = in.nextDouble();

		in.close();

		//every angle of pentagon is 108 degrees, sum of all interior angles is 540 degrees
		//every exterior angle of a pentagon is 72 degrees, and sum of all exterior angles is 360 degrees
		double alpha1 = Math.toRadians(18);    //108 - 90 = 18
		double alpha2 = Math.toRadians(90);    //108 - 18 = 90
		double alpha3 = Math.toRadians(162);   //270 - 108 = 162 ======> 540/2 = 270
		double alpha4 = Math.toRadians(234);   //162 + 72 = 234
		double alpha5 = Math.toRadians(306);   //540 - 234 = 306

		double x1 = radius * Math.cos(alpha1);
		double y1 = radius * Math.sin(alpha1);

		double x2 = radius * Math.cos(alpha2);
		double y2 = radius * Math.sin(alpha2);

		double x3 = radius * Math.cos(alpha3);
		double y3 = radius * Math.sin(alpha3);

		double x4 = radius * Math.cos(alpha4);
		double y4 = radius * Math.sin(alpha4);

		double x5 = radius * Math.cos(alpha5);
		double y5 = radius * Math.sin(alpha5);

		System.out.print("The coordinates of five points on the pentagon are: ");
		System.out.printf("\n(%4.4f, %4.4f)" , x1 , y1 );
		System.out.printf("\n(%4.4f, %4.4f)" , x2 , y2 );
		System.out.printf("\n(%4.4f, %4.4f)" , x3 , y3 );
		System.out.printf("\n(%4.4f, %4.4f)" , x4 , y4 );
		System.out.printf("\n(%4.4f, %4.4f)" , x5 , y5 );

	}

}
