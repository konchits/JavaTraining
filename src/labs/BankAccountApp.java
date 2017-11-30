package labs;

class BankAccount implements IInterest{
	
	//variables
	private static int iD = 1000;
	private String accountNumber;	//iD + random 2-digit number + first 2 of SSN 
	private static final String routingNumber = "002501423";
	private String name;
	private String SSN;
	private double balance;
	
	//constructor
	public BankAccount(String SSN, double initDeposit) {
		System.out.println("New Acount Created");
		iD++;
		this.SSN = SSN;
		balance = initDeposit;
		createAccountNumber();
	}
	
	private void createAccountNumber() {
		int random = (int) (Math.random() * 100);
		accountNumber = iD + "" + random + SSN.substring(0, 2);
		System.out.println("Your account number: " + accountNumber);
		System.out.println("Your current balance is: $" + balance);
		//System.out.println(SSN.substring(0, 2));
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void payBill(double amount) {
		balance = balance - amount;
		System.out.println("Pay bill: $" + amount);
		showBalance();
	}
	
	public void makeDeposit(double newDeposit) {
		balance = balance + newDeposit;
		System.out.println("Making deposit: $" + newDeposit);
		showBalance();
	}
	
	public void showBalance() {
		System.out.println("Your current balance is: $" + balance);
	}

	@Override
	public void accrue() {
		balance = balance - balance * rate/100;
		showBalance();	
	}
	
	@Override
	public String toString() {
		return "[ Name: " + name + " ]\n[ Account Number: " + accountNumber + " ]\n[ Routing Number: " + routingNumber + " ]\n[ Balance: " + balance + " ]";
	}
	

}

public class BankAccountApp {
	
	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount("321654987", 1000.342);
		BankAccount acc2 = new BankAccount("654789213", 1250);
		
		acc1.setName("Joe Johnson");
		System.out.println(acc1.getName());
		
		acc1.payBill(250.50);
		acc1.payBill(50.50);
		acc1.payBill(150.50);
		acc1.makeDeposit(2400);
		acc1.accrue();
		System.out.println(acc1.toString());
		
	}
}
