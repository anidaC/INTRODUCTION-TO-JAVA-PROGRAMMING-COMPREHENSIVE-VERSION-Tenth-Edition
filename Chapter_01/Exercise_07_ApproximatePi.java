/*
 * (Approximate Pi) pi can be computed using the following formula:
 * p = 4 * ((1 - (1/3) + (1/5) - (1/7) + (1/9) - (1/11) + ...)
 * Write a program that displays the result of.
 * 4 * ((1 - (1/3) + (1/5) - (1/7) + (1/9) - (1/11))
 * and 4 * ((1 - (1/3) + (1/5) - (1/7) + (1/9) - (1/11) + (1/13))
 * Use 1.0 instead of 1 in your program.
 *
 */
public class Exercise_07_ApproximatePi {

	public static void main(String[] args) {
		
		double pi1 =  4 * ((1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
		double pi2 = 4 * ((1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11) + (1.0/13)));
		
		System.out.println(pi1);
		System.out.print(pi2);
		

	}

}
