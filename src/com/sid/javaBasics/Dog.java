package com.sid.javaBasics;

public class Dog extends Animal {

	public String name;

	// new method in subclass
	public void display() {
		System.out.println("My name is " + name);
	}
	
	public void eat() {
		
		super.eat();
		System.out.println("I eat dog food");
	}

}
