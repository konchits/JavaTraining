package basics;

public class NumbersCalc {
	
	public static void main(String[] args) {
		System.out.println("The program is starting.");
		
		printName();
		
		//call functions with parameters
		int numA = 20;
		int numB = 30;
		
		addNumbers(numA, numB);
		
		// call function with return
		int product = multiplyNumbers(numA, numB);
		System.out.println("The product of numbers " + numA + " and " + numB + " is " + product);
		
	}
	
	static int multiplyNumbers(int valueA, int valueB) {
		
		int product = valueA * valueB;
		
		addNumbers(product + 50, product);
		
		return product;
	}

	static void addNumbers(int numberA, int numberB) {
		
		int sum = numberA + numberB;
		
		System.out.println("The sum of numbers " + numberA + " and " + numberB + " is " + sum);
		
	}

	static void printName() {
		System.out.println("My name is Oleksii");
	}
	
	

}
