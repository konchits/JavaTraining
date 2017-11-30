package basics;

public class Factorials {

	public static void main(String[] args) {
		
		//Factorials numbers
		int k = 5;
		System.out.println("The result of !" + k + " is " + fact(k));
		
		// fibonacci numbers
		int l = 9;
		System.out.println("The " + l + " Fibonacci number is " + fib(9));
		
		// min max avarage
		int[] numbers = {63, 56, 57, 49, 78, 55, 83, 60, 44, 18, 35, 87, 60, 91, 42, 92, 66, 81, 59, 73};
		System.out.println("The maximal value of array is " + max(numbers));	
		System.out.println("The average value of array is " + average(numbers));
		System.out.println("The minimal value of array is " + min(numbers));
		
		//arithmetical progression
		int h = 6;
		System.out.println("The arithmetical progression of " + h + " is " + arithme(h));
		
	}
	


	private static int arithme(int h) {
		if(h == 0) {
			return 0;
		}
		return h + arithme(h - 1);
	}



	private static int min(int[] numArray) {
		int minValue = numArray[0];
		for(int i = 1; i < numArray.length; i++) {
			if(minValue > numArray[i]) {
				minValue = numArray[i];
			}
		}
		return minValue;
	}



	private static float average(int[] numArray) {
		int sum = 0;
		for(int i = 0; i < numArray.length; i++) {
			sum = sum + numArray[i];
		}
		
		return sum / numArray.length;
		
	}



	private static int max(int[] numArray) {
		int maxValue = numArray[0];
		for(int i = 1; i < numArray.length; i++) {
			if(maxValue < numArray[i]) {
				maxValue = numArray[i];
			}
		}
		return maxValue;
	}



	static int fact(int n) {
		if (n == 0) {
			return 0;
		}
		else if (n == 1) {
			return 1;
		}
		return n * fact(n - 1);
	}
	
	static int fib(int n) {
		if(n == 0) {
			return 0;
		}
		else if(n == 1) {
			return 1;
		}
		return fib(n - 1) + fib(n - 2);
	}

}
