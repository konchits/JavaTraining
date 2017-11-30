package basics;

public class SalaryCalculator {
	
	public static void main(String[] args) {
		
		// declare variables
		String career;
		
		//write programm is starting
		System.out.println("Programm is starting!");
		
		career = "Java Developer";
		
		System.out.println("My career: " + career);
		
		// define salary variables
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		
		// result
		System.out.println("Result of calculation:");
		
		System.out.println("My salary as a " + career + " at the rate of $ " + rate + " per hour is $ " + salary + " per year.");
		
		
		
	}

}
