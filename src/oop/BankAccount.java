package oop;

public class BankAccount {
	
	// variables
	String accountNumber;
	static final String routingNumber = "5465";
	private String name;
	private String ssn;
	

	String accountType;
	double balance;
	
	// constructor
	BankAccount(){
		System.out.println("The new account created");
	}
	
	BankAccount(String accountType){
		System.out.println("The account type: " + accountType);
	}
	
	BankAccount(String accountType, double depositValue){
		System.out.print("The account type: " + accountType);
		System.out.println(". Initial deposit: $" + depositValue);
		String Msg = null;
		if(depositValue < 1000) {
			Msg = "ERROR: Minimum deposit must be at least $1,000";
		} else {
			Msg = "Thank for your initial deposit of: $" + depositValue;
			balance = balance + depositValue;
		}
		System.out.println(Msg);
	}
	
	
	// methods
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	
	void deposit(double amount) {
		balance = balance + amount;
		activity("DEPOSIT");
	}
	
	void withdraw(double amount) {
		balance = balance - amount;
		activity("WITHDRAW");
	}
	
	private void activity(String activity) {
		System.out.println("Your recent activity: " + activity);
		System.out.println("Your new balance: $" + balance);
	}
	
	void checkBalance() {
		System.out.println("Balance: $" + balance);
	}
	
	void getStatus() {
		
	}
	
	public String toString() {
		return "[ Clients name: " + name + ", Accounts number: " + accountNumber + ", Balance: $" + balance + "]";
	}

}
