package exceptionsFiles;

public class NegativePaymentException extends Exception {
	
	double payment;
	
	public NegativePaymentException(double amount) {
		payment = amount;
	}
	
	public String toString() {
		return "Error: Cannot take negative payment: " + payment;
	}
}
