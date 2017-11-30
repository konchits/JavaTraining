package oop;

class Person {
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
	}
	void eat() {
		System.out.println(name + " is eating");
	}
	void sleep() {
		System.out.println(name + " is sleeping");
	}
	
}

public class Demo {
	
	
	public static void main(String[] args) {
		Person person1 = new Person();
		
		person1.name = "John";
		person1.email = "john@test.test";
		person1.phone = "564679462136";
		
		person1.walk();
		person1.eat();
		person1.sleep();
		
		Person person2 = new Person();
		
		person2.name = "Sarah";
		person2.sleep();

	}

}
