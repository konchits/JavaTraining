package labs;


public class StudentDataBase {

	public static void main(String[] args) {
		
		StudentModel stud1 = new StudentModel("Tom Backer", "6541231987");
		stud1.setCity("Chicago");
		stud1.setState("Illinois");
		stud1.setPhone("55484799");
		StudentModel stud2 = new StudentModel("Sarah", "357951456");
		stud2.setCity("Salt Lake City");
		stud2.setState("Utah");
		stud2.setPhone("66987452");
		
		System.out.println(stud1.toString());
		System.out.println(stud2.toString());
		
		stud2.enroll("Java for Beginners");
		
		stud2.deposit(2000);
		stud2.enroll("Java for Beginners");
		stud2.enroll("Java. Advance course");
		
		stud2.showCourses();
				
		
	}

}
