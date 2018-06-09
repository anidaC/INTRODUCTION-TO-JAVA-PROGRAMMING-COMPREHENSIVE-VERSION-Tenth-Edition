import java.util.Scanner;
/*
 *  (Financial application: monetary units) Rewrite Listing 2.10, ComputeChange. java, to fix the 
 *  possible loss of accuracy when converting a float value to an int value. Read the input as a string 
 *  such as "11.56". Your program should extract the dollar amount before the decimal point and the cents 
 *  after the decimal amount using the indexOf and substring methods.
 *
 */

public class Exercise_26_FinancialApplicationMonetaryUnits {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter amount in dollars (for example 11.56): ");
		String str = in.nextLine();

		in.close();

		int amount = Integer.parseInt(str.substring(0, str.indexOf('.')));
		int remainingAmount = Integer.parseInt(str.substring(str.indexOf('.') + 1, str.length()));

		if(amount == 1) {
			System.out.print(amount + " dollar");
		}
		else
		System.out.print(amount + " dollars");
		
		int quarters = remainingAmount / 25;
		if(quarters == 1) {
			System.out.print("\n" + quarters + " quarter");
		}
		else 
		System.out.print("\n" + quarters + " quarters");
		
		remainingAmount = remainingAmount % 25;
		int dimes = remainingAmount / 10;
		if(dimes == 1) {
			System.out.print("\n" + dimes + " dime");
		}
		else
		System.out.print("\n" + dimes + " dimes");
		
		remainingAmount = remainingAmount % 10;
		int nickles = remainingAmount / 5;
		if(nickles == 1) {
			System.out.print("\n" + nickles + " nickle");
		}
		else
		System.out.print("\n" + nickles + " nickles");
		
		remainingAmount = remainingAmount % 5;
		int pennies = remainingAmount;
		if(pennies == 1) {
			System.out.print("\n" + pennies + " penny");
		}
		else
		System.out.print("\n" + pennies + " pennies");

	}

}
