package exceptionsFiles;

public class exeptionsDemo {

	public static void main(String[] args) {
		System.out.println("Program is starting...");
		doMath(12, 0);
		System.out.println("Program continious..");
	}
	
	static void doMath(int a, int b) {
		
		answer(a,b);
		
	}
	
	private static double answer(int x, int y) {
		
		//catch error here
		return x/y;
	}

}
