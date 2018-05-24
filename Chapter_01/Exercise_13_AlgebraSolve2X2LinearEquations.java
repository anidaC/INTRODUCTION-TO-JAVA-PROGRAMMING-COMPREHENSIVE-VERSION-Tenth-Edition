/*
 * (Algebra: solve 2 * 2 linear equations) You can use Cramer’s rule to solve the following
 * 2 * 2 system of linear equation:
      ax + by = e
      cx + dy = f
            x = (ed - bf) / (ad - bc)
            y = (af - ec) / (ad - bc)
 * Write a program that solves the following equation and displays the value for x and y:
  3.4x + 50.2y = 44.5
  2.1x + .55y = 5.9
 *
 */
public class Exercise_13_AlgebraSolve2X2LinearEquations {

	public static void main(String[] args) {
		
		double a = 3.4;
		double b = 50.2;
		double e = 44.5;
		double c = 2.1;
		double d = 0.55;
		double f = 5.9;
		
		double x, y;
		x = ((e * d) - (b * f)) / ((a * d) - (b * c));
		y = ((a * f) - (e * c)) / ((a * d) - (b * c));
		

		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println(a * x + b* y + " = " + e);
		System.out.print(c * x + d * y + " = " + f);
	}

}
