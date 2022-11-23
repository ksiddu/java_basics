package com.basu.samples;

public class FlipkartUserTest {

	String name;
	String email;

	FlipkartUserTest(String a, String b) {
		name = a;
		email = b;

	}

	void updateName(String name) { // to update name
		this.name = name;
	}


	void updateUser(FlipkartUserTest user){ // to update all variables
		// user = user2 // address1
		this.name = user.name;
		this.email = user.email;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlipkartUserTest user1 = new FlipkartUserTest("Siddu", "abc@gmail.com");
		
		FlipkartUserTest user2 = new FlipkartUserTest("navin", "navin@gmail.com");
		
		System.out.println("Before call-by-reference: " + user1.name);
		System.out.println("Before call-by-reference: " + user1.email);
		
		user1.updateName("Gavi");
		
		System.out.println("Before call-by-reference: " + user1.name); // Gavi
		System.out.println("Before call-by-reference: " + user1.email); // abc@gmail.com

		
		user1.updateUser(user2); 
		
		System.out.println("After call-by-reference: " + user1.name);
		System.out.println("After call-by-reference: " + user1.email);
	}

}
