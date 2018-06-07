import java.util.*;
/*
 * (Algebra: solve quadratic equations) The two roots of a quadratic equation
 * ax2 + bx + c = 0 can be obtained using the following formula:
 * r1 = (-b + root (b^2 - 4ac)) / 2a
 * r2 =  (-b - root (b^2 - 4ac)) / 2a
 * b2 - 4ac is called the discriminant of the quadratic equation. If it is positive, the
 * equation has two real roots. If it is zero, the equation has one root. If it is negative,
 * the equation has no real roots.
 * Write a program that prompts the user to enter values for a, b, and c and displays
 * the result based on the discriminant. If the discriminant is positive, display two
 * roots. If the discriminant is 0, display one root. Otherwise, display “The equation
 * has no real roots”.
 * Note that you can use Math.pow(x, 0.5) to compute 2x. Here are some sample runs:
 *                    Enter a, b, c: 1.0 3 1
 *                    The equation has two roots -0.381966 and -2.61803
 *                    Enter a, b, c: 1 2.0 1
 *                    The equation has one root -1    
 *                    Enter a, b, c: 1 2 3
 *                    The equation has no real roots   
 *
 */

public class Exercise_01_SolveQuadraticEquations {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter a, b and c: ");
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();

		in.close();

		double r1, r2, discriminant;

		discriminant = (Math.pow(b, 2)) - (4 * a * c);

		if (discriminant > 0) {

			r1 = (-b + (Math.pow(discriminant, 0.5))) / 2 * a;
			r2 = (-b - (Math.pow(discriminant, 0.5))) / 2 * a;
			System.out.printf("The equation has two roots: %1.5f and %1.5f ", r1, r2);
			
		} else if (discriminant == 0) {

			r1 = (-b + (Math.pow(discriminant, 0.5))) / 2 * a;

			System.out.print("The equation has one root: " + r1);
			
		} else {
			System.out.println("The equation has no real roots.");
			
		}

	}

}
