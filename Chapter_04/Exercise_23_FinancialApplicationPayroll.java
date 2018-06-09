import java.util.*;
/*
 *  (Financial application: payroll) Write a program that reads the following information and
 *  prints a payroll statement: Employee’s name (e.g., Smith) Number of hours worked in a week
 *  (e.g., 10) Hourly pay rate (e.g., 9.75) Federal tax withholding rate (e.g., 20%) State tax
 *  withholding rate (e.g., 9%) A sample run is shown below:
 *  Enter employee's name: Smith
 *  Enter number of hours worked in a week: 10
 *  Enter hourly pay rate: 9.75
 *  Enter federal tax withholding rate: 20
 *  Enter state tax withholding rate: 9
 *  
 *  Employee Name: Smith 
 *  Hours Worked: 10.0
 *  Pay Rate: $9.75 
 *  Gross Pay: $97.5 
 *  Deductions:  
 *          Federal Withholding (20.0%): $19.5 
 *          State Withholding (9.0%): $8.77 
 *          Total Deduction: $28.27
 *  Net Pay: $69.22
 *
 */
public class Exercise_23_FinancialApplicationPayroll {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter employee's name: ");
		String name = in.nextLine();

		System.out.print("Enter number of hours worked in a week: ");
		int hours = in.nextInt();

		System.out.print("Enter hourly pay rate: ");
		double hourlyRate = in.nextDouble();

		System.out.print("Enter federal tax withholding rate(in percentage): ");
		double fedTax = in.nextDouble();
		double fed = fedTax / 100;

		System.out.print("Enter state tax withholding rate(in percentage): ");
		double stateTax = in.nextDouble();
		double state = stateTax / 100;

		in.close();

		System.out.print("\nEmployee's name: " + name);
		System.out.print("\nHours worked: " + hours);
		System.out.print("\nPay rate: $" + hourlyRate);

		double grossPay = hourlyRate * hours;
		System.out.print("\nGross pay: $" + grossPay);
		System.out.print("\nDeductions: ");

		double totalFed = fed * hourlyRate * hours;
		System.out.printf("\n        Federal Withholding (" + fedTax + "): $%4.2f", totalFed);

		double totalState = state * hourlyRate * hours;
		System.out.printf("\n        State Withholding (" + stateTax + "): $%4.2f", totalState);

		double totalDeduction = totalFed + totalState;
		System.out.printf("\n        Total Deduction: $%4.2f", totalDeduction);

		double total = grossPay - totalDeduction;
		System.out.printf("\nNet Pay: $%4.2f", total);
	}

}
