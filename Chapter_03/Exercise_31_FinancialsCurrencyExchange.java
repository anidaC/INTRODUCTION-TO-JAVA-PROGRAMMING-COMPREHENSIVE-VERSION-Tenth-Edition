import java.util.*;
/*
 * (Financials: currency exchange) Write a program that prompts the user to enter
 * the exchange rate from currency in U.S. dollars to Chinese RMB. Prompt the user
 * to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert from
 * Chinese RMB and U.S. dollars. Prompt the user to enter the amount in U.S. dollars
 * or Chinese RMB to convert it to Chinese RMB or U.S. dollars, respectively.
 * Here are the sample runs:
 *            Enter the exchange rate from dollars to RMB: 6.81
 *            Enter 0 to convert dollars to RMB and 1 vice versa: 0
 *            Enter the dollar amount: 100
 *            $100.0 is 681.0 yuan
 *            Enter the exchange rate from dollars to RMB: 6.81
 *            Enter 0 to convert dollars to RMB and 1 vice versa: 1
 *            Enter the RMB amount: 10000
 *            10000.0 yuan is $1468.43  
 *            Enter the exchange rate from dollars to RMB: 6.81
 *            Enter 0 to convert dollars to RMB and 1 vice versa: 5
 *            Incorrect input                  
 *
 */

public class Exercise_31_FinancialsCurrencyExchange {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter the exchange rate from dollars to RMB: ");
		double rate = in.nextDouble();
		
		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		double convert = in.nextDouble();
		
		if (convert == 0) {
			System.out.print("Enter the dollar amount: ");
			double dollar = in.nextDouble();
			double yuan = dollar * rate;
			System.out.printf("$%1.2f is %1.2f yuan", dollar, yuan);
		} else if (convert == 1) {
			System.out.print("Enter the RMB amount: ");
			double yuan = in.nextDouble();
			double dollar = yuan / rate;
			System.out.printf("%1.2f yuan is $%1.2f", yuan, dollar);
		} else {
			System.out.print("Incorrect input!");
		}
		
		in.close();
	}

}
