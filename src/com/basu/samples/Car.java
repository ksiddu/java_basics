package com.basu.samples;

public class Car { // parent
	
	String color; // class instance variable
	
	Car(String color){ // Parameterized constructor
		this.color = color;
	}
	
	public void printColor() {
		System.out.println("parent object color is: " + this.color);
	}
	
	/*
	public static void main(String[] args) {
		
		Car car1 = new Car("Blue");
		car1.printColor();
		
		Car car2 = new Car("Red");
		car2.printColor();
		
	}
	*/

}

// VoterID: name,dob,gender : class
// Person1 object: name,dob, gender --> reference1
// Person2 object: name,dob, gender --> reference2
// The main benefit of inhereitance is we can use properties and methods of the parent class in a child class
