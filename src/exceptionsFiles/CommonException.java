package exceptionsFiles;

public class CommonException {

	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		
		try {
			int c = a/b;
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by ZERO!");
			System.out.println(e);
		}
		
		String[] states = {"NY", "FL", "CA", "TX"};
		for (int i = 0; i <= states.length; i++ ) {
			try {
				System.out.println(states[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("ERROR: Index outside of array domain.");
				System.out.println(e);
				
			}finally {
				System.out.println("Iterating throw");
			}
			
		}
		System.out.println("The programm is closing");
	}

}
