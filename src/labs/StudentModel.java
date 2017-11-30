package labs;

import java.util.Random;

public class StudentModel {

		private String name;									//+ argument
		private String SSN;										//+ argument
		private static int iD = 2000;							//+ private static ID
		private String userID;									//+ Static ID, random 4-digit number between 1000 and 9000, and last 4 of SSN
		private static final String domain = "highschool.com";
		private String email;									//+ Automatically create an email ID based on the name
		private String phone;									//+ encapsulation
		private String city;									//+ encapsulation
		private String state;									//+ encapsulation
		private double balance = 0;
		private String courses = "";
		private static final int costOfCourse = 800;
		
		
		Random generator = new Random();
		
		public StudentModel(String name, String SSN){
			this.name = name;
			this.SSN = SSN;
			iD++;
			userID = setUserID();
			
			setEmail();
		}
		
		
		// methods
		private void setEmail() {
			char nChar;
			String fullName = "";
			for(int i = 0; i < name.length(); i++) {
				nChar = name.charAt(i);
				if(nChar == ' ') {
					fullName = fullName + ".";
				} else {
					fullName = fullName + nChar;
				}
			}
			email = fullName.toLowerCase() + "@" + domain;
		}
		
		private String setUserID() {
			
			int randNum  = generator.nextInt(9000);
			
			return "" + iD + randNum + SSN.substring(SSN.length() - 4);
		}
		
		
		
		public String toString() {
			return "[ Name: " + name + " ]\n[ SSN: " + SSN + " ]\n[ E-Mail: " + email + " ]\n[ User ID: " + 
					userID + " ]\n[ City: " + city + " ]\n[ State: " + state + " ]\n[ Phone Number: " +  phone + "]\n";
		}

		//encapsulation
		
		public String getPhone() {
			return phone;
		}


		public void setPhone(String phone) {
			this.phone = phone;
		}


		public String getCity() {
			return city;
		}


		public void setCity(String city) {
			this.city = city;
		}


		public String getState() {
			return state;
		}


		public void setState(String state) {
			this.state = state;
		}
		
		public void enroll(String courseName) {
			if(balance < costOfCourse) {
				System.out.println("\nYou have not enough money on your account!\nPlease make a new deposit.");
				checkBalance();
			} else {
				courses = courses + courseName + "\n";
				pay();
			}

		}
		
		public void deposit(double newDeposit) {
			balance = balance + newDeposit;
			checkBalance();
		}
		
		public void pay() {
			System.out.println("\nYour payment: $" + costOfCourse);
			balance = balance - costOfCourse;
			checkBalance();
		}
		
		public void checkBalance() {
			System.out.println("\nThe current Balance is: $" + balance);
		}
		
		public void showCourses() {
			System.out.println("\nThe student " + name + " enrolled for courses:" );
			System.out.println(courses);
		}
	
	
}
