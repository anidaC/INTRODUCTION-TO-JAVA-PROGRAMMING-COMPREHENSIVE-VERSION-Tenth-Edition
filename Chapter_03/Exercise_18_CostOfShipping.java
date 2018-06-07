import java.util.*;
/*
 * (Cost of shipping) A shipping company uses the following function to calculate
 * the cost (in dollars) of shipping based on the weight of the package (in
 * pounds).
 * c(w) =   3.5, if 0 < w < = 1
            5.5, if 1 < w < = 3
            8.5, if 3 < w < = 10
           10.5, if 10 < w < = 20
 * Write a program that prompts the user to enter the weight of the package and
 * display the shipping cost. If the weight is greater than 50, display a message “the
 * package cannot be shipped.”
 *
 */

public class Exercise_18_CostOfShipping {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the weight of the package (in pounds): ");
		double weight = in.nextDouble();
		
		in.close();

		if ((weight > 0) && (weight <= 1)) {
			System.out.print("Shipping cost is $3.5");
		} else if ((weight > 1) && (weight <= 3)) {
			System.out.print("Shipping cost is $5.5");
		} else if ((weight > 3) && (weight <= 10)) {
			System.out.print("Shipping cost is $8.5");
		} else if ((weight > 10) && (weight <= 20)) {
			System.out.print("Shipping cost is $10.5");
		} else
			System.out.print("The package cannot be shipped.");

	}

}
