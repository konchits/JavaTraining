package oop;

public class LoanAccount implements IRate {

	@Override
	public void setRate() {
		System.out.println("The rate is set");
		
	}

	@Override
	public void increaseRate() {
		System.out.println("The rate increased");
		
	}

	

}
