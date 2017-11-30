package labs;

import java.util.Random;

public class RandomGenerator {

	public static void main(String[] args) {
		Random generator = new Random();
		System.out.println(generator.nextInt(9000));

	}

}
