package basics;

public class Loops {
	
	public static void main(String[] args) {
		
		//declare with size and define arrays value
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		
		// DO Loop
		System.out.println("*********** DO LOOP ************");
		int z = 0;
		do {
			System.out.println(states[z]);
			z = z + 1;
		} while (z < 5);
		
		// While Loop
		System.out.println("\n*********** WHILE LOOP ************");
		int k = 0;
		boolean stateFound = false;
		while(!stateFound) {
			String state = states[k];
			System.out.println(state);
			if(state == "Texas") {
				System.out.println("STATE FOUND!");
				stateFound = true;
			}
			k++;
		}
		
		
		// FOR Loop
		System.out.println("\n*********** FOR LOOP ************");
		for (int i = 0; i < 5; i++) {
			System.out.println(states[i]);
			
		}
		
	}

}
