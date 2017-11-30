package exceptionsFiles;

import java.util.Scanner;

public class PaymentsApp {
	
	public static void main(String[] args) {
		double amount = 0;
		boolean negativeAmount = false;
		
		do {
			// Ask person to enter an amount
			System.out.print("Please enter a payments: ");
			Scanner in = new Scanner(System.in);
			
			// Get the amount and check the value
			try {
				amount = in.nextDouble();
				if (amount < 0) {
					throw new NegativePaymentException(amount);
				}else {
					negativeAmount = true;
				}
			} catch (NegativePaymentException e) {
				System.out.println(e.toString());
				System.out.println("Please try again");
			}
					
		} while (!negativeAmount);
		
		
		

		// Handle exceptions appropriately

		// Print confirmation
		System.out.println("Thank you for your payment $" + amount);
	}

}
