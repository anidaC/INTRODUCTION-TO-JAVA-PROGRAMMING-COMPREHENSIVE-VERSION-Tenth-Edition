import java.util.Scanner;
/*
 * (Compute the volume of a cylinder) Write a program that reads in the radius and length of a cylinder 
 * and computes the area and volume using the following formulas:
           area = radius * radius * p 
           volume = area * length
 * Here is a sample run:
 * Enter the radius and length of a cylinder: 5.5 12 
 * The area is 95.0331 
 * The volume is 1140.4
 *
 */

public class Exercise_02_ComputeTheVolumeOfACylinder {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		double area, volume, radius, length;
		final double pi = Math.PI;

		System.out.print("Enter the radius of a cylinder: ");
		radius = in.nextDouble();

		System.out.print("Enter the length of a cylinder: ");
		length = in.nextDouble();

		area = radius * radius * pi;
		volume = area * length;

		System.out.println("The area is: " + area);
		System.out.print("The volume is: " + volume);

		in.close();
	}

}
