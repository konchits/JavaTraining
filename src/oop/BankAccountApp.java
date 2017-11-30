package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		
		
		
		BankAccount acc5 = new BankAccount();
		acc5.setName("Tom Braker");
		System.out.println(acc5.getName());
		acc5.setSsn("54983154654");
		System.out.println("The your SSN: " + acc5.getSsn());
		
		/*BankAccount acc4 = new BankAccount();
		acc4.deposit(1500);
		acc4.deposit(1500);
		acc4.deposit(1500);
		acc4.withdraw(2000);
				
		BankAccount acc1 = new BankAccount();
		acc1.name = "John Black";
		acc1.accountNumber = "4654654313";
		acc1.balance = 5240;
		System.out.println(acc1.toString());
		
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.deposit(1500);
		acc2.deposit(1500);
		acc2.deposit(1500);
		acc2.withdraw(2000);
		
		
		BankAccount acc3 = new BankAccount("Savings Account", 2000);
		acc3.checkBalance();
		
		CDaccount cd1 = new CDaccount();
		cd1.name = "Richard Scout";
		cd1.accountNumber = "8765413";
		cd1.balance = 6345;
		cd1.interestRate = "4.5";
		System.out.println(cd1.toString());
		cd1.compount();*/
	}

}
