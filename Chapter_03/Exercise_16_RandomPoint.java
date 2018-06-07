/*
 *  (Random point) Write a program that displays a random coordinate in a rectangle. The rectangle 
 *  is centered at (0, 0) with width 100 and height 200.
 *
 */

public class Exercise_16_RandomPoint {

	public static void main(String[] args) {
		
		//coordinates can be positive and negative 
		int x = (int) (Math.random() * 101 * 2 - 100);
		int y = (int) (Math.random() * 201 * 2 - 200);
		
		System.out.print("Coordinates of a rectangle are: (" + x + ", " + y + ").");

	}

}
