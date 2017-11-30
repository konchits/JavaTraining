package basics;

public class Strings {

	public static void main(String[] args) {
		
		String bookTitle = "The Lord of Rings";
		String choiceWord = "Ring";
		
		if(bookTitle.contains(choiceWord)) {
			System.out.println("The title of book contains " + choiceWord);
		}
		
		String browserName = "Chrome";
		if (browserName.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is CHROME");
		}
		
		String firstName = "Oleksii";
		String lastName ="Konchyts";
		String SSN = "8763132163546";
		
		System.out.print(firstName.substring(0, 1));
		System.out.print(lastName.substring(0, 3));
		System.out.println(SSN.substring(8));
		
	}

}
