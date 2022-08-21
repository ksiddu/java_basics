package sample_test;

public class Person {

	String name; // null
	int age; // 0
	String email; // null

	// default constructor

	public Person() {
		name = "Siddu";
		age = 33;
		email = "abc@gmail.com";

	}

	// parameterised constructor
	public Person(String a, int b, String c) {
		name = a;
		age = b;
		email = c;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// using  
		Person p1 = new Person();
		
		
		System.out.println(p1.age);
		Person p6 = new Person("naveen", 27, "BE@gmail.com");
		Person p7 = new Person("Samarth", 30, "sa@gmail.com");
		
		//Class is a template/blueprint from which we can create objects
		//Object is a real time entity of class
		
	}

}
