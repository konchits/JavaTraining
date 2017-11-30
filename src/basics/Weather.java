package basics;

public class Weather {
	public static void main(String[] args) {
		
		System.out.println("The program is starting.");
		
		int temp = 18;
		String sunnyCondotion= "Sunny";
		
		if(temp > 27) {
			System.out.println("It's pleasant. Wear shorts and t-shirt");
		}
		else if (temp > 22 && sunnyCondotion == "Sunny") {
			System.out.println("It's a little coller. Perhaps wear a long-sleeve shirt and jeans.");
			System.out.println("Wear a hat to keep the sun out of your eyes");
		}
		else if (temp > 17 || sunnyCondotion == "Overcast") {
			System.out.println("This is a cool day, make sure to wear warmer clothes.");
		}
		else {
			System.out.println("Looks like a cold day. Bring a sweater.");
		}
		
		System.out.println("The program is ended.");
		
		
	}
}
