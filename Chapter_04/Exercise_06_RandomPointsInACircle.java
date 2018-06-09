/*
 *  (Random points on a circle) Write a program that generates three random points on a circle 
 *  centered at (0, 0) with radius 40 and display three angles in a triangle formed by these 
 *  three points, as shown in Figure 4.7a. (Hint: Generate a random angle a in radians between 0 
 *  and 2p, as shown in Figure 4.7b and the point determined by this angle is (r*cos(a), r*sin(a)).)
 *
 */

public class Exercise_06_RandomPointsInACircle {

	public static void main(String[] args) {
		
		final int radius = 40;
		
		// first point
		double randomAngle = Math.random() * 2 * Math.PI;
		double x = radius * Math.cos(randomAngle);
		double y = radius * Math.sin(randomAngle);
		
		System.out.println("First point: (" + x + ", " + y + ")");
		
		// second point
		randomAngle = Math.random() * 2 * Math.PI;
		x = radius * Math.cos(randomAngle);
		y = radius * Math.sin(randomAngle);
		
		System.out.println("Second point: (" + x + ", " + y + ")");
		
		// third point
		randomAngle = Math.random() * 2 * Math.PI;
		x = radius * Math.cos(randomAngle);
		y = radius * Math.sin(randomAngle);
		
		System.out.print("Third point: (" + x + ", " + y + ")");

	}

}
